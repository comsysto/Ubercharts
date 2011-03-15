package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.ChartType;

/**
 * This is a shorthand for {@code new Chart(Type.bar)} or {@code new Chart().setDefaultSeriesType(Type.bar)}.
 * <p/>
 * Date: Feb 18, 2011
 * Time: 3:15:35 PM
 *
 * @author Mohammed El Batya
 * @see Chart
 */
public class BarChart extends Chart {

    public BarChart() {
        super(ChartType.bar);
    }
}
