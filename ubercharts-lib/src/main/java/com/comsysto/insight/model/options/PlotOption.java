package com.comsysto.insight.model.options;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author zutherb
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class PlotOption {
    Boolean animation;

    public Boolean getAnimation() {
        return animation;
    }

    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }
}
