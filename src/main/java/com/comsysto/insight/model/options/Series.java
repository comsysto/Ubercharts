package com.comsysto.insight.model.options;

import java.util.List;

/**
 * Date: Feb 18, 2011
 * Time: 6:06:55 PM
 *
 * @author Mohammed El Batya
 */
public class Series {

  private List<?> data;
  private String name = "";
  private String stack = "";
  private Type type = Type.line;
  private Integer xAxis = 0;
  private Integer yAxis = 0;


  public Series(String pName) {
    name = pName;
  }

  public String getName() {
    return name;
  }

  public Series setName(String pName) {
    name = pName;
    return this;
  }

  public String getStack() {
    return stack;
  }

  public Series setStack(String pStack) {
    stack = pStack;
    return this;
  }

  public Type getType() {
    return type;
  }

  public Series setType(Type pType) {
    type = pType;
    return this;
  }

  public Integer getxAxis() {
    return xAxis;
  }

  public Series setxAxis(Integer pXAxis) {
    xAxis = pXAxis;
    return this;
  }

  public Integer getyAxis() {
    return yAxis;
  }

  public Series setyAxis(Integer pYAxis) {
    yAxis = pYAxis;
    return this;
  }

  public List<?> getData() {
    return data;
  }

  public Series setData(List<?> pData) {
    data = pData;
    return this;
  }
}
