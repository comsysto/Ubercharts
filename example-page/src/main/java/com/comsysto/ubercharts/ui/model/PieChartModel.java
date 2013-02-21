package com.comsysto.ubercharts.ui.model;

import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.model.charts.PieChart;
import com.comsysto.insight.model.options.*;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.LabeledNumberSeries;
import com.comsysto.insight.resource.HighchartsResourcesReference;
import com.comsysto.ubercharts.ui.socket.MessageType;
import org.apache.commons.io.FileUtils;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.protocol.ws.api.WicketWebSocketJQueryResourceReference;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import org.apache.wicket.util.string.interpolator.MapVariableInterpolator;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
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

//    private JavaScriptResourceReference jsResourceReference;

    private HashMap<String, String> chartFontStyle;

    public PieChartModel() {
//        jsResourceReference = new JavaScriptResourceReference(this.getClass(), "PieChartPanel.js");
    }

    @Override
    protected Highchart load() {

        ISeries<Object[][]> data = getChartData();
        Highchart highchart = new Highchart(new PieChart(),data);

        setChartFontStyle();
        setChartTitle(highchart);
        setXandYAxis(highchart);
        setLookAndFeel(highchart);

        Events events = new Events();
        Series series = new Series();
        series.setCursor("pointer");
        series.setEvents(events);
        highchart.getPlotOptions().setSeries(series);
        highchart.getChart().getEvents().setLoad(getScript());
//        highchart.getChart().setWidth(600);



        return highchart;
    }

    public String getScript() {

        String script = "";
        try {
            URI uri = PieChartModel.class.getResource(PIE_CHART_PANEL_JS_PATH).toURI();
            script = FileUtils.readFileToString(new File(uri));
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        Map<String, String> replacements = new HashMap<String, String>();
        replacements.put("messageType", MessageType.PIE_CHART_UPDATE.name());
        return new MapVariableInterpolator(script, replacements).toString();

    }
    private ISeries<Object[][]> getChartData() {

        Map<String,Number> orderMap = new HashMap<String, Number>(6);
        orderMap.put("Jazz", 1);
        orderMap.put("Blues", 4);
        orderMap.put("Raggae", 4);
        orderMap.put("Rock", 3);
        orderMap.put("Electronic", 5);
        orderMap.put("Drum & Bass", 5);
        orderMap.put("R&B", 6);
        orderMap.put("Hip Hop", 6);

        return new LabeledNumberSeries("Browser share").setData(orderMap);
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
