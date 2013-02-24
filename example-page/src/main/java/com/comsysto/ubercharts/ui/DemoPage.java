package com.comsysto.ubercharts.ui;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.ubercharts.ui.model.DownloadChartModel;
import com.comsysto.ubercharts.ui.panel.DownloadsChartPanel;
import org.apache.wicket.markup.html.WebPage;

/**
 * @author Daniel Bartl
 */
public class DemoPage extends WebPage {

    public DemoPage() {
        add(downloadsChart());
    }

    private HighchartsPanel downloadsChart() {
        return new DownloadsChartPanel(
                "downloadsChart", new DownloadChartModel());
    }
}
