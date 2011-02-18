package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Map;

/**
 * Date: Feb 18, 2011
 * Time: 9:11:09 PM
 *
 * @author Mohammed El Batya
 */
public class CoordinateSeries extends AbstractSeries<Map<? extends Number, ? extends Number>, CoordinateSeries> {

  public CoordinateSeries(String pName) {
    super(pName);
  }
}
