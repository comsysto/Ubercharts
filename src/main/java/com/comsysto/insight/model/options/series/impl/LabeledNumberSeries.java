package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Map;

/**
 * Date: Feb 18, 2011
 * Time: 9:47:09 PM
 *
 * @author Mohammed El Batya
 */
public class LabeledNumberSeries extends AbstractSeries<Map<String, ? extends Number>, LabeledNumberSeries> {

  public LabeledNumberSeries(String pName) {
    super(pName);
  }
}
