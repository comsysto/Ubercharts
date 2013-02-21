package com.comsysto.ubercharts.ui.panel;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.ubercharts.ui.socket.Message;
import com.comsysto.ubercharts.ui.socket.MessageType;
import com.comsysto.ubercharts.ui.socket.UpdateTask;
import org.apache.wicket.protocol.ws.api.IWebSocketConnection;
import org.apache.wicket.protocol.ws.api.WebSocketBehavior;
import org.apache.wicket.model.IModel;
import org.apache.wicket.protocol.ws.api.message.ConnectedMessage;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.introspect.JacksonAnnotationIntrospector;

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
}