package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;
import com.comsysto.insight.model.options.series.generic.ISeries;

import java.util.Collection;

/**
 * Date: Feb 18, 2011
 * Time: 9:11:26 PM
 *
 * @author Mohammed El Batya
 */
public class NumberSeries extends AbstractSeries<Number[]> {

  public NumberSeries(String pName) {
    super(pName);
  }

  public ISeries<Number[]> setData(Number[] pNumbers) {
    data = pNumbers;
    return this;
  }

  public ISeries<Number[]> setData(Collection<Number> pNumbers) {
    return setData((Number[]) pNumbers.toArray());
  }
}
