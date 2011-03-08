package com.comsysto.insight;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.model.charts.*;
import com.comsysto.insight.model.options.Credits;
import com.comsysto.insight.model.options.Point;
import com.comsysto.insight.model.options.Subtitle;
import com.comsysto.insight.model.options.Title;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.*;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;

import java.util.ArrayList;
import java.util.List;

/** Homepage */
public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that is invoked when page is invoked without a session.
     *
     * @param parameters Page parameters
     */
    public HomePage(final PageParameters parameters) {


        List<String> categories = new ArrayList<String>();
        categories.add("Jan");
        categories.add("Feb");
        categories.add("Mar");
        categories.add("Apr");
        categories.add("Mai");
        categories.add("Jun");

        Credits credits = new Credits("comSysto GmbH").setHref("http://www.comsysto.com");

        ISeries a = new NumberSeries("Number").setData(new Number[]{7.0, 6.9, 9.5, 10.2, 12.2, 13.9});

        ISeries b = new MixedSeries("Mixed").setData(new Object[]{-0.2, 0.8, 4.4, new Object[]{"max", 50}, new Integer[]{4, 1}});

        ISeries c = new LabeledNumberSeries("LabeledNumber").setData(new Object[][]{new Object[]{"max", 20}, new Object[]{"min", -5}});

        ISeries d = new CoordinateSeries("Coords").setData(new Number[]{3.9, 4.2, 5.7, 7.5, 2.3}, new Number[]{3.9, 4.2, 5.7, 7.5, 2.3});

        ISeries e = new PointSeries("Points").setData(new Point[]{new Point(1, 5), new Point(3, 4), new Point(6, 7)});

        Highchart highchart1 = new Highchart(new AreaChart(), a, c, d, e);
        highchart1.setTitle(new Title("AreaChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart2 = new Highchart(new AreaSplineChart(), a, c, d, e);
        highchart2.setTitle(new Title("AreaSplineChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart3 = new Highchart(new BarChart(), a, c, d, e);
        highchart3.setTitle(new Title("BarChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart4 = new Highchart(new ColumnChart(), a, c, d, e);
        highchart4.setTitle(new Title("ColumnChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart5 = new Highchart(new LineChart(), a, c, d, e);
        highchart5.setTitle(new Title("LineChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart6 = new Highchart(new PieChart(), a, c, d, e);
        highchart6.setTitle(new Title("PieChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart7 = new Highchart(new ScatterChart(), a, c, d, e);
        highchart7.setTitle(new Title("ScatterChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart8 = new Highchart(new SplineChart(), a, c, d, e);
        highchart8.setTitle(new Title("SplineChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart9 = new Highchart(new LineChart(), b);
        highchart9.setTitle(new Title("LineChart")).setSubtitle(new Subtitle("Mixed Series")).setCredits(credits).getXAxis().setCategories(categories);


        // Add Panel
        add(new HighchartsPanel("chart1", highchart1));
        add(new HighchartsPanel("chart2", highchart2));
        add(new HighchartsPanel("chart3", highchart3));
        add(new HighchartsPanel("chart4", highchart4));
        add(new HighchartsPanel("chart5", highchart5));
        add(new HighchartsPanel("chart6", highchart6));
        add(new HighchartsPanel("chart7", highchart7));
        add(new HighchartsPanel("chart8", highchart8));
        add(new HighchartsPanel("chart9", highchart9));
    }


}


