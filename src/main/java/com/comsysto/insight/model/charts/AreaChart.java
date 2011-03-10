package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.Type;

/**
 * This is a shorthand for {@code new Chart(Type.area)} or {@code new Chart().setDefaultSeriesType(Type.area)}.
 * <p/>
 * Date: Feb 18, 2011
 * Time: 3:10:11 PM
 *
 * @author Mohammed El Batya
 * @see Chart
 */
public class AreaChart extends Chart {

    public AreaChart() {
        super(Type.area);
    }
}
