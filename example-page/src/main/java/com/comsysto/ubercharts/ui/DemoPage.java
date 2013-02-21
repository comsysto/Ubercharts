package com.comsysto.ubercharts.ui;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.ubercharts.api.*;
import com.comsysto.ubercharts.ui.model.PieChartModel;
import com.comsysto.ubercharts.ui.panel.PieChartPanel;
import com.google.common.collect.ImmutableList;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.AjaxSelfUpdatingTimerBehavior;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.time.Duration;

/**
 * @author Daniel Bartl
 */
public class DemoPage extends WebPage {

    public DemoPage() {
        add(pieChart());
    }

    private HighchartsPanel pieChart() {
        return new PieChartPanel(
                "pieChart", new PieChartModel());
    }
}
