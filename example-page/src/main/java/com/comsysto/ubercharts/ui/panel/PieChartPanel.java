package com.comsysto.ubercharts.ui.panel;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.ubercharts.ui.model.types.IMusikTypeGenre;
import com.comsysto.ubercharts.ui.model.types.MusikGenre;
import com.comsysto.ubercharts.ui.socket.Message;
import com.comsysto.ubercharts.ui.socket.MessageType;
import org.apache.wicket.Application;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.protocol.ws.api.*;
import org.apache.wicket.model.IModel;
import org.apache.wicket.protocol.ws.api.message.ConnectedMessage;
import org.apache.wicket.protocol.ws.api.message.TextMessage;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    private MusikGenre selectedType = MusikGenre.ROCK;

    private Map<MusikGenre, String[]> musikGenreMap;

    public PieChartPanel(String id, IModel<Highchart> highchartsModel) {
        super(id, highchartsModel);
        musikGenreMap = new HashMap<MusikGenre, String[]>();
        setProductCategories();
        add(new ChartUpdatingBehavior());
        add(getWebSocketBehaviorForClicks());
//        setProductCategories();

    }

    private Behavior getWebSocketBehaviorForClicks() {
        return new WebSocketBehavior() {
            @Override
            protected void onMessage(WebSocketRequestHandler handler, TextMessage message) {
                try {
                    ObjectMapper objectMapper = new ObjectMapper();
                    Message<String> parsedMsg = objectMapper.readValue(message.getText(), new TypeReference<Message<String>>() {
                    });
                    if (parsedMsg.getType() == MessageType.PRODUCT_COLUMN_LEGEND_CLICK)
                        selectedType = MusikGenre.valueOf(parsedMsg.getDataName().toUpperCase());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public Number[] getDownloads() {
        Number[] downloads = new Number[musikGenreMap.get(selectedType).length];
        for(int i = 0; i < musikGenreMap.get(selectedType).length; i++){
            downloads[i] = getRandom();

        }
        return downloads;
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
                    Message<Number[] > message = new Message<Number[]>(MessageType.PIE_CHART_UPDATE,
                                    selectedType.getName(), getDownloads());
                    String json = objectMapper.writeValueAsString(message);
                    connection.sendMessage(json);
                }
            };
            UpdateTask updateCategoriesTask = new UpdateTask(message.getApplication(), message.getSessionId(), message.getPageId()) {
                @Override
                protected void updateFunction(IWebSocketConnection connection) throws IOException {

                    ObjectMapper objectMapper = new ObjectMapper();
                    Message<String[]> message = new Message<String[]>(MessageType.PRODUCT_COLUMN_GENRE_UPDATE,
                            selectedType.name(), musikGenreMap.get(selectedType));
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

            Executors.newScheduledThreadPool(1).schedule(updateCategoriesTask, 1, TimeUnit.SECONDS);
            Executors.newScheduledThreadPool(1).schedule(updateTask, 1, TimeUnit.SECONDS);
            Executors.newScheduledThreadPool(1).schedule(clearTask, 1, TimeUnit.SECONDS);

    }
}

    private void setProductCategories() {

        setGenreDetail(MusikGenre.URBAN, MusikGenre.Urban.values());
        setGenreDetail(MusikGenre.BLUES_JAZZ, MusikGenre.BluesJazz.values());
        setGenreDetail(MusikGenre.ELECTRONIC, MusikGenre.Electronic.values());
        setGenreDetail(MusikGenre.POP, MusikGenre.Pop.values());
        setGenreDetail(MusikGenre.ROCK, MusikGenre.Rock.values());
    }

    private void setGenreDetail(MusikGenre musikGenre,IMusikTypeGenre[] genreType) {

        List<String> categorie = new ArrayList<String>(MusikGenre.values().length);
        for (IMusikTypeGenre type : genreType) {
            categorie.add(type.getName());
        }
        musikGenreMap.put(musikGenre, categorie.toArray(new String[MusikGenre.values().length]));
    }

    private Number getRandom() {
        return 10;
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