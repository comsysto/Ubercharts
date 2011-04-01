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

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 15/03/2011
 * Time: 19:01
 * To change this template use File | Settings | File Templates.
 */
public class PlotLabel extends BasicLabel {

    private VerticalAlign mVerticalAlign;
    private Align mTextAlign;


    public VerticalAlign getVerticalAlign() {
        return mVerticalAlign;
    }

    public PlotLabel setVerticalAlign(VerticalAlign pVerticalAlign) {
        mVerticalAlign = pVerticalAlign;
        return this;
    }

    public Align getTextAlign() {
        return mTextAlign;
    }

    public PlotLabel setTextAlign(Align pTextAlign) {
        mTextAlign = pTextAlign;
        return this;
    }

}
