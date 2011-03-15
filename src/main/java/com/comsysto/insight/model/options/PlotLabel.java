package com.comsysto.insight.model.options;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 15/03/2011
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class PlotLabel extends BasicLabel {

    private VerticalAlign mVerticalAlign;
    private Align mTextAlign;


    public VerticalAlign getVerticalAlign() {
        return mVerticalAlign;
    }

    public PlotLabel setVerticalAlign(VerticalAlign pVerticalAlign) {
        mVerticalAlign = pVerticalAlign;
        return this;
    }

    public Align getTextAlign() {
        return mTextAlign;
    }

    public PlotLabel setTextAlign(Align pTextAlign) {
        mTextAlign = pTextAlign;
        return this;
    }

}
