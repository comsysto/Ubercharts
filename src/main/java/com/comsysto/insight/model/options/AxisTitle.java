package com.comsysto.insight.model.options;

import java.util.Map;

/**
 * Date: Feb 18, 2011
 * Time: 10:49:54 PM
 *
 * @author Mohammed El Batya
 */
public class AxisTitle extends BasicTitle {

    private Integer margin;
    private Integer rotation;

    public AxisTitle(String pText) {
        super(pText);
    }

    public AxisTitle(String pText, Align pAlign, Map<String, String> pStyle) {
        super(pText, pAlign, pStyle);
    }

    public Integer getMargin() {
        return margin;
    }

    public AxisTitle setMargin(Integer margin) {
        this.margin = margin;
        return this;
    }

    public Integer getRotation() {
        return rotation;
    }

    public AxisTitle setRotation(Integer rotation) {
        this.rotation = rotation;
        return this;
    }
}


