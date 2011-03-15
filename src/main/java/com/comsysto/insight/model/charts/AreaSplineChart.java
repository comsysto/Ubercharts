package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.ChartType;

/**
 * This is a shorthand for {@code new Chart(Type.areaspline)} or {@code new Chart().setDefaultSeriesType(Type.areaspline)}.
 * <p/>
 * Date: Feb 18, 2011
 * Time: 3:15:05 PM
 *
 * @author Mohammed El Batya
 * @see Chart
 */
public class AreaSplineChart extends Chart {

    public AreaSplineChart() {
        super(ChartType.areaspline);
    }
}
