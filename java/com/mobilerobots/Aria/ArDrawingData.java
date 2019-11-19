/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2015 Adept Technology, Inc.
Copyright (C) 2016-2018 Omron Adept Technologies, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArDrawingData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArDrawingData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArDrawingData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArDrawingData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArDrawingData(String shape, ArColor primaryColor, int size, int layer, long defaultRefreshTime, String visibility) {
    this(AriaJavaJNI.new_ArDrawingData__SWIG_0(shape, ArColor.getCPtr(primaryColor), primaryColor, size, layer, defaultRefreshTime, visibility), true);
  }

  public ArDrawingData(String shape, ArColor primaryColor, int size, int layer, long defaultRefreshTime) {
    this(AriaJavaJNI.new_ArDrawingData__SWIG_1(shape, ArColor.getCPtr(primaryColor), primaryColor, size, layer, defaultRefreshTime), true);
  }

  public ArDrawingData(String shape, ArColor primaryColor, int size, int layer) {
    this(AriaJavaJNI.new_ArDrawingData__SWIG_2(shape, ArColor.getCPtr(primaryColor), primaryColor, size, layer), true);
  }

  public ArDrawingData(String shape, ArColor primaryColor, int size, int layer, long defaultRefreshTime, ArColor secondaryColor, String visibility) {
    this(AriaJavaJNI.new_ArDrawingData__SWIG_3(shape, ArColor.getCPtr(primaryColor), primaryColor, size, layer, defaultRefreshTime, ArColor.getCPtr(secondaryColor), secondaryColor, visibility), true);
  }

  public ArDrawingData(String shape, ArColor primaryColor, int size, int layer, long defaultRefreshTime, ArColor secondaryColor) {
    this(AriaJavaJNI.new_ArDrawingData__SWIG_4(shape, ArColor.getCPtr(primaryColor), primaryColor, size, layer, defaultRefreshTime, ArColor.getCPtr(secondaryColor), secondaryColor), true);
  }

  public String getShape() {
    return AriaJavaJNI.ArDrawingData_getShape(swigCPtr, this);
  }

  public ArColor getPrimaryColor() {
    return new ArColor(AriaJavaJNI.ArDrawingData_getPrimaryColor(swigCPtr, this), true);
  }

  public int getSize() {
    return AriaJavaJNI.ArDrawingData_getSize(swigCPtr, this);
  }

  public int getLayer() {
    return AriaJavaJNI.ArDrawingData_getLayer(swigCPtr, this);
  }

  public long getDefaultRefreshTime() {
    return AriaJavaJNI.ArDrawingData_getDefaultRefreshTime(swigCPtr, this);
  }

  public ArColor getSecondaryColor() {
    return new ArColor(AriaJavaJNI.ArDrawingData_getSecondaryColor(swigCPtr, this), true);
  }

  public String getVisibility() {
    return AriaJavaJNI.ArDrawingData_getVisibility(swigCPtr, this);
  }

  public void setShape(String shape) {
    AriaJavaJNI.ArDrawingData_setShape(swigCPtr, this, shape);
  }

  public void setPrimaryColor(ArColor color) {
    AriaJavaJNI.ArDrawingData_setPrimaryColor(swigCPtr, this, ArColor.getCPtr(color), color);
  }

  public void setSize(int size) {
    AriaJavaJNI.ArDrawingData_setSize(swigCPtr, this, size);
  }

  public void setLayer(int layer) {
    AriaJavaJNI.ArDrawingData_setLayer(swigCPtr, this, layer);
  }

  public void setDefaultRefreshTime(long refreshTime) {
    AriaJavaJNI.ArDrawingData_setDefaultRefreshTime(swigCPtr, this, refreshTime);
  }

  public void setSecondaryColor(ArColor color) {
    AriaJavaJNI.ArDrawingData_setSecondaryColor(swigCPtr, this, ArColor.getCPtr(color), color);
  }

  public void setVisibility(String visibility) {
    AriaJavaJNI.ArDrawingData_setVisibility(swigCPtr, this, visibility);
  }

  public final static int DEFAULT_REFRESH_TIME = AriaJavaJNI.ArDrawingData_DEFAULT_REFRESH_TIME_get();

}
