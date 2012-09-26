package com.comsysto.insight.model.options;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * @author zutherb
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class Series implements Serializable {
    private static final long serialVersionUID = -517145988398000617L;

    private String cursor;
    private Events events;
    private DataLabels dataLabels;
    private Stacking stacking;

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public Series setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public void setStacking(Stacking stacking) {
        this.stacking = stacking;
    }

    public Stacking getStacking() {
        return stacking;
    }
}
