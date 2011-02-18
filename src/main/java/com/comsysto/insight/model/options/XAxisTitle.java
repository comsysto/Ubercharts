package com.comsysto.insight.model.options;

import java.util.Map;

/**
 * Date: Feb 18, 2011
 * Time: 10:49:54 PM
 *
 * @author Mohammed El Batya
 */
public class XAxisTitle {

  private Align align;
  private String text;
  private Map<String, String> style;
  private Integer margin;
  private Integer rotation;

  public Align getAlign() {
    return align;
  }

  public void setAlign(Align align) {
    this.align = align;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Map<String, String> getStyle() {
    return style;
  }

  public void setStyle(Map<String, String> style) {
    this.style = style;
  }

  public Integer getMargin() {
    return margin;
  }

  public void setMargin(Integer margin) {
    this.margin = margin;
  }

  public Integer getRotation() {
    return rotation;
  }

  public void setRotation(Integer rotation) {
    this.rotation = rotation;
  }
}


