package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.Point;
import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Arrays;
import java.util.Collection;

/**
 * Date: Feb 18, 2011
 * Time: 9:47:50 PM
 *
 * @author Mohammed El Batya
 */
public class PointSeries extends AbstractSeries<Point[], PointSeries> {

  public PointSeries(String pName) {
    super(pName);
  }

  public PointSeries setData(Point[] pPoints) {
    return setData(Arrays.asList(pPoints));
  }

  public PointSeries setData(Collection<Point> pPoints) {
    return setData((Point[]) pPoints.toArray());
  }
}
