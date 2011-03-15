package com.comsysto.insight.model.options;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 15/03/2011
 * Time: 19:28
 * To change this template use File | Settings | File Templates.
 */
public class ChartLabels {

    private ChartLabelItem[] mItems;
    private Map<String, String> mStyle;


    public ChartLabelItem[] getItems() {
        return mItems;
    }

    public ChartLabels setItems(ChartLabelItem[] pItems) {
        mItems = pItems;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public ChartLabels setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }
}
