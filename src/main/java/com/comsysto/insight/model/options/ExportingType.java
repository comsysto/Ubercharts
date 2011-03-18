package com.comsysto.insight.model.options;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 18/03/2011
 * Time: 14:21
 * To change this template use File | Settings | File Templates.
 */
public enum ExportingType {
    png() {
        @Override
        public String toString() {
            return "image/png";
        }
    }, jpeg() {
        @Override
        public String toString() {
            return "image/jpeg";
        }
    }, pdf() {
        @Override
        public String toString() {
            return "application/pdf";
        }
    }, svgWithXml() {
        @Override
        public String toString() {
            return "image/svg+xml";
        }
    }
}
