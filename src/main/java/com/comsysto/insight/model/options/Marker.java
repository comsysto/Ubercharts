package com.comsysto.insight.model.options;


public class Marker {

  private final Boolean enabled;
  private final String fillColor;
  private final String lineColor;
  private final Integer lineWidth;
  private final Integer radius;

  // not supported
  //states: {},

  private final String symbol;


  private Marker(Builder builder) {
    this.enabled = builder.enabled;
    this.fillColor = builder.fillColor;
    this.lineColor = builder.lineColor;
    this.lineWidth = builder.lineWidth;
    this.radius = builder.radius;
    this.symbol = builder.symbol;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public String getFillColor() {
    return fillColor;
  }

  public String getLineColor() {
    return lineColor;
  }

  public Integer getLineWidth() {
    return lineWidth;
  }

  public Integer getRadius() {
    return radius;
  }

  public String getSymbol() {
    return symbol;
  }


  public static class Builder {

    // optional
    private Boolean enabled = Boolean.TRUE;
    private String fillColor;
    private String lineColor = "#FFFFFF";
    private Integer lineWidth = 0;
    private Integer radius = 0;
    //states: {},
    private String symbol; // (URL to PNG)

    public Builder() {
    }

    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    public Builder fillColor(String fillColor) {
      this.fillColor = fillColor;
      return this;
    }

    public Builder lineColor(String lineColor) {
      this.lineColor = lineColor;
      return this;
    }

    public Builder lineWidth(Integer lineWidth) {
      this.lineWidth = lineWidth;
      return this;
    }

    public Builder radius(Integer radius) {
      this.radius = radius;
      return this;
    }

    public Builder symbol(String symbol) {
      this.symbol = symbol;
      return this;
    }

    public Marker build() {
      return new Marker(this);
    }
  }

}