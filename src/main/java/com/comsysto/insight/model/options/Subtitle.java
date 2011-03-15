package com.comsysto.insight.model.options;

import java.util.Map;

public class Subtitle extends BasicTitle {

    private Boolean mFloating;
    private VerticalAlign mVerticalAlign;
    private Integer mX;
    private Integer mY;


    public Subtitle(String pText) {
        super(pText);
    }

    public Subtitle(String pText, Align pAlign, Map<String, String> pStyle) {
        super(pText, pAlign, pStyle);
    }

    public Boolean getFloating() {
        return mFloating;
    }

    public Subtitle setFloating(Boolean pFloating) {
        mFloating = pFloating;
        return this;
    }


    public VerticalAlign getVerticalAlign() {
        return mVerticalAlign;
    }

    public Subtitle setVerticalAlign(VerticalAlign pVerticalAlign) {
        mVerticalAlign = pVerticalAlign;
        return this;
    }

    public Integer getX() {
        return mX;
    }

    public Subtitle setX(Integer pX) {
        mX = pX;
        return this;
    }

    public Integer getY() {
        return mY;
    }

    public Subtitle setY(Integer pY) {
        mY = pY;
        return this;
    }
}
