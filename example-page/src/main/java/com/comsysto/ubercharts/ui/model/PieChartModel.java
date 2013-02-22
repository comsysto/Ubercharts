package com.comsysto.ubercharts.ui.model;

import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.model.charts.BarChart;
import com.comsysto.insight.model.charts.PieChart;
import com.comsysto.insight.model.options.*;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.LabeledNumberSeries;
import com.comsysto.insight.model.options.series.impl.NumberSeries;
import com.comsysto.ubercharts.ui.model.types.MusikGenre;
import com.comsysto.ubercharts.ui.socket.MessageType;
import org.apache.commons.io.FileUtils;
import org.apache.wicket.model.LoadableDetachableModel;

import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.util.string.interpolator.MapVariableInterpolator;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.*;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: alentolj
 * Date: 20.02.13
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
public class PieChartModel extends LoadableDetachableModel<Highchart> {
    public static final String PIE_CHART_PANEL_JS_PATH = "/com/comsysto/ubercharts/ui/panel/PieChartPanel.js";
    public static final String PIE_CHART_CLICK_JS_PATH = "/com/comsysto/ubercharts/ui/panel/ChartCategorySwitch.js";

//    private JavaScriptResourceReference jsResourceReference;

    private HashMap<String, String> chartFontStyle;

    public PieChartModel() {
//        jsResourceReference = new JavaScriptResourceReference(this.getClass(), "PieChartPanel.js");
    }

    @Override
    protected Highchart load() {

        Map<String, String> pizzaUrls = new HashMap<String, String>();

        Highchart highchart = initPieChart();

        setChartFontStyle();
        setChartTitle(highchart);
        setXandYAxis(highchart);
        setLookAndFeel(highchart);

        Events event = new Events();

        event.setLegendItemClick(getClickScript());
        Series series = new Series();
        series.setCursor("pointer");
        series.setEvents(event);
        highchart.getPlotOptions().setSeries(series);
        highchart.getChart().getEvents().setLoad(getScript());

        highchart.getChart().setWidth(600);

        return highchart;
    }

    private String getClickScript() {
        try {
            URI uri = PieChartModel.class.getResource(PIE_CHART_CLICK_JS_PATH).toURI();
            String script = FileUtils.readFileToString(new File(uri));
            Map<String, String> replacements = new HashMap<String, String>();
            replacements.put("contextPath", getContextPath());
            replacements.put("messageType", MessageType.PRODUCT_COLUMN_LEGEND_CLICK.name());
            return new MapVariableInterpolator(script, replacements).toString();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }


    private String getContextPath() {
        return RequestCycle.get().getRequest().getContextPath();
    }

    public String getScript() {

        String script = "";
        try {
            URI uri = PieChartModel.class.getResource(PIE_CHART_PANEL_JS_PATH).toURI();
            script = FileUtils.readFileToString(new File(uri));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> replacements = new HashMap<String, String>();
        replacements.put("messageType", MessageType.PIE_CHART_UPDATE.name());
        return new MapVariableInterpolator(script, replacements).toString();

    }
    private Highchart initPieChart() {

        Map<String,Number> orderMap = new HashMap<String, Number>(MusikGenre.values().length);
        for(MusikGenre.Rock genre: MusikGenre.Rock.values()){
            orderMap.put(genre.getName(), 1);
        }


        Map<String,Number> emptyMap = new HashMap<String, Number>();
        ISeries<Object[][]> rock = new LabeledNumberSeries(MusikGenre.ROCK.name()).setData(orderMap);
        ISeries<Object[][]> urban = new LabeledNumberSeries(MusikGenre.URBAN.name()).setData(emptyMap).setVisible(false);
        ISeries<Object[][]> electronic = new LabeledNumberSeries(MusikGenre.ELECTRONIC.name()).setData(emptyMap).setVisible(false);
        ISeries<Object[][]> bluesJazz = new LabeledNumberSeries(MusikGenre.BLUES_JAZZ.name()).setData(emptyMap).setVisible(false);
        ISeries<Object[][]> pop = new LabeledNumberSeries(MusikGenre.POP.name()).setData(emptyMap).setVisible(false);

        Highchart highchart = new Highchart(new BarChart(),rock, pop, urban, electronic, bluesJazz);

        Legend legend = new Legend();
        legend.setEnabled(true);
        highchart.setLegend(legend);
        return highchart;
    }

    private void setLookAndFeel(Highchart highchart) {
        highchart.setColors(new String[]{
                "#00A9BE",
                "#5CBEC6",
                "#00A9BE",
                "#5CBEC6",
                "#00A9BE",
                "#5CBEC6",
                "#00A9BE",
                "#5CBEC6"});
        highchart.disableAllAnimations();
        highchart.getChart().setBackgroundColor("transparent");
        highchart.getChart().setHeight(600);
    }

    private void setXandYAxis(Highchart highchart) {
        highchart.getXAxis().setLabels(new AxisLabels()).getLabels();
        highchart.getXAxis().getLabels().setAlign(Align.right);
        HashMap<String, String> xAxisStyle = new HashMap<String, String>(chartFontStyle);
        xAxisStyle.put("fontSize", "20px");
        highchart.getXAxis().setStyle(xAxisStyle);

        HashMap<String, String> yAxisTitleStyle = new HashMap<String, String>(chartFontStyle);
        yAxisTitleStyle.put("fontSize", "14px");

        AxisTitle quantity = new AxisTitle("quantity");
        quantity.setStyle(yAxisTitleStyle);
        highchart.getYAxis().setTitle(quantity);
    }

    private void setChartTitle(Highchart highchart) {
        ChartTitle chartTitle = new ChartTitle("MP3-Shop Orders");
        chartTitle.setStyle(chartFontStyle);
        Credits credits = new Credits("comSysto GmbH").setHref("http://www.comsysto.com");
        highchart.setTitle(chartTitle).setCredits(credits);
    }

    private void setChartFontStyle() {

        chartFontStyle = new HashMap<String, String>();
        chartFontStyle.put("color", "#555");
        chartFontStyle.put("fontWeight", "normal");
        chartFontStyle.put("fontSize", "24px");


    }

}
