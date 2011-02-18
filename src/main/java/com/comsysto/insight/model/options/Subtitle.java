package com.comsysto.insight.model.options;

import java.util.HashMap;
import java.util.Map;

public class Subtitle {

  private final Align align;
  private final Boolean floating;
  private final String text;
  private final Map<String, String> style;
  private final VerticalAlign verticalAlign;
  private final Integer x;
  private final Integer y;

  private Subtitle(Builder builder) {
    this.align = builder.align;
    this.floating = builder.floating;
    this.text = builder.text;
    this.style = builder.style;
    this.verticalAlign = builder.verticalAlign;
    this.x = builder.x;
    this.y = builder.y;
  }

  public Align getAlign() {
    return align;
  }

  public Boolean getFloating() {
    return floating;
  }

  public String getText() {
    return text;
  }

  public Map<String, String> getStyle() {
    return style;
  }

  public VerticalAlign getVerticalAlign() {
    return verticalAlign;
  }

  public Integer getX() {
    return x;
  }

  public Integer getY() {
    return y;
  }


  public static class Builder {

    // optional
    private Align align = Align.center;
    private Boolean floating = Boolean.FALSE;
    private String text = "";
    private Map<String, String> style;
    private VerticalAlign verticalAlign = VerticalAlign.top;
    private Integer x = 0;
    private Integer y = 40;

    public Builder() {
      style = new HashMap<String, String>();
      style.put("color", "#3E576F");
    }

    public Builder align(Align align) {
      this.align = align;
      return this;
    }

    public Builder floating(Boolean floating) {
      this.floating = floating;
      return this;
    }

    public Builder text(String text) {
      this.text = text;
      return this;
    }

    public Builder style(Map<String, String> style) {
      this.style = style;
      return this;
    }

    public Builder verticalAlign(VerticalAlign verticalAlign) {
      this.verticalAlign = verticalAlign;
      return this;
    }

    public Builder x(Integer x) {
      this.x = x;
      return this;
    }

    public Builder y(Integer y) {
      this.y = y;
      return this;
    }

    public Subtitle build() {
      return new Subtitle(this);
    }
  }

}
