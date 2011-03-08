package com.comsysto.insight.model.options;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 08/03/2011
 * Time: 16:53
 */
public class BasicTitle {

    private String fText;
    private Align fAlign;
    private Map<String, String> fStyle;

    public BasicTitle(String pText) {
        fText = pText;
    }

    public BasicTitle(String pText, Align pAlign, Map<String, String> pStyle) {
        fText = pText;
        fAlign = pAlign;
        fStyle = pStyle;
    }

    public String getText() {
        return fText;
    }

    public BasicTitle setText(String pText) {
        fText = pText;
        return this;
    }

    public Align getAlign() {
        return fAlign;
    }

    public BasicTitle setAlign(Align pAlign) {
        fAlign = pAlign;
        return this;
    }

    public Map<String, String> getStyle() {
        return fStyle;
    }

    public BasicTitle setStyle(Map<String, String> pStyle) {
        fStyle = pStyle;
        return this;
    }


}
