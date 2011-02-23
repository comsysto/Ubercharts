package com.comsysto.insight.model.options.series.impl;

import com.comsysto.insight.model.options.Point;
import com.comsysto.insight.model.options.series.generic.AbstractSeries;

import java.util.Collection;

/**
 * This class is temporary deprecated, because there are serialisation problems with gson. <p/> The deprecated
 * annotation will be removed when the serialisation issues are solved. <p/> Date: Feb 18, 2011 Time: 9:50:16 PM
 *
 * @author Mohammed El Batya
 */
@Deprecated
public class MixedSeries extends AbstractSeries<Object[]> {


  /**
   *
   */
  @Deprecated
  public MixedSeries() {
  }

  /** @param pName  */
  @Deprecated
  public MixedSeries(String pName) {
    super(pName);
  }

  /**
   * @param pMixedData
   *
   * @return
   */
  @Deprecated
  public MixedSeries setData(Object[] pMixedData) {
    data = pMixedData;
    return this;
  }

  /**
   * @param pMixedData
   *
   * @return
   */
  @Deprecated
  public MixedSeries setData(Collection<?> pMixedData) {

    for (Object data : pMixedData) {

      if (!(isNumberOrPoint(data) || isValidArray(data))) {
        throw new IllegalArgumentException("The mixed data series can only contain Numbers, Points, and Arrays which " +
          "have the length of 2 and contain a Number-Number(X/Y) pair or a String-Number(Label/Y) pair.");
      }

    }

    return setData(pMixedData.toArray());
  }

  /**
   * @param pObject
   *
   * @return
   */
  @Deprecated
  private boolean isNumberOrPoint(Object pObject) {
    return (pObject instanceof Number || pObject instanceof Point);
  }

  /**
   * @param pObject
   *
   * @return
   */
  @Deprecated
  private boolean isValidArray(Object pObject) {

    boolean isValid;

    if (pObject instanceof Object[]) {
      Object[] array = (Object[]) pObject;

      if (array.length == 2) {
        if (array[0] instanceof String && array[1] instanceof Number) {
          isValid = true;
        }
        else if (array[0] instanceof Number && array[1] instanceof Number) {
          isValid = true;
        }
        else {
          isValid = false;
        }

      }
      else {
        isValid = false;
      }

    }
    else {
      isValid = false;
    }

    return isValid;
  }

}
