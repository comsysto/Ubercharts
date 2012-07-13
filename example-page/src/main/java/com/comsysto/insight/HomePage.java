/*
 Copyright 2011 comSysto GmbH

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.comsysto.insight;

import com.comsysto.insight.component.HighchartsPanel;
import com.comsysto.insight.model.Highchart;
import com.comsysto.insight.model.charts.*;
import com.comsysto.insight.model.options.*;
import com.comsysto.insight.model.options.series.generic.ISeries;
import com.comsysto.insight.model.options.series.impl.*;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.resource.JavaScriptResourceReference;


/** Homepage */
public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that is invoked when page is invoked without a session.
     *
     */
    public HomePage() {

        String[] categories = new String[]{"Jan", "Feb", "Mar", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Credits credits = new Credits("comSysto GmbH").setHref("http://www.comsysto.com");

        ISeries<Number []> a = new NumberSeries("Number").setData(new Number[]{7.0, 6.9, 9.5, 10.2, 12.2, 13.9});

        ISeries<Object []> b = new MixedSeries("Mixed").setData(new Object[]{-0.2, 0.8, 4.4, new Object[]{"max", 50}, new Integer[]{4, 1}});

        ISeries<Object [][]> c = new LabeledNumberSeries("LabeledNumber").setData(new Object[][]{new Object[]{"max", 20}, new Object[]{"min", -5}});

        ISeries<Number [][]> d = new CoordinateSeries("Coords").setData(new Number[]{3.9, 4.2, 5.7, 7.5, 2.3}, new Number[]{3.9, 4.2, 5.7, 7.5, 2.3});

        ISeries<Point []> e = new PointSeries("Points").setData(new Point[]{new Point(1, 5), new Point(3, 4), new Point(6, 7)});

        Highchart highchart1 = new Highchart(new AreaChart(), a, c, d, e);
        highchart1.setTitle(new ChartTitle("AreaChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart2 = new Highchart(new AreaSplineChart(), a, c, d, e);
        highchart2.setTitle(new ChartTitle("AreaSplineChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart3 = new Highchart(new BarChart(), a, c, d, e);
        highchart3.setTitle(new ChartTitle("BarChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart4 = new Highchart(new ColumnChart(), a, c, d, e);
        highchart4.setTitle(new ChartTitle("ColumnChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart5 = new Highchart(new LineChart(), a, c, d, e);
        highchart5.setTitle(new ChartTitle("LineChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart6 = new Highchart(new PieChart(), a, c, d, e);
        highchart6.setTitle(new ChartTitle("PieChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart7 = new Highchart(new ScatterChart(), a, c, d, e);
        highchart7.setTitle(new ChartTitle("ScatterChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart8 = new Highchart(new SplineChart(), a, c, d, e);
        highchart8.setTitle(new ChartTitle("SplineChart")).setCredits(credits).getXAxis().setCategories(categories);

        Highchart highchart9 = new Highchart(new LineChart(), b);
        highchart9.setTitle(new ChartTitle("LineChart"));
        highchart9.setSubtitle(new Subtitle("Mixed Series"));
        highchart9.getXAxis().setCategories(categories).setTitle(new AxisTitle("Time"));
        highchart9.getYAxis().setTitle(new AxisTitle("Amount"));
        highchart9.setCredits(credits);
        highchart9.getChart().setZoomType(ZoomType.x);


        // Add Panel
        add(new HighchartsPanel("chart1", Model.of(highchart1)));
        add(new HighchartsPanel("chart2", Model.of(highchart2)));
        add(new HighchartsPanel("chart3", Model.of(highchart3)));
        add(new HighchartsPanel("chart4", Model.of(highchart4)));
        add(new HighchartsPanel("chart5", Model.of(highchart5)));
        add(new HighchartsPanel("chart6", Model.of(highchart6)));
        add(new HighchartsPanel("chart7", Model.of(highchart7)));
        add(new HighchartsPanel("chart8", Model.of(highchart8)));
        add(new HighchartsPanel("chart9", Model.of(highchart9)));
        add(new HighchartsPanel("chart10", liveChartModel()));
        add(new HighchartsPanel("chart11", funnelChart()){
            @Override
            public void renderHead(IHeaderResponse response) {
                super.renderHead(response);
                response.renderJavaScriptReference(new JavaScriptResourceReference(HighchartsPanel.class, "funnel.js"));
            }
        });
    }

    private IModel<Highchart> funnelChart() {
        Chart chart = new FunnelChart();
        ISeries<Object [][]> c = new LabeledNumberSeries("Browser share")
                .setData(new Object[][]{new Object[]{"Website visits", 15654},
                        new Object[]{"Downloads", 4064},
                        new Object[]{"Requested price list", 1987},
                        new Object[]{"Invoice sent", 976},
                        new Object[]{"Finalized", 846}});
        Highchart highchart = new Highchart(chart, c)
                .setTitle(new ChartTitle("Sales funnel"))
                .setTooltip(new Tooltip().setFormatter("function() {\n" +
                "            return '<b>'+ this.point.name +'</b>: '+ Highcharts.numberFormat(this.y, 0);\n" +
                "        }"))
                .setMargin(new int[]{50, 10, 60, 170});
        DataLabels dataLabels = new DataLabels()
                .setAlign(Align.left)
                .setColor(Color.black)
                .setEnabled(true)
                .setX(-300)
                .setFormatter("function() {\n" +
                        "   return '<b>'+ this.point.name +'</b> ('+ Highcharts.numberFormat(this.point.y, 0) +')';\n" +
                        "}");
        Series series = new Series().setDataLabels(dataLabels);
        highchart.setPlotOptions(new PlotOptions().setSeries(series));
        highchart.setLegend(new Legend().setEnabled(false));
        return Model.of(highchart);
    }

    public IModel<Highchart> liveChartModel(){
        Chart chart = new SplineChart();
        chart.setMarginRight(10);
        Events events = new Events();
        events.setLoad("function() {\n" +
                "           // set up the updating of the chart each second\n" +
                "           var series = this.series[0];\n" +
                "           setInterval(function() {\n" +
                "               var x = (new Date()).getTime(), // current time\n" +
                "               y = Math.random();\n" +
                "               series.addPoint([x, y], true, true);\n" +
                "               }, 1000);\n" +
                "       }");
        chart.setEvents(events);
        PlotLine plotLine = new PlotLine().setValue(0).setWidth(1).setColor("#808080");
        Tooltip pTooltip = new Tooltip();
        pTooltip.setFormatter("function() {\n" +
                "                    return '<b>'+ this.series.name +'</b><br/>'+\n" +
                "                            Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) +'<br/>'+\n" +
                "                            Highcharts.numberFormat(this.y, 2);\n" +
                "                }");

        FunctionSeries functionSeries = new FunctionSeries("Random data");
        functionSeries.setData("(function() {\n" +
                "                    // generate an array of random data\n" +
                "                    var data = [],\n" +
                "                    time = (new Date()).getTime(),\n" +
                "                            i;\n" +
                "                    for (i = -19; i <= 0; i++) {\n" +
                "                        data.push({\n" +
                "                                x: time + i * 1000,\n" +
                "                                y: Math.random()\n" +
                "                        });\n" +
                "                    }\n" +
                "                    return data;\n" +
                "                })()");

        Credits credits = new Credits("comSysto GmbH").setHref("http://www.comsysto.com");

        Highchart highchart = new Highchart(chart, functionSeries);
        highchart.setCredits(credits);
        highchart.setTitle(new ChartTitle("Live random data"));
        highchart.getXAxis().setType(AxisType.datetime).setTickPixelInterval(Integer.valueOf(150));
        highchart.getYAxis().setTitle(new AxisTitle("Value")).setPlotLines(plotLine);
        highchart.setTooltip(pTooltip);
        highchart.setLegend(new Legend().setEnabled(false));
        highchart.setExporting(new Exporting().setEnabled(false));
        return Model.of(highchart);
    }


}


