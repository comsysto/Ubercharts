package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.Type;

/**
 * This is a shorthand for new Chart(Type.bar).
 * <p/>
 * Date: Feb 18, 2011
 * Time: 3:15:35 PM
 *
 * @author Mohammed El Batya
 */
public class BarChart extends Chart {

  public BarChart() {
    super(Type.bar);
  }
}
