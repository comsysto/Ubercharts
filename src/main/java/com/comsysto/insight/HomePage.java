package com.comsysto.insight;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.model.charts.LineChart;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.CoordinateSeries;
import com.comsysto.insight.model.options.series.impl.LabeledNumberSeries;
import com.comsysto.insight.model.options.series.impl.MixedSeries;
import com.comsysto.insight.model.options.series.impl.NumberSeries;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;

/**
 * Homepage
 */
public class HomePage extends WebPage {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor that is invoked when page is invoked without a session.
   *
   * @param parameters Page parameters
   */
  public HomePage(final PageParameters parameters) {

    Highchart pHighchart = new Highchart(new LineChart());

    /* List<String> categories = new ArrayList<String>();
    categories.add("Jan");
    categories.add("Feb");
    categories.add("Mar");
    categories.add("Apr");
    categories.add("Mai");
    categories.add("Jun");
    pHighchart.getXAxis().setCategories(categories);  */


    ISeries a = new NumberSeries("Number").setData(new Number[]{7.0, 6.9, 9.5, 10.2, 12.2, 13.9});

    ISeries b = new MixedSeries("Mixed").setData(new Object[]{-0.2, 0.8, 4.4, new Integer[]{3, 3}, new Object[]{"max", 50}});

    ISeries c = new LabeledNumberSeries("LabeledNumber").setData(new Object[][]{new Object[]{"max", 20}, new Object[]{"min", -5}});

    ISeries d = new CoordinateSeries("Coords").setData(new Number[]{3.9, 4.2, 5.7, 7.5, 2.3}, new Number[]{3.9, 4.2, 5.7, 7.5, 2.3});


    pHighchart.addSeries(a, b, c, d);

    // Add Panel
    add(new HighchartsPanel("chart", pHighchart));
  }


}


