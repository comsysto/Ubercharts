package com.comsysto.insight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highcharts;
import com.comsysto.insight.model.Series;
import com.comsysto.insight.model.Type;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
	public HomePage(final PageParameters parameters) {

		Highcharts hc = new Highcharts();
		hc.chart.setType(Type.line);

		List<String> categories = new ArrayList<String>();
		categories.add("Jan");
		categories.add("Feb");
		categories.add("Mar");
		categories.add("Apr");
		categories.add("Mai");
		categories.add("Jun");
		hc.xAxis.setCategories(categories);

		Series.Builder builder = new Series.Builder();

		Series a = builder.name("Birnen").data(Arrays.asList(7.0, 6.9, 9.5, 6.6, 8.2, 5.9)).build();
		Series b = builder.name("Äpfel").data(Arrays.asList(-0.2, 0.8, 4.4, 2.3, 1.3, 0.3)).build();
		Series c = builder.name("Bananen").data(Arrays.asList(3.9, 4.2, 5.7, 7.5, -2.9, 2.3)).build();

		hc.series.addAll(Arrays.asList(a, b, c));

		// Add Panel
		add(new HighchartsPanel("chart", hc));
	}
}
