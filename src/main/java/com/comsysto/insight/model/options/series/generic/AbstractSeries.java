package com.comsysto.insight.model.options.series.generic;

import com.comsysto.insight.model.options.Type;

/**
 * Date: Feb 18, 2011 Time: 6:06:55 PM
 *
 * @author Mohammed El Batya
 */
abstract public class AbstractSeries<DataType> implements ISeries<DataType> {

  protected DataType data;
  private String name = "";
  private String stack = "";
  private Type type = Type.line;
  private Integer xAxis = 0;
  private Integer yAxis = 0;


  public AbstractSeries(String pName) {
    name = pName;
  }

  public String getName() {
    return name;
  }

  public ISeries<DataType> setName(String pName) {
    name = pName;
    return (ISeries<DataType>) this;
  }

  public String getStack() {
    return stack;
  }

  public ISeries<DataType> setStack(String pStack) {
    stack = pStack;
    return (ISeries<DataType>) this;
  }

  public Type getType() {
    return type;
  }

  public ISeries<DataType> setType(Type pType) {
    type = pType;
    return (ISeries<DataType>) this;
  }

  public Integer getXAxis() {
    return xAxis;
  }

  public ISeries<DataType> setXAxis(Integer pXAxis) {
    xAxis = pXAxis;
    return (ISeries<DataType>) this;
  }

  public Integer getYAxis() {
    return yAxis;
  }

  public ISeries<DataType> setYAxis(Integer pYAxis) {
    yAxis = pYAxis;
    return (ISeries<DataType>) this;
  }

  public DataType getData() {
    return data;
  }

}
