package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Collection;

/**
 * Date: Feb 18, 2011
 * Time: 9:11:26 PM
 *
 * @author Mohammed El Batya
 */
public class NumberSeries extends AbstractSeries<Collection<? extends Number>, NumberSeries> {

  public NumberSeries(String pName) {
    super(pName);
  }
}
