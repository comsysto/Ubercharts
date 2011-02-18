package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.Type;

/**
 * This is a shorthand for new Chart(Type.column).
 * <p/>
 * Date: Feb 18, 2011
 * Time: 3:05:47 PM
 *
 * @author Mohammed El Batya
 */
public class ColumnChart extends Chart {

  public ColumnChart() {
    super(Type.column);
  }
}
