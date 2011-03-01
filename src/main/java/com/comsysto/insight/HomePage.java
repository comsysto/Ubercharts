package com.comsysto.insight;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.model.charts.AreaChart;
import com.comsysto.insight.model.charts.AreaSplineChart;
import com.comsysto.insight.model.charts.BarChart;
import com.comsysto.insight.model.charts.ColumnChart;
import com.comsysto.insight.model.charts.LineChart;
import com.comsysto.insight.model.charts.PieChart;
import com.comsysto.insight.model.charts.ScatterChart;
import com.comsysto.insight.model.charts.SplineChart;
import com.comsysto.insight.model.options.Point;
import com.comsysto.insight.model.options.Title;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.CoordinateSeries;
import com.comsysto.insight.model.options.series.impl.LabeledNumberSeries;
import com.comsysto.insight.model.options.series.impl.NumberSeries;
import com.comsysto.insight.model.options.series.impl.PointSeries;
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


    ISeries a = new NumberSeries("Number").setData(new Number[]{7.0, 6.9, 9.5, 10.2, 12.2, 13.9});

    //ISeries b = new MixedSeries("Mixed").setData(new Object[]{-0.2, 0.8, 4.4, new Integer[]{3, 3}, new Object[]{"max", 50}});

    ISeries c = new LabeledNumberSeries("LabeledNumber").setData(new Object[][]{new Object[]{"max", 20}, new Object[]{"min", -5}});

    ISeries d = new CoordinateSeries("Coords").setData(new Number[]{3.9, 4.2, 5.7, 7.5, 2.3}, new Number[]{3.9, 4.2, 5.7, 7.5, 2.3});

    ISeries e = new PointSeries("Points").setData(new Point[]{new Point(1, 5), new Point(3, 4), new Point(6, 7)});

    Highchart highchart1 = new Highchart(new AreaChart());
    highchart1.addSeries(a, c, d, e).setTitle(new Title("AreaChart")).getXAxis().setCategories(categories);

    Highchart highchart2 = new Highchart(new AreaSplineChart());
    highchart2.addSeries(a, c, d, e).setTitle(new Title("AreaSplineChart")).getXAxis().setCategories(categories);

    Highchart highchart3 = new Highchart(new BarChart());
    highchart3.addSeries(a, c, d, e).setTitle(new Title("BarChart")).getXAxis().setCategories(categories);

    Highchart highchart4 = new Highchart(new ColumnChart());
    highchart4.addSeries(a, c, d, e).setTitle(new Title("ColumnChart")).getXAxis().setCategories(categories);

    Highchart highchart5 = new Highchart(new LineChart());
    highchart5.addSeries(a, c, d, e).setTitle(new Title("LineChart")).getXAxis().setCategories(categories);

    Highchart highchart6 = new Highchart(new PieChart());
    highchart6.addSeries(a, c, d, e).setTitle(new Title("PieChart")).getXAxis().setCategories(categories);

    Highchart highchart7 = new Highchart(new ScatterChart());
    highchart7.addSeries(a, c, d, e).setTitle(new Title("ScatterChart")).getXAxis().setCategories(categories);

    Highchart highchart8 = new Highchart(new SplineChart());
    highchart8.addSeries(a, c, d, e).setTitle(new Title("SplineChart")).getXAxis().setCategories(categories);


    // Add Panel
    add(new HighchartsPanel("chart1", highchart1));
    add(new HighchartsPanel("chart2", highchart2));
    add(new HighchartsPanel("chart3", highchart3));
    add(new HighchartsPanel("chart4", highchart4));
    add(new HighchartsPanel("chart5", highchart5));
    add(new HighchartsPanel("chart6", highchart6));
    add(new HighchartsPanel("chart7", highchart7));
    add(new HighchartsPanel("chart8", highchart8));
  }


}


