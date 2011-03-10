package com.comsysto.insight.model.options;

public class Position {

    private Align fAlign;
    private VerticalAlign fVerticalAlign;
    private Integer fX;
    private Integer fY;

    public Position() {
    }

    public Position(Align pAlign) {
        fAlign = pAlign;
    }

    public Position(Align pAlign, VerticalAlign pVerticalAlign) {
        fAlign = pAlign;
        fVerticalAlign = pVerticalAlign;
    }

    public Position(Align pAlign, VerticalAlign pVerticalAlign, Integer pX, Integer pY) {
        fAlign = pAlign;
        fVerticalAlign = pVerticalAlign;
        fX = pX;
        fY = pY;
    }

    public Align getAlign() {
        return fAlign;
    }

    public Position setAlign(Align pAlign) {
        fAlign = pAlign;
        return this;
    }

    public VerticalAlign getVerticalAlign() {
        return fVerticalAlign;
    }

    public Position setVerticalAlign(VerticalAlign pVerticalAlign) {
        fVerticalAlign = pVerticalAlign;
        return this;
    }

    public Integer getX() {
        return fX;
    }

    public Position setX(Integer pX) {
        fX = pX;
        return this;
    }

    public Integer getY() {
        return fY;
    }

    public Position setY(Integer pY) {
        fY = pY;
        return this;
    }
}