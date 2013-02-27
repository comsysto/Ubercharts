package com.comsysto.ubercharts.ui.panel;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.ubercharts.ui.model.types.MusikGenre;
import com.comsysto.ubercharts.ui.socket.Message;
import com.comsysto.ubercharts.ui.socket.MessageType;
import com.comsysto.ubercharts.ui.socket.UpdateTask;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.protocol.ws.api.*;
import org.apache.wicket.model.IModel;
import org.apache.wicket.protocol.ws.api.message.ConnectedMessage;
import org.apache.wicket.protocol.ws.api.message.TextMessage;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * User: alentolj
 * Date: 20.02.13
 */
public class DownloadsChartPanel extends HighchartsPanel {

    private MusikGenre selectedType = MusikGenre.ROCK;

    private Map<MusikGenre, String[]> musikGenreMap;

    private Map<MusikGenre, Number[]> downloads;


    public DownloadsChartPanel(String id, IModel<Highchart> highchartsModel) {
        super(id, highchartsModel);
        setCategories();
        initDownloads();
        add(new ChartUpdatingBehavior());
        add(getWebSocketBehaviorForClicks());

    }

    private void initDownloads() {
        downloads = new HashMap<MusikGenre, Number[]>(MusikGenre.values().length);
        for (MusikGenre musikGenre : MusikGenre.values()){
            Number[] initialDownloads = new Number[4];
            downloads.put(musikGenre, initialDownloads);
        }
    }

    private Behavior getWebSocketBehaviorForClicks() {
        return new WebSocketBehavior() {
            @Override
            protected void onMessage(WebSocketRequestHandler handler, TextMessage message) {
                try {
                    ObjectMapper objectMapper = new ObjectMapper();
                    Message<String> parsedMsg = objectMapper.readValue(message.getText(),
                            new TypeReference<Message<String>>() {});
                    if (parsedMsg.getType() == MessageType.GENRE_UPDATE){
                        selectedType = MusikGenre.valueOf(parsedMsg.getDataName().toUpperCase());
                        Message<String[]> msg = new Message<String[]>(MessageType.CATEGORIES_UPDATE,
                                selectedType.name(), musikGenreMap.get(selectedType));
                        String json = objectMapper.writeValueAsString(msg);
                        handler.push(json);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public Number[] getDownloads() {
        Number[] categoryDownloads = downloads.get(selectedType);
        for(int i = 0; i < musikGenreMap.get(selectedType).length; i++){
            if(categoryDownloads[i] == null)
                categoryDownloads[i] = 1;
            else
                categoryDownloads[i] = categoryDownloads[i].intValue() + getRandom().intValue();

        }
        return categoryDownloads;
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
                    Message<Number[] > message = new Message<Number[]>(MessageType.SERIES_UPDATE,
                                    selectedType.name(), getDownloads());
                    String json = objectMapper.writeValueAsString(message);
                    connection.sendMessage(json);
                }
            };
            Executors.newScheduledThreadPool(1).schedule(updateTask, 1, TimeUnit.SECONDS);

    }
}

    private void setCategories() {
        musikGenreMap = new HashMap<MusikGenre, String[]>();
        musikGenreMap.put(MusikGenre.URBAN,new String[]{"R&B", "Rap", "Soul", "Hip Hop"});
        musikGenreMap.put(MusikGenre.BLUES,new String[]{"Jazz", "Latin Jazz", "Blues Rock", "Blues"});
        musikGenreMap.put(MusikGenre.ELECTRONIC,new String[]{"House","Minimal","Brum & Bass","Techno"});
        musikGenreMap.put(MusikGenre.POP,new String[]{"Indie Pop","Ballads","Acoustic","New Wave"});
        musikGenreMap.put(MusikGenre.ROCK,new String[]{"Hard Rock", "Classic Rock", "Rock & Roll", "Punk"});
    }


    private Number getRandom() {
        return new Random().nextInt(4);
    }


}