package com.comsysto.insight.model.options;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 15/03/2011
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 */
public class ChartLabelItem {
    private String mHtml;
    private Map<String, String> mStyle;

    public String getHtml() {
        return mHtml;
    }

    public ChartLabelItem setHtml(String pHtml) {
        mHtml = pHtml;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public ChartLabelItem setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }
}
