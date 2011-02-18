package com.comsysto.insight.model.options;

public class Position {

  private final Align align;
  private final Integer x;
  private final VerticalAlign verticalAlign;
  private final Integer y;

  private Position(Builder builder) {
    this.align = builder.align;
    this.x = builder.x;
    this.verticalAlign = builder.verticalAlign;
    this.y = builder.y;
  }

  public Align getAlign() {
    return align;
  }

  public Integer getX() {
    return x;
  }

  public VerticalAlign getVerticalAlign() {
    return verticalAlign;
  }

  public Integer getY() {
    return y;
  }

  public static class Builder {

    // optional
    private Align align = Align.right;
    private Integer x = 10;
    private VerticalAlign verticalAlign = VerticalAlign.bottom;
    private Integer y = -5;

    public Builder() {
    }

    public Builder align(Align align) {
      this.align = align;
      return this;
    }

    public Builder x(Integer x) {
      this.x = x;
      return this;
    }

    public Builder verticalAlign(VerticalAlign verticalAlign) {
      this.verticalAlign = verticalAlign;
      return this;
    }

    public Builder y(Integer y) {
      this.y = y;
      return this;
    }

    public Position build() {
      return new Position(this);
    }
  }

}