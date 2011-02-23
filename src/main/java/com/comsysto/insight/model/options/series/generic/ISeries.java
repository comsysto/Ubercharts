package com.comsysto.insight.model.options.series.generic;

import com.comsysto.insight.model.options.Type;

/**
 * Date: Feb 18, 2011
 * Time: 9:29:12 PM
 *
 * @author Mohammed El Batya
 */
public interface ISeries<DataType> {

  String getName();

  ISeries<DataType> setName(String pName);

  String getStack();

  ISeries<DataType> setStack(String pStack);

  Type getType();

  ISeries<DataType> setType(Type pType);

  Integer getXAxis();

  ISeries<DataType> setXAxis(Integer pXAxis);

  Integer getYAxis();

  ISeries<DataType> setYAxis(Integer pYAxis);

  DataType getData();

  ISeries<DataType> setData(DataType pData);

}
