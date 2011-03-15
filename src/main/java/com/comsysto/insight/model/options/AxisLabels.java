package com.comsysto.insight.model.options;

public class AxisLabels extends BasicLabel {

    private Boolean mEnabled;
    private Integer mStaggerLines;
    private Integer mStep;


    public Boolean getEnabled() {
        return mEnabled;
    }

    public AxisLabels setEnabled(Boolean pEnabled) {
        mEnabled = pEnabled;
        return this;
    }


    public Integer getStaggerLines() {
        return mStaggerLines;
    }

    public AxisLabels setStaggerLines(Integer pStaggerLines) {
        mStaggerLines = pStaggerLines;
        return this;
    }

    public Integer getStep() {
        return mStep;
    }

    public AxisLabels setStep(Integer pStep) {
        mStep = pStep;
        return this;
    }


}