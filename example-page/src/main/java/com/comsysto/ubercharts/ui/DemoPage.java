package com.comsysto.ubercharts.ui;

import com.comsysto.ubercharts.api.*;
import com.google.common.collect.ImmutableList;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

/**
 * @author Daniel Bartl
 */
public class DemoPage extends WebPage {

    public DemoPage() {

        final Highcharts highcharts = new Highcharts();
        highcharts.chart.type = Type.line;
        highcharts.chart.backgroundColor = "#FCFFC5";
        highcharts.series(Series.newSeries().data(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 3, 4}).name("Example Series"));
        highcharts.xAxis.categories = ImmutableList.of("Mo", "Di", "Mi", "Do", "Fr");

        highcharts.credits.enabled = true;
        highcharts.credits.href = "http://www.comsysto.com";
        highcharts.credits.position.align = Align.right;
        highcharts.credits.position.verticalAlign = VerticalAlign.middle;
        highcharts.credits.position.x = 0;
        highcharts.credits.position.y = 0;
        highcharts.credits.text = "comSysto GmbH";

        highcharts.labels.label().withText("First label").placeAt(100, 100);
        highcharts.labels.label().withText("Second label").placeAt(50, 50);
        highcharts.labels.label().withText("Third label").placeAt(150, 150);

        highcharts.legend.align = Align.center;
        highcharts.legend.verticalAlign = VerticalAlign.middle;
        highcharts.legend.floating = true;
        highcharts.legend.x = 10;
        highcharts.legend.y = 10;


        final Chart chart = new Chart("chart", Model.of(highcharts));
        //chart.add(new AjaxSelfUpdatingTimerBehavior(Duration.seconds(5)));

        final AjaxLink<Void> link = new AjaxLink<Void>("link") {

            @Override
            public void onClick(AjaxRequestTarget target) {

                highcharts.chart.polar = !highcharts.chart.polar;

                target.add(chart);

            }
        };

        add(link);

        add(chart);

    }
}
