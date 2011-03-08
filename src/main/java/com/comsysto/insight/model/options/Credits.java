package com.comsysto.insight.model.options;

import java.util.Map;


public class Credits {

    private Boolean enabled;
    private Position position;
    private String href;
    private Map<String, String> style;
    private String text;

    private Credits(String pText) {
        this.enabled = true;
        this.text = pText;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Credits setEnabled(Boolean pEnabled) {
        enabled = pEnabled;
        return this;
    }

    public Position getPosition() {
        return position;
    }

    public Credits setPosition(Position pPosition) {
        position = pPosition;
        return this;
    }

    public String getHref() {
        return href;
    }

    public Credits setHref(String pHref) {
        href = pHref;
        return this;
    }

    public Map<String, String> getStyle() {
        return style;
    }

    public Credits setStyle(Map<String, String> pStyle) {
        style = pStyle;
        return this;
    }

    public String getText() {
        return text;
    }

    public Credits setText(String pText) {
        text = pText;
        return this;
    }
}