package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Map;

/**
 * Date: Feb 18, 2011
 * Time: 9:11:09 PM
 *
 * @author Mohammed El Batya
 */
public class CoordinateSeries extends AbstractSeries<Number[][], CoordinateSeries> {

  public CoordinateSeries(String pName) {
    super(pName);
  }


  public CoordinateSeries setData(Number[][] coordinates) {
    data = coordinates;
    return this;
  }

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

  public CoordinateSeries setData(Map<Number, Number> pCoordinates) {

    Number[] xValues = (Number[]) (pCoordinates.keySet()).toArray();
    Number[] yValues = (Number[]) (pCoordinates.entrySet()).toArray();

    return setData(xValues, yValues);
  }
}
