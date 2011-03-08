package com.comsysto.insight.model.options;

public class Title extends Subtitle {

    private Integer margin;

    public Title(String pText) {
        super(pText);
    }

    public Integer getMargin() {
        return margin;
    }

    public Title setMargin(Integer pMargin) {
        margin = pMargin;
        return this;
    }
}