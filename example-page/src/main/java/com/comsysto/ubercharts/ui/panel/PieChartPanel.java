package com.comsysto.ubercharts.ui.panel;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.ubercharts.ui.socket.Message;
import com.comsysto.ubercharts.ui.socket.MessageType;
import org.apache.wicket.Application;
import org.apache.wicket.protocol.ws.api.IWebSocketConnection;
import org.apache.wicket.protocol.ws.api.IWebSocketConnectionRegistry;
import org.apache.wicket.protocol.ws.api.SimpleWebSocketConnectionRegistry;
import org.apache.wicket.protocol.ws.api.WebSocketBehavior;
import org.apache.wicket.model.IModel;
import org.apache.wicket.protocol.ws.api.message.ConnectedMessage;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: alentolj
 * Date: 20.02.13
 * Time: 14:16
 * To change this template use File | Settings | File Templates.
 */
public class PieChartPanel extends HighchartsPanel {

    private Map<String, Number> chartData;


    public PieChartPanel(String id, IModel<Highchart> highchartsModel) {
        super(id, highchartsModel);
        add(new ChartUpdatingBehavior());
        chartData = new HashMap<String, Number>(8);

//        objectMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector());
    }

    private class ChartUpdatingBehavior extends WebSocketBehavior {
        @Override
        protected void onConnect(ConnectedMessage message) {
            super.onConnect(message);

            // create an asynchronous task that will write the data to the client
            UpdateTask updateTask = new UpdateTask(message.getApplication(), message.getSessionId(), message.getPageId()) {
                @Override
                protected void updateFunction(IWebSocketConnection connection) throws IOException {
                    ObjectMapper objectMapper = new ObjectMapper();
                    Map<String,Number> trackingEvents = getUpdatedChartData();
                    Message<Map<String,Number> > message =
                            new Message<Map<String,Number> >(MessageType.PIE_CHART_UPDATE,
                                    "", trackingEvents);
                    String json = objectMapper.writeValueAsString(message);
                    connection.sendMessage(json);
                }
            };
            UpdateTask clearTask = new UpdateTask(message.getApplication(), message.getSessionId(), message.getPageId()) {
                @Override
                protected void updateFunction(IWebSocketConnection connection) throws IOException {
                    connection.sendMessage("true");
                }
            };
            //Executors.newSingleThreadExecutor().submit(updateTask);
            Executors.newScheduledThreadPool(1).schedule(updateTask, 1, TimeUnit.SECONDS);
            Executors.newScheduledThreadPool(1).schedule(clearTask, 1, TimeUnit.SECONDS);
    }
}

    private Map<String, Number> getUpdatedChartData() {
        chartData.put("Jazz", 1);
        chartData.put("Blues", 1);
        chartData.put("Raggae", 1);
        chartData.put("Rock", 1);
        chartData.put("Electronic", 1);
        chartData.put("Drum & Bass", 1);
        chartData.put("R&B", 1);
        chartData.put("Hip Hop", 1);
        return chartData;
    }

    protected abstract class UpdateTask implements Runnable {
        /**
         * The following fields are needed to be able to lookup the IWebSocketConnection from
         * SimpleWebSocketConnectionRegistry
         */
        private final String applicationName;
        private final String sessionId;

        private final int pageId;

        protected UpdateTask(Application application, String sessionId, int pageId) {
            this.applicationName = application.getName();
            this.sessionId = sessionId;
            this.pageId = pageId;
        }

        @Override
        public void run() {
            IWebSocketConnectionRegistry webSocketConnectionRegistry = new SimpleWebSocketConnectionRegistry();

            while (true) {
                Application application = Application.get(applicationName);
                IWebSocketConnection connection = webSocketConnectionRegistry.getConnection(application, sessionId, pageId);
                if (connection == null || !connection.isOpen()) {
                    // stp if the web socket connection is closed
                    return;
                }

                try {
                    updateFunction(connection);

                    // sleep for a while to simulate work
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception x) {
                    x.printStackTrace();
                    return;
                }
            }
        }

        protected abstract void updateFunction(IWebSocketConnection connection) throws IOException;
    }
}