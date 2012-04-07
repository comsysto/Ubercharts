package com.comsysto.insight.model.options;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * @author zutherb
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class PlotOption implements Serializable {
    private static final long serialVersionUID = -1641413182537105513L;

    private Point point;
    private Boolean animation;

    public Boolean getAnimation() {
        return animation;
    }

    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
