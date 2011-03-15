package com.comsysto.insight.model.options.series.generic;

import com.comsysto.insight.model.options.ChartType;

/**
 * The actual series to be plotted on a chart.
 * <p/>
 * This interface is designed for convenient use through chaining. There are five concrete Implementations which should
 * cover all possible variations, supported by Highcharts. Normally, you shouldn't need to implement this interface by
 * your own.
 * <p/>
 * For more information read href="http://www.highcharts.com/ref/#series.
 * <p/>
 * Date: Feb 18, 2011 Time: 9:29:12 PM
 *
 * @author Mohammed El Batya
 * @see com.comsysto.insight.model.options.series.impl.CoordinateSeries
 * @see com.comsysto.insight.model.options.series.impl.LabeledNumberSeries
 * @see com.comsysto.insight.model.options.series.impl.MixedSeries
 * @see com.comsysto.insight.model.options.series.impl.NumberSeries
 * @see com.comsysto.insight.model.options.series.impl.PointSeries
 */
public interface ISeries<DataType> {

    /**
     * Gets the name of the series as shown in the legend, tooltip etc. The default value is "".
     *
     * @return the name of the series as shown in the legend, tooltip etc
     */
    String getName();

    /**
     * Sets the name of the series as shown in the legend, tooltip etc. The default value is "".
     *
     * @param pName the name of the series as shown in the legend, tooltip etc
     * @return this object for convenient chaining, not a copy
     */
    ISeries<DataType> setName(String pName);

    /**
     * Gets the stack identifier for a stacked chart. Series with the same stack identifier will be stacked together. The
     * default value is "".
     *
     * @return stack identifier for a stacked chart
     */
    String getStack();

    /**
     * Sets the stack identifier for a stacked chart. Series with the same stack identifier will be stacked together. The
     * default value is "".
     *
     * @param pStack the stack identifier for a stacked chart
     * @return this object for convenient chaining, not a copy
     */
    ISeries<DataType> setStack(String pStack);

    /**
     * Gets the type of this series. If this is set, the default type of your chart will be ignored for this series. The
     * default value is null.
     *
     * @return the type of this series.
     * @see com.comsysto.insight.model.options.ChartType
     */
    ChartType getType();

    /**
     * Sets the type of this series. If you set this, the default type of your chart will be ignored for this series. The
     * default value is null.
     *
     * @param pType the type of this series
     * @return this object for convenient chaining, not a copy
     * @see com.comsysto.insight.model.options.ChartType
     */
    ISeries<DataType> setType(ChartType pType);

    /**
     * Gets the id of the connected xAxis. When using dual or multiple xAxes, this number defines which xAxis the
     * particular series is connected to. It refers to the index of the axis in the xAxis array, which begins with 0. The
     * default value 0.
     *
     * @return the id of the connected X-axis
     */
    Integer getXAxis();

    /**
     * Sets the id of the connected xAxis. When using dual or multiple xAxes, this number defines which xAxis the
     * particular series is connected to. It refers to the index of the axis in the xAxis array, which begins with 0. The
     * default value 0.
     *
     * @param pXAxis the id of the connected xAxis
     * @return this object for convenient chaining, not a copy
     */
    ISeries<DataType> setXAxis(Integer pXAxis);

    /**
     * Gets the id of the connected yAxis. When using dual or multiple yAxes, this number defines which yAxis the
     * particular series is connected to. It refers to the index of the axis in the yAxis array, which begins with 0. The
     * default value 0.
     *
     * @return the id of the connected yAxis
     */
    Integer getYAxis();

    /**
     * Sets the id of the connected YAxis. When using dual or multiple YAxes, this number defines which xAxis the
     * particular series is connected to. It refers to the index of the axis in the YAxis array, which begins with 0. The
     * default value 0.
     *
     * @param pYAxis the id of the connected yAxis
     * @return this object for convenient chaining, not a copy
     */
    ISeries<DataType> setYAxis(Integer pYAxis);

    /**
     * Gets an array of data points for this series.
     * <p/>
     * The concrete implementation of this interface defines which kind of data is allowed, read its JavaDocs for detailed
     * information. To see which data are generally supported by Highcharts, look at
     * href="http://www.highcharts.com/ref/#series. The default value null.
     *
     * @return an array of data points for the series
     */
    DataType getData();

    /**
     * Sets an array of data points for this series.
     * <p/>
     * The concrete implementation of this interface defines which kind of data is allowed, read its JavaDocs for detailed
     * information. To see which data are generally supported by Highcharts, look at
     * href="http://www.highcharts.com/ref/#series. The default value null.
     *
     * @param pData an array of data points for this series
     * @return this object for convenient chaining, not a copy
     */
    ISeries<DataType> setData(DataType pData);

}
