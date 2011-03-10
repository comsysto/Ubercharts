package com.comsysto.insight.model.charts;

import com.comsysto.insight.model.options.Type;

/**
 * This is a shorthand for {@code new Chart(Type.pie)} or {@code new Chart().setDefaultSeriesType(Type.pie)}.
 * <p/>
 * Date: Feb 18, 2011
 * Time: 3:16:01 PM
 *
 * @author Mohammed El Batya
 * @see Chart
 */
public class PieChart extends Chart {

    public PieChart() {
        super(Type.pie);
    }
}
