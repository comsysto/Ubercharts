package com.comsysto.insight.model.options.series.generic;

import com.comsysto.insight.model.options.Type;

/**
 * Abstract implementation of ISeries, implementing all needed methods, except for {@link ISeries#setData(Object)}. You
 * should not need to implement this class by your own as the existing implementations should cover all possible
 * variations supported by Highcharts.
 *
 * Date: Feb 18, 2011 Time: 6:06:55 PM
 *
 * @author Mohammed El Batya
 * @see ISeries
 * @see com.comsysto.insight.model.options.series.impl.CoordinateSeries
 * @see com.comsysto.insight.model.options.series.impl.LabeledNumberSeries
 * @see com.comsysto.insight.model.options.series.impl.MixedSeries
 * @see com.comsysto.insight.model.options.series.impl.NumberSeries
 * @see com.comsysto.insight.model.options.series.impl.PointSeries
 */
abstract public class AbstractSeries<DataType> implements ISeries<DataType> {

  /** {@link ISeries#getData()} */
  protected DataType data = null;

  /** {@link ISeries#getName()} */
  private String name = "";

  /** {@link ISeries#getStack()} */
  private String stack = "";

  /** {@link ISeries#getType()} */
  private Type type = Type.line;

  /** {@link ISeries#getXAxis()} */
  private Integer xAxis = 0;

  /** {@link ISeries#getYAxis()} */
  private Integer yAxis = 0;

  /**
   * Default Constructor for this series.
   *
   * Everything is set to its default value.
   */
  public AbstractSeries() {
  }

  /**
   * Constructor, which sets the name for this series. Everything else is set to its default value.
   *
   * @param pName the name for this series
   *
   * @see #setName(String)
   */
  public AbstractSeries(String pName) {
    name = pName;
  }

  /** {@link ISeries#getName()} */
  public String getName() {
    return name;
  }

  /** {@link ISeries#setName(String)} */
  public ISeries<DataType> setName(String pName) {
    name = pName;
    return (ISeries<DataType>) this;
  }

  /** {@link ISeries#getStack()} */
  public String getStack() {
    return stack;
  }

  /** {@link ISeries#setStack(String)} */
  public ISeries<DataType> setStack(String pStack) {
    stack = pStack;
    return (ISeries<DataType>) this;
  }

  /** {@link ISeries#getType()} */
  public Type getType() {
    return type;
  }

  /** {@link ISeries#setType(com.comsysto.insight.model.options.Type) } */
  public ISeries<DataType> setType(Type pType) {
    type = pType;
    return (ISeries<DataType>) this;
  }

  /** {@link ISeries#getXAxis()} */
  public Integer getXAxis() {
    return xAxis;
  }

  /** {@link ISeries#setXAxis(Integer)} */
  public ISeries<DataType> setXAxis(Integer pXAxis) {
    xAxis = pXAxis;
    return (ISeries<DataType>) this;
  }

  /** {@link ISeries#getYAxis()} */
  public Integer getYAxis() {
    return yAxis;
  }

  /** {@link ISeries#setYAxis(Integer)} */
  public ISeries<DataType> setYAxis(Integer pYAxis) {
    yAxis = pYAxis;
    return (ISeries<DataType>) this;
  }

  /** {@link ISeries#getData()} */
  public DataType getData() {
    return data;
  }

}
