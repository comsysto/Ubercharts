package com.comsysto.insight.model.options;

import java.util.Map;

public class Loading {

    private Integer mHideDuration;
    private Map<String, String> mLabelStyle;
    private Integer mShowDuration;
    private Map<String, String> mStyle;

    public Integer getHideDuration() {
        return mHideDuration;
    }

    public Loading setHideDuration(Integer pHideDuration) {
        mHideDuration = pHideDuration;
        return this;
    }

    public Map<String, String> getLabelStyle() {
        return mLabelStyle;
    }

    public Loading setLabelStyle(Map<String, String> pLabelStyle) {
        mLabelStyle = pLabelStyle;
        return this;
    }

    public Integer getShowDuration() {
        return mShowDuration;
    }

    public Loading setShowDuration(Integer pShowDuration) {
        mShowDuration = pShowDuration;
        return this;
    }

    public Map<String, String> getStyle() {
        return mStyle;
    }

    public Loading setStyle(Map<String, String> pStyle) {
        mStyle = pStyle;
        return this;
    }
}