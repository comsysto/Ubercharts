package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.Type;

/**
 * This is a shorthand for new Chart(Type.scatter).
 * <p/>
 * Date: Feb 18, 2011
 * Time: 3:15:49 PM
 *
 * @author Mohammed El Batya
 */
public class ScatterChart extends Chart {

  public ScatterChart() {
    super(Type.scatter);
  }
}
