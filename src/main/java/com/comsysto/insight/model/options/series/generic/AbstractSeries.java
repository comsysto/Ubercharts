package com.comsysto.insight.model.options.series.generic;

import com.comsysto.insight.model.options.Type;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Abstract implementation of ISeries, implementing all needed methods, except for {@link ISeries#setData(Object)}. You
 * should not need to implement this class by your own as the existing implementations should cover all possible
 * variations supported by Highcharts.
 * <p/>
 * Date: Feb 18, 2011 Time: 6:06:55 PM
 *
 * @author Mohammed El Batya
 * @see ISeries
 * @see com.comsysto.insight.model.options.series.impl.CoordinateSeries
 * @see com.comsysto.insight.model.options.series.impl.LabeledNumberSeries
 * @see com.comsysto.insight.model.options.series.impl.MixedSeries
 * @see com.comsysto.insight.model.options.series.impl.NumberSeries
 * @see com.comsysto.insight.model.options.series.impl.PointSeries
 */
abstract public class AbstractSeries<DataType> implements ISeries<DataType> {

    /** {@link ISeries#getData()} */
    protected DataType mData = null;

    /** {@link ISeries#getName()} */
    private String mName = "";

    /** {@link ISeries#getStack()} */
    private String mStack = "";

    /** {@link ISeries#getType()} */
    private Type mType;

    /** {@link ISeries#getXAxis()} */
    private Integer mXAxis;

    /** {@link ISeries#getYAxis()} */
    private Integer mYAxis;

    /**
     * Default Constructor for this series.
     * <p/>
     * Everything is set to its default value.
     */
    public AbstractSeries() {
    }

    /**
     * Constructor, which sets the mName for this series. Everything else is set to its default value.
     *
     * @param pName the mName for this series
     * @see #setName(String)
     */
    public AbstractSeries(String pName) {
        mName = pName;
    }

    /** {@link ISeries#getName()} */
    public String getName() {
        return mName;
    }

    /** {@link ISeries#setName(String)} */
    public ISeries<DataType> setName(String pName) {
        mName = pName;
        return (ISeries<DataType>) this;
    }

    /** {@link ISeries#getStack()} */
    public String getStack() {
        return mStack;
    }

    /** {@link ISeries#setStack(String)} */
    public ISeries<DataType> setStack(String pStack) {
        mStack = pStack;
        return (ISeries<DataType>) this;
    }

    /** {@link ISeries#getType()} */
    public Type getType() {
        return mType;
    }

    /** {@link ISeries#setType(com.comsysto.insight.model.options.Type) } */
    public ISeries<DataType> setType(Type pType) {
        mType = pType;
        return (ISeries<DataType>) this;
    }

    /** {@link ISeries#getXAxis()} */
    @JsonProperty("xAxis")
    public Integer getXAxis() {
        return mXAxis;
    }

    /** {@link ISeries#setXAxis(Integer)} */
    public ISeries<DataType> setXAxis(Integer pXAxis) {
        mXAxis = pXAxis;
        return (ISeries<DataType>) this;
    }

    /** {@link ISeries#getYAxis()} */
    @JsonProperty("yAxis")
    public Integer getYAxis() {
        return mYAxis;
    }

    /** {@link ISeries#setYAxis(Integer)} */
    public ISeries<DataType> setYAxis(Integer pYAxis) {
        mYAxis = pYAxis;
        return (ISeries<DataType>) this;
    }

    /** {@link ISeries#getData()} */
    public DataType getData() {
        return mData;
    }

}
