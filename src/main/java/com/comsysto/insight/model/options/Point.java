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

}
