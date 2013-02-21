package com.comsysto.ubercharts.ui.socket;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * User: lleovac
 * Date: 1/17/13

 */
@JsonSerialize
public class Message<DATA> implements Serializable {
    private MessageType type;

    private String dataName;

    private DATA data;

    public Message() {

    }

    public Message(MessageType type, String dataName, DATA data) {
        this.type = type;
        this.data = data;
        this.dataName=dataName;
    }

    public MessageType getType() {
        return type;
    }

    public DATA getData() {
        return data;
    }

    public String getDataName() {
        return dataName;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public void setData(DATA data) {
        this.data = data;
    }


}
