package com.comsysto.insight.model.options;

import java.util.Map;

public class ChartTitle extends Subtitle {

    private Integer margin;

    public ChartTitle(String pText) {
        super(pText);
    }

    public ChartTitle(String pText, Align pAlign, Map<String, String> pStyle) {
        super(pText, pAlign, pStyle);
    }

    public Integer getMargin() {
        return margin;
    }

    public ChartTitle setMargin(Integer pMargin) {
        margin = pMargin;
        return this;
    }
}