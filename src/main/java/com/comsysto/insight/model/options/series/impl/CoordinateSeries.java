package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Map;
import java.util.Set;

/**
 * Implementation of {@link CoordinateSeries} which represents an array of X/Y-Coordinates to be plotted on the chart.
 *
 * For more information read href="http://www.highcharts.com/ref/#series.
 *
 * Date: Feb 18, 2011 Time: 9:11:09 PM
 *
 * @author Mohammed El Batya
 */
public class CoordinateSeries extends AbstractSeries<Number[][]> {

  /** {@link AbstractSeries#AbstractSeries()} */
  public CoordinateSeries() {
  }

  /** {@link AbstractSeries#AbstractSeries(String)} */
  public CoordinateSeries(String pName) {
    super(pName);
  }


  /**
   * Sets a two-dimensional array of X/Y-Coordinates to be plotted on the chart.
   *
   * The second dimension of the array must have the length of 2, to represent X/Y coordinate.
   *
   * @param coordinates an array of X/Y-Coordinates to be plotted on the chart
   *
   * @return this object for convenient chaining, not a copy
   */
  public CoordinateSeries setData(Number[][] coordinates) {
    data = coordinates;
    return this;
  }

  /**
   * Sets two arrays to represent X and Y values for coordinates to be plotted on the chart. Both array must have the
   * same length or an {@link IllegalArgumentException} will be thrown. Every X-Value will be paired with a Y-Value,
   * stored at the same array index.
   *
   * @param pXValues an array representing the X-Values
   * @param pYValues an array representing the Y-Values
   *
   * @return this object for convenient chaining, not a copy
   * @throws IllegalArgumentException
   */
  public CoordinateSeries setData(Number[] pXValues, Number[] pYValues) {


    if (pXValues.length == pYValues.length) {

      Number[][] array = new Number[pXValues.length][2];

      for (int i = 0; i < pXValues.length; i++) {
        array[i][0] = pXValues[i];
        array[i][1] = pYValues[i];
      }

      return setData(array);
    }
    else {
      throw new IllegalArgumentException("The arrays for X and Y values must have the same length, but they have the length X("
        + pXValues.length + ") and Y(" + pYValues.length + ")");
    }

  }

  /**
   * Sets a map of X/Y values to represent coordinates to be plotted on the chart. The key will be treated as X-value
   * and the value as Y-value.
   *
   * @param pCoordinates a map of X/Y values to represent coordinates to be plotted on the chart
   *
   * @return this object for convenient chaining, not a copy
   */
  public CoordinateSeries setData(Map<Number, Number> pCoordinates) {

    Set<Map.Entry<Number, Number>> entries = pCoordinates.entrySet();

    Number[] xValues = new Number[entries.size()];
    Number[] yValues = new Number[entries.size()];

    int i = 0;
    for (Map.Entry<Number, Number> e : entries) {
      xValues[i] = e.getKey();
      yValues[i] = e.getValue();
      i++;
    }

    return setData(xValues, yValues);
  }
}
