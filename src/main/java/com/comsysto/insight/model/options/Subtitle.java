package com.comsysto.insight.model.options;

import java.util.Map;

public class Subtitle extends BasicTitle {

    private Boolean fFloating;
    private VerticalAlign fVerticalAlign;
    private Integer fX;
    private Integer fY;


    public Subtitle(String pText) {
        super(pText);
    }

    public Subtitle(String pText, Align pAlign, Map<String, String> pStyle) {
        super(pText, pAlign, pStyle);
    }

    public Boolean getFloating() {
        return fFloating;
    }

    public Subtitle setFloating(Boolean pFloating) {
        fFloating = pFloating;
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
