package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.series.generic.AbstractSeries;
import com.comsysto.insight.model.options.series.generic.ISeries;
import org.codehaus.jackson.annotate.JsonRawValue;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author zutherb
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
public class FunctionSeries extends AbstractSeries<String> {

    private String pData;

    public FunctionSeries() {
        super();
    }

    public FunctionSeries(String pName) {
        super(pName);
    }

    @Override
    public ISeries<String> setData(String pData) {
        this.pData = pData;
        return this;
    }

    @Override
    @JsonRawValue
    public String getData() {
        return pData;
    }
}
