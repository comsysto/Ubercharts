package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Collection;

/**
 * Date: Feb 18, 2011
 * Time: 9:50:16 PM
 *
 * @author Mohammed El Batya
 */
public class MixedSeries extends AbstractSeries<Collection<? extends Object>, MixedSeries> {

  public MixedSeries(String pName) {
    super(pName);
  }
}
