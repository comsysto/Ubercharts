package com.comsysto.insight.model.options;

/**
 * Date: Feb 18, 2011 Time: 9:44:10 PM
 *
 * @author Mohammed El Batya
 */
public class Point {

    private String color;
    private String id;
    private String name;
    private boolean sliced;
    private Number x;
    private Number y;

    public Point(Number pX, Number pY) {
        x = pX;
        y = pY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSliced() {
        return sliced;
    }

    public void setSliced(boolean sliced) {
        this.sliced = sliced;
    }

    public Number getX() {
        return x;
    }

    public void setX(Number x) {
        this.x = x;
    }

    public Number getY() {
        return y;
    }

    public void setY(Number y) {
        this.y = y;
    }
}
