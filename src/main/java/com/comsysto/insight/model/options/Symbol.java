package com.comsysto.insight.model.options;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 15/03/2011
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 */
public enum Symbol {
    circle, square, diamond, triangle,
    triangleDown {
        public String toString() {
            return "triangle-down";
        }
    };
}
