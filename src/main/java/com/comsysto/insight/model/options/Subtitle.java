package com.comsysto.insight.model.options;

import java.util.Map;

public class Subtitle {

    private Align fAlign;
    private Boolean fFloating;
    private String fText;
    private Map<String, String> fStyle;
    private VerticalAlign fVerticalAlign;
    private Integer fX;
    private Integer fY;

    public Subtitle(String pText) {
        fText = pText;
    }

    public Align getAlign() {
        return fAlign;
    }

    public Subtitle setAlign(Align pAlign) {
        fAlign = pAlign;
        return this;
    }

    public Boolean getFloating() {
        return fFloating;
    }

    public Subtitle setFloating(Boolean pFloating) {
        fFloating = pFloating;
        return this;
    }

    public String getText() {
        return fText;
    }

    public Subtitle setText(String pText) {
        fText = pText;
        return this;
    }

    public Map<String, String> getStyle() {
        return fStyle;
    }

    public Subtitle setStyle(Map<String, String> pStyle) {
        fStyle = pStyle;
        return this;
    }

    public VerticalAlign getVerticalAlign() {
        return fVerticalAlign;
    }

    public Subtitle setVerticalAlign(VerticalAlign pVerticalAlign) {
        fVerticalAlign = pVerticalAlign;
        return this;
    }

    public Integer getX() {
        return fX;
    }

    public Subtitle setX(Integer pX) {
        fX = pX;
        return this;
    }

    public Integer getY() {
        return fY;
    }

    public Subtitle setY(Integer pY) {
        fY = pY;
        return this;
    }
}
