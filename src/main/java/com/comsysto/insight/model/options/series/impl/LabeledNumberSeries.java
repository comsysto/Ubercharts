package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.Set;

/**
 * Implementation of {@link AbstractSeries} which represents an array of Label/Y-Pairs to be plotted on the chart. The
 * corresponding X-Values will be automatically calculated by Highcharts, counting from 0 on.
 *
 * For example: If you set the Y-Values to new Integer[]{2,6,9}, Highcharts will plot the points (0/2), (1/6) and
 * (2/9).
 *
 * The label will be used as a caption for the actual point on the chart.
 *
 * For more information read href="http://www.highcharts.com/ref/#series.
 *
 * Date: Feb 18, 2011 Time: 9:47:09 PM
 *
 * @author Mohammed El Batya
 */
public class LabeledNumberSeries extends AbstractSeries<Object[][]> {

  /** {@link AbstractSeries#AbstractSeries()} */
  public LabeledNumberSeries() {
  }

  /** {@link AbstractSeries#AbstractSeries(String)} */
  public LabeledNumberSeries(String pName) {
    super(pName);
  }


  /**
   * Sets a two-dimensional array of Label/Y-Pairs to be plotted on the chart. The corresponding X-Values will be
   * automatically calculated by Highcharts, counting from 0 on.
   *
   * The second dimension of the array must have the length of 2, to represent Label/Y pairs. Additionally the first
   * field of the second dimension must be a String value representing the label. The second field must be an instance
   * of {@link Number}. If that is not the case, an {@link InvalidParameterException} will be thrown.
   *
   * @param pData a two-dimensional array of Label/Y-Pairs
   *
   * @return this object for convenient chaining, not a copy
   * @throws InvalidParameterException
   * @see LabeledNumberSeries
   */
  public LabeledNumberSeries setData(Object[][] pData) {
    for (int i = 0; i < pData.length; i++) {
      if (!(pData[i][0] instanceof String && pData[i][1] instanceof Number)) {
        throw new InvalidParameterException("Invalid DataSet: All entries must consist of String-Number pairs.");
      }
    }

    data = pData;
    return this;
  }

  /**
   * Sets two arrays to represent labels and Y values for coordinates to be plotted on the chart. Both array must have
   * the same length or an {@link IllegalArgumentException} will be thrown. Every y-Value will be paired with a label,
   * stored at the same array index. The corresponding X-Values will be automatically calculated by Highcharts, counting
   * from 0 on.
   *
   * @param pLabels  an array representing the labels
   * @param pYValues an array representing the Y-Values
   *
   * @return this object for convenient chaining, not a copy
   */
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

  /**
   * Sets two arrays to represent Labels and Y values for coordinates to be plotted on the chart. Both arrays must have
   * the same length or an {@link IllegalArgumentException} will be thrown. Every X-Value will be paired with a label,
   * stored at the same array index. The corresponding X-Values will be automatically calculated by Highcharts, counting
   * from 0 on.
   *
   * @param pLabeledNumbers a map representing label/y-pairs
   *
   * @return this object for convenient chaining, not a copy
   */
  public LabeledNumberSeries setData(Map<String, Number> pLabeledNumbers) {

    Set<Map.Entry<String, Number>> entries = pLabeledNumbers.entrySet();

    String[] labels = new String[entries.size()];
    Number[] yValues = new Number[entries.size()];

    int i = 0;
    for (Map.Entry<String, Number> e : entries) {
      labels[i] = e.getKey();
      yValues[i] = e.getValue();
      i++;
    }

    return setData(labels, yValues);
  }
}
