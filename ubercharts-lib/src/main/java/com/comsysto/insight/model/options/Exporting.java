/*
 Copyright 2011 comSysto GmbH

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.comsysto.insight.model.options;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 08/03/2011
 * Time: 15:24
 * To change this template use File | Settings | File Templates.
 */
public class Exporting implements Serializable {

    private ExportingButtons mButtons;
    private Boolean mEnabled;
    private String mFilename;
    private ExportingType mType;
    private String mUrl;
    private Integer mWidth;

    public ExportingButtons getButtons() {
        return mButtons;
    }

    public Exporting setButtons(ExportingButtons pButtons) {
        mButtons = pButtons;
        return this;
    }

    public Boolean getEnabled() {
        return mEnabled;
    }

    public Exporting setEnabled(Boolean pEnabled) {
        mEnabled = pEnabled;
        return this;
    }

    public String getFilename() {
        return mFilename;
    }

    public Exporting setFilename(String pFilename) {
        mFilename = pFilename;
        return this;
    }

    public ExportingType getType() {
        return mType;
    }

    public Exporting setType(ExportingType pType) {
        mType = pType;
        return this;
    }

    public String getUrl() {
        return mUrl;
    }

    public Exporting setUrl(String pUrl) {
        mUrl = pUrl;
        return this;
    }

    public Integer getWidth() {
        return mWidth;
    }

    public Exporting setWidth(Integer pWidth) {
        mWidth = pWidth;
        return this;
    }
}
