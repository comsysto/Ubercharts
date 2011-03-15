package com.comsysto.insight.model.options;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 15/03/2011
 * Time: 18:58
 * To change this template use File | Settings | File Templates.
 */
class BasicLabel {
    private Align mAlign;
    private Integer mRotation;
    private Map<String, String> mStyle;
    private Integer mX;
    private Integer mY;

    public Align getAlign() {
        return mAlign;
    }

    public BasicLabel setAlign(Align pAlign) {
        mAlign = pAlign;
        return this;
    }


    public Integer getRotation() {
        return mRotation;
    }

    public BasicLabel setRotation(Integer pRotation) {
        mRotation = pRotation;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public BasicLabel setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }

    public Integer getX() {
        return mX;
    }

    public BasicLabel setX(Integer pX) {
        mX = pX;
        return this;
    }

    public Integer getY() {
        return mY;
    }

    public BasicLabel setY(Integer pY) {
        mY = pY;
        return this;
    }
}
