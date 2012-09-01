package com.comsysto.ubercharts.ui;

import com.comsysto.ubercharts.api.Highcharts;
import com.comsysto.ubercharts.api.Series;
import com.comsysto.ubercharts.api.Type;
import com.google.common.collect.ImmutableList;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

/**
 * @author Daniel Bartl
 */
public class TestPage extends WebPage {

    public TestPage() {

        final Highcharts highcharts = new Highcharts();
        highcharts.chart.type = Type.line;
        highcharts.chart.backgroundColor = "#FCFFC5";
        highcharts.series(Series.newSeries().data(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 3, 4}).name("Example Series"));
        highcharts.xAxis.categories = ImmutableList.of("Mo", "Di", "Mi", "Do", "Fr");


        final Chart chart = new Chart("chart", Model.of(highcharts));
        //chart.add(new AjaxSelfUpdatingTimerBehavior(Duration.seconds(5)));

        final AjaxLink<Void> link = new AjaxLink<Void>("link") {

            @Override
            public void onClick(AjaxRequestTarget target) {

                if (highcharts.chart.polar) {

                    highcharts.chart.polar = false;


                } else {

                    highcharts.chart.polar = true;

                }

                target.add(chart);

            }
        };

        add(link);

        add(chart);

    }
}
