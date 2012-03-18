package com.comsysto.insight;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.model.charts.AreaChart;
import com.comsysto.insight.model.options.ChartTitle;
import com.comsysto.insight.model.options.Credits;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.NumberSeries;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zutherb
 */
public class HighchartsPanelTest {

    private WicketTester wicketTester;

    @Before
    public void setup(){
        wicketTester = new WicketTester(new WicketApplication());
    }

    @Test
    public void testRender(){
        wicketTester.startComponentInPage(new HighchartsPanel("panel", Model.of(createHighChart())));
        wicketTester.assertComponent("panel", HighchartsPanel.class);
    }

    private Highchart createHighChart() {
        String[] categories = new String[]{"Jan", "Feb", "Mar", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Credits credits = new Credits("comSysto GmbH").setHref("http://www.comsysto.com");

        ISeries<Number []> a = new NumberSeries("Number").setData(new Number[]{7.0, 6.9, 9.5, 10.2, 12.2, 13.9});

        Highchart highchart1 = new Highchart(new AreaChart(), a);
        highchart1.setTitle(new ChartTitle("AreaChart")).setCredits(credits).getXAxis().setCategories(categories);
        return highchart1;
    }
}
