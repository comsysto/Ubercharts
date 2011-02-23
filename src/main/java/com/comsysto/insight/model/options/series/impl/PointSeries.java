package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.Point;
import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Collection;

/**
 * Implementation of {@link AbstractSeries}, which represents an array of {@link Point}s to be plotted on the chart.
 *
 * Date: Feb 18, 2011 Time: 9:47:50 PM
 *
 * @author Mohammed El Batya
 * @see Point
 */
public class PointSeries extends AbstractSeries<Point[]> {

  /** {@link AbstractSeries#AbstractSeries()} */
  public PointSeries() {
  }

  /** {@link AbstractSeries#AbstractSeries(String)} */
  public PointSeries(String pName) {
    super(pName);
  }


  /**
   * Sets an array of {@link Point}s to this series to be plotted on the chart.
   *
   * @param pPoints an array of {@link Point}s
   *
   * @return this object for convenient chaining, not a copy
   * @see Point
   */
  public PointSeries setData(Point[] pPoints) {
    data = pPoints;
    return this;
  }


  /**
   * Sets an {@link Collection} of {@link Point}s to this series to be plotted on the chart.
   *
   * @param pPoints an {@link Collection} of {@link Point}s
   *
   * @return this object for convenient chaining, not a copy
   * @see Point
   */
  public PointSeries setData(Collection<Point> pPoints) {
    return setData((Point[]) pPoints.toArray());
  }
}
