package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.Type;

/**
 * This is a shorthand for {@code new Chart(Type.spline)} or {@code new Chart().setDefaultSeriesType(Type.spline)}.
 * <p/>
 * Date: Feb 18, 2011
 * Time: 3:06:22 PM
 *
 * @author Mohammed El Batya
 * @see Chart
 */
public class SplineChart extends Chart {

    public SplineChart() {
        super(Type.spline);
    }
}
