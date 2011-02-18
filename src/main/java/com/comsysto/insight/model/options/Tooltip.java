package com.comsysto.insight.model.options;

import java.util.Map;


public class Tooltip {

  // Caution: no support for gradient
  private final String backgroundColor;
  private final String borderColor;
  private final Integer borderRadius;
  private final Integer borderWidth;

  // CAUTION: not supported
  // crosshairs

  private final Boolean enabled;

  // CAUTION: not supported
  //formatter

  private final Boolean shadow;
  private final Boolean shared;
  private final Integer snap;
  private final Map<String, String> style;


  private Tooltip(Builder builder) {
    this.backgroundColor = builder.backgroundColor;
    this.borderColor = builder.borderColor;
    this.borderRadius = builder.borderRadius;
    this.borderWidth = builder.borderWidth;
    this.enabled = builder.enabled;
    this.shadow = builder.shadow;
    this.shared = builder.shared;
    this.snap = builder.snap;
    this.style = builder.style;
  }


  public String getBackgroundColor() {
    return backgroundColor;
  }

  public String getBorderColor() {
    return borderColor;
  }

  public Integer getBorderRadius() {
    return borderRadius;
  }

  public Integer getBorderWidth() {
    return borderWidth;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public Boolean getShadow() {
    return shadow;
  }

  public Boolean getShared() {
    return shared;
  }

  public Integer getSnap() {
    return snap;
  }

  public Map<String, String> getStyle() {
    return style;
  }


  public static class Builder {

    // optional
    private String backgroundColor;
    private String borderColor = "auto";
    private Integer borderRadius = 5;
    private Integer borderWidth = 2;
    private Boolean enabled = true;
    private Boolean shadow = true;
    private Boolean shared = false;
    private Integer snap = 10;
    private Map<String, String> style;

    public Builder() {
    }

    public Builder backgroundColor(String backgroundColor) {
      this.backgroundColor = backgroundColor;
      return this;
    }

    public Builder borderColor(String borderColor) {
      this.borderColor = borderColor;
      return this;
    }

    public Builder borderRadius(Integer borderRadius) {
      this.borderRadius = borderRadius;
      return this;
    }

    public Builder borderWidth(Integer borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }

    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    public Builder shadow(Boolean shadow) {
      this.shadow = shadow;
      return this;
    }

    public Builder shared(Boolean shared) {
      this.shared = shared;
      return this;
    }

    public Builder snap(Integer snap) {
      this.snap = snap;
      return this;
    }

    public Builder style(Map<String, String> style) {
      this.style = style;
      return this;
    }

    public Tooltip build() {
      return new Tooltip(this);
    }
  }
}