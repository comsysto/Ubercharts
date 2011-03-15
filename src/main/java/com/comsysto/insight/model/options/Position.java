package com.comsysto.insight.model.options;

public class Position {

    private Align mAlign;
    private VerticalAlign mVerticalAlign;
    private Integer mX;
    private Integer mY;

    public Position() {
    }

    public Position(Align pAlign) {
        mAlign = pAlign;
    }

    public Position(Align pAlign, VerticalAlign pVerticalAlign) {
        mAlign = pAlign;
        mVerticalAlign = pVerticalAlign;
    }

    public Position(Align pAlign, VerticalAlign pVerticalAlign, Integer pX, Integer pY) {
        mAlign = pAlign;
        mVerticalAlign = pVerticalAlign;
        mX = pX;
        mY = pY;
    }

    public Align getAlign() {
        return mAlign;
    }

    public Position setAlign(Align pAlign) {
        mAlign = pAlign;
        return this;
    }

    public VerticalAlign getVerticalAlign() {
        return mVerticalAlign;
    }

    public Position setVerticalAlign(VerticalAlign pVerticalAlign) {
        mVerticalAlign = pVerticalAlign;
        return this;
    }

    public Integer getX() {
        return mX;
    }

    public Position setX(Integer pX) {
        mX = pX;
        return this;
    }

    public Integer getY() {
        return mY;
    }

    public Position setY(Integer pY) {
        mY = pY;
        return this;
    }
}