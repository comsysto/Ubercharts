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