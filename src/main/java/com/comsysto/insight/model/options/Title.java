package com.comsysto.insight.model.options;

import java.util.HashMap;
import java.util.Map;

public class Title {

  private final Align align;
  private final Boolean floating;
  private final Integer margin;
  private final String text;
  private final Map<String, String> style;
  private final VerticalAlign verticalAlign;
  private final Integer x;
  private final Integer y;

  public Title(String pTitle) {
    this(new Builder().text(pTitle));
  }

  private Title(Builder builder) {
    this.align = builder.align;
    this.floating = builder.floating;
    this.margin = builder.margin;
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

  public Integer getMargin() {
    return margin;
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
    private Integer margin = 15;
    private String text = "Chart title";
    private Map<String, String> style;
    private VerticalAlign verticalAlign = VerticalAlign.top;
    private Integer x = 0;
    private Integer y = 25;

    public Builder() {
      style = new HashMap<String, String>();
      style.put("color", "#3E576F");
      style.put("fontSize", "16px");
    }

    public Builder align(Align align) {
      this.align = align;
      return this;
    }

    public Builder floating(Boolean floating) {
      this.floating = floating;
      return this;
    }

    public Builder margin(Integer margin) {
      this.margin = margin;
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

    public Title build() {
      return new Title(this);
    }
  }

}