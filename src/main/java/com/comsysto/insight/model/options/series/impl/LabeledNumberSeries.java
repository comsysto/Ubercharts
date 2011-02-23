package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.security.InvalidParameterException;
import java.util.Map;

/**
 * Date: Feb 18, 2011
 * Time: 9:47:09 PM
 *
 * @author Mohammed El Batya
 */
public class LabeledNumberSeries extends AbstractSeries<Object[][]> {

  public LabeledNumberSeries(String pName) {
    super(pName);
  }

  public LabeledNumberSeries setData(Object[][] pData) {
    for (int i = 0; i < pData.length; i++) {
      if (pData[i].length != 2) {
        throw new InvalidParameterException("Invalid DataSet: All entries of the second dimension must have the length " +
          "of 2 in order to represent Label-Number pairs.");
      }
      if (!(pData[i][0] instanceof String && pData[i][1] instanceof Number)) {
        throw new InvalidParameterException("Invalid DataSet: All entries must consist of String-Number pairs.");
      }
    }

    data = pData;
    return this;
  }

  public LabeledNumberSeries setData(String[] pLabels, Number[] pYValues) {

    if (pLabels.length == pYValues.length) {
      Object[][] array = new Object[pLabels.length][2];

      for (int i = 0; i < pLabels.length; i++) {
        array[i][0] = pLabels[i];
        array[i][1] = pYValues[i];
      }

      setData(array);
      return this;
    }
    else {
      throw new IllegalArgumentException("The arrays for labels and Y values must have the same length, but they have " +
        "the length labels(" + pLabels.length + ") and Y(" + pYValues.length + ")");
    }


  }

  public LabeledNumberSeries setData(Map<String, Number> pLabeledNumbers) {

    String[] labels = (String[]) (pLabeledNumbers.keySet()).toArray();
    Number[] yValues = (Number[]) (pLabeledNumbers.entrySet()).toArray();

    return setData(labels, yValues);
  }
}
