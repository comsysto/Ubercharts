package com.comsysto.insight.model.options;

import java.util.List;

public class Series {

  private final List<?> data;
  private final String name;
  private final String stack;
  private final Type type;
  private final Integer xAxis;
  private final Integer yAxis;

  private Series(Builder builder) {
    this.data = builder.data;
    this.name = builder.name;
    this.stack = builder.stack;
    this.type = builder.type;
    this.xAxis = builder.xAxis;
    this.yAxis = builder.yAxis;
  }

  public List<?> getData() {
    return data;
  }

  public String getName() {
    return name;
  }

  public String getStack() {
    return stack;
  }

  public Type getType() {
    return type;
  }

  public Integer getxAxis() {
    return xAxis;
  }

  public Integer getyAxis() {
    return yAxis;
  }


  public static class Builder {

    // optional
    private List<?> data;
    private String name = "";
    private String stack;
    private Type type = Type.line;
    private Integer xAxis = 0;
    private Integer yAxis = 0;

    public Builder() {
    }

    public Builder data(List<?> data) {
      this.data = data;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder stack(String stack) {
      this.stack = stack;
      return this;
    }

    public Builder type(Type type) {
      this.type = type;
      return this;
    }

    public Builder xAxis(Integer xAxis) {
      this.xAxis = xAxis;
      return this;
    }

    public Builder yAxis(Integer yAxis) {
      this.yAxis = yAxis;
      return this;
    }

    public Series build() {
      return new Series(this);
    }
  }

}