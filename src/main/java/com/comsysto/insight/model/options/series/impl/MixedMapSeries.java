package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Map;

/**
 * Date: Feb 18, 2011
 * Time: 9:50:40 PM
 *
 * @author Mohammed El Batya
 */
public class MixedMapSeries extends AbstractSeries<Map<? extends Object, ? extends Object>, MixedMapSeries> {

  public MixedMapSeries(String pName) {
    super(pName);
  }
}
