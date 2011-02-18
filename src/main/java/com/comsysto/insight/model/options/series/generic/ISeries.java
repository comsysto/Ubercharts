package com.comsysto.insight.model.options.series.generic;

import com.comsysto.insight.model.options.Type;

/**
 * Date: Feb 18, 2011
 * Time: 9:29:12 PM
 *
 * @author Mohammed El Batya
 */
public interface ISeries<DataType, ImplementationType extends AbstractSeries> {

  String getName();

  ImplementationType setName(String pName);

  String getStack();

  ImplementationType setStack(String pStack);

  Type getType();

  ImplementationType setType(Type pType);

  Integer getxAxis();

  ImplementationType setxAxis(Integer pXAxis);

  Integer getyAxis();

  ImplementationType setyAxis(Integer pYAxis);

  DataType getData();

  ImplementationType setData(DataType pData);
}
