package com.comsysto.insight.model.options;

import java.util.Map;

public class Labels {

  private Align align;// "center",
  private Boolean enabled;// true,

  // not supported
  //formatter: ,

  private Integer rotation;// 0,
  private Integer staggerLines;
  private Integer step;
  private Map<String, String> style;
  private Integer x;// 0,
  private Integer y;// 0


  public Align getAlign() {
    return align;
  }

  public void setAlign(Align align) {
    this.align = align;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Integer getRotation() {
    return rotation;
  }

  public void setRotation(Integer rotation) {
    this.rotation = rotation;
  }

  public Integer getStaggerLines() {
    return staggerLines;
  }

  public void setStaggerLines(Integer staggerLines) {
    this.staggerLines = staggerLines;
  }

  public Integer getStep() {
    return step;
  }

  public void setStep(Integer step) {
    this.step = step;
  }

  public Map<String, String> getStyle() {
    return style;
  }

  public void setStyle(Map<String, String> style) {
    this.style = style;
  }

  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

}