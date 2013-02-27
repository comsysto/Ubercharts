package com.comsysto.ubercharts.ui.model;

import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.model.charts.BarChart;
import com.comsysto.insight.model.options.*;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.NumberSeries;
import com.comsysto.ubercharts.ui.model.types.MusikGenre;
import com.comsysto.ubercharts.ui.socket.MessageType;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.wicket.model.LoadableDetachableModel;

import org.apache.wicket.util.string.interpolator.MapVariableInterpolator;

import java.io.*;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * User: alentolj
 * Date: 20.02.13
 */
public class DownloadChartModel extends LoadableDetachableModel<Highchart> {
    public static final String CHART_UPDATE_JS_PATH = "/com/comsysto/ubercharts/ui/panel/DownloadsChartPanel.js";
    public static final String CHART_CLICK_JS_PATH = "/com/comsysto/ubercharts/ui/panel/ChartCategorySwitch.js";


    private HashMap<String, String> chartFontStyle;

    public DownloadChartModel() {
    }

    @Override
    protected Highchart load() {

        Highchart highchart = initPieChart();

        setChartFontStyle();
        setChartTitle(highchart);
        setXandYAxis(highchart);
        setLookAndFeel(highchart);
        setChartEvents(highchart);

        return highchart;
    }

    private void setChartEvents(Highchart highchart) {
        Events event = new Events();
        event.setLegendItemClick(getClickScript());
        Series series = new Series();
        series.setEvents(event);

        highchart.getPlotOptions().setSeries(series);
        highchart.getChart().getEvents().setLoad(getScript());
    }

    private String getClickScript() {
        try {
            URI uri = DownloadChartModel.class.getResource(CHART_CLICK_JS_PATH).toURI();
            String script = FileUtils.readFileToString(new File(uri));
            Map<String, String> replacements = new HashMap<String, String>();
            replacements.put("messageType", MessageType.GENRE_UPDATE.name());
            return new MapVariableInterpolator(script, replacements).toString();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }


    private String getScript() {

        String script = "";
        try {
            URI uri = DownloadChartModel.class.getResource(CHART_UPDATE_JS_PATH).toURI();
            script = FileUtils.readFileToString(new File(uri));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, String> replacements = new HashMap<String, String>();
        replacements.put("messageType", MessageType.SERIES_UPDATE.name());
        replacements.put("messageSeriesType", MessageType.CATEGORIES_UPDATE.name());
        return new MapVariableInterpolator(script, replacements).toString();

    }

    private Highchart initPieChart() {

        Number[] emptyArray = {};
        ISeries<Number[]> rock = new NumberSeries(MusikGenre.ROCK.getName()).setData(emptyArray);
        ISeries<Number[]> urban = new NumberSeries(MusikGenre.URBAN.getName()).setData(emptyArray).setVisible(false);
        ISeries<Number[]> electronic = new NumberSeries(MusikGenre.ELECTRONIC.getName()).setData(emptyArray).setVisible(false);
        ISeries<Number[]> bluesJazz = new NumberSeries(MusikGenre.BLUES.getName()).setData(emptyArray).setVisible(false);
        ISeries<Number[]> pop = new NumberSeries(MusikGenre.POP.getName()).setData(emptyArray).setVisible(false);

        Highchart highchart = new Highchart(new BarChart(), rock, pop, urban, electronic, bluesJazz);

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
        highchart.getChart().setWidth(600);
    }

    private void setXandYAxis(Highchart highchart) {
        highchart.getXAxis().setLabels(new AxisLabels()).getLabels();
        highchart.getXAxis().getLabels().setAlign(Align.right);
        HashMap<String, String> xAxisStyle = new HashMap<String, String>(chartFontStyle);
        xAxisStyle.put("fontSize", "20px");
        highchart.getXAxis().setStyle(xAxisStyle);
        highchart.getXAxis().setCategories(new String[]{"Hard Rock", "Classic Rock", "Rock & Roll", "Punk"});

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
