package com.comsysto.insight.model.options;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 08/03/2011
 * Time: 16:53
 */
public class BasicTitle {

    private String mText;
    private Align mAlign;
    private Map<String, String> mStyle;

    public BasicTitle(String pText) {
        mText = pText;
    }

    public BasicTitle(String pText, Align pAlign, Map<String, String> pStyle) {
        mText = pText;
        mAlign = pAlign;
        mStyle = pStyle;
    }

    public String getText() {
        return mText;
    }

    public BasicTitle setText(String pText) {
        mText = pText;
        return this;
    }

    public Align getAlign() {
        return mAlign;
    }

    public BasicTitle setAlign(Align pAlign) {
        mAlign = pAlign;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public BasicTitle setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }


}
