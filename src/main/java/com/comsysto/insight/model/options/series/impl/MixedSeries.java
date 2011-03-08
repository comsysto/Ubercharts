package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.Point;
import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Collection;

/**
 * Implementation of {@link AbstractSeries} which represents a mixed array of Numbers, Label/Y-Pairs, X/Y-Coordinates and Points
 * to be plotted on the chart.
 * <p/>
 * For more information read href="http://www.highcharts.com/ref/#series.
 * <p/>
 * Date: Feb 18, 2011 Time: 9:47:09 PM
 *
 * @author Mohammed El Batya
 */
public class MixedSeries extends AbstractSeries<Object[]> {


    /**
     *
     */
    public MixedSeries() {
    }

    /**
     * @param pName
     */
    public MixedSeries(String pName) {
        super(pName);
    }

    /**
     * @param pMixedData
     * @return
     */
    public MixedSeries setData(Object[] pMixedData) {
        data = pMixedData;
        return this;
    }

    /**
     * @param pMixedData
     * @return
     */
    public MixedSeries setData(Collection<?> pMixedData) {

        for (Object data : pMixedData) {

            if (!(isNumberOrPoint(data) || isValidArray(data))) {
                throw new IllegalArgumentException("The mixed data series can only contain Numbers, Points, and Arrays which " +
                        "have the length of 2 and contain a Number-Number(X/Y) pair or a String-Number(Label/Y) pair.");
            }

        }

        return setData(pMixedData.toArray());
    }

    /**
     * @param pObject
     * @return
     */
    private boolean isNumberOrPoint(Object pObject) {
        return (pObject instanceof Number || pObject instanceof Point);
    }

    /**
     * @param pObject
     * @return
     */
    private boolean isValidArray(Object pObject) {

        boolean isValid;

        if (pObject instanceof Object[]) {
            Object[] array = (Object[]) pObject;

            if (array.length == 2) {
                if (array[0] instanceof String && array[1] instanceof Number) {
                    isValid = true;
                } else if (array[0] instanceof Number && array[1] instanceof Number) {
                    isValid = true;
                } else {
                    isValid = false;
                }

            } else {
                isValid = false;
            }

        } else {
            isValid = false;
        }

        return isValid;
    }

}
