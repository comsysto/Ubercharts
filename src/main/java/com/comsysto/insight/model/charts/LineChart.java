package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.Type;

/**
 * This is a shorthand for new Chart(Type.line).
 * <p/>
 * Date: Feb 18, 2011
 * Time: 3:05:29 PM
 *
 * @author Mohammed El Batya
 */
public class LineChart extends Chart {

  public LineChart() {
    super(Type.line);
  }
}
