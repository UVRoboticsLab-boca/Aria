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

public class Ar3DPoint {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Ar3DPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Ar3DPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_Ar3DPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Ar3DPoint() {
    this(AriaJavaJNI.new_Ar3DPoint__SWIG_0(), true);
  }

  public Ar3DPoint(double x, double y, double z) {
    this(AriaJavaJNI.new_Ar3DPoint__SWIG_1(x, y, z), true);
  }

  public double dot(Ar3DPoint c) {
    return AriaJavaJNI.Ar3DPoint_dot(swigCPtr, this, Ar3DPoint.getCPtr(c), c);
  }

  public Ar3DPoint cross(Ar3DPoint c) {
    return new Ar3DPoint(AriaJavaJNI.Ar3DPoint_cross(swigCPtr, this, Ar3DPoint.getCPtr(c), c), true);
  }

  public void print(String head) {
    AriaJavaJNI.Ar3DPoint_print__SWIG_0(swigCPtr, this, head);
  }

  public void print() {
    AriaJavaJNI.Ar3DPoint_print__SWIG_1(swigCPtr, this);
  }

  public double getX() {
    return AriaJavaJNI.Ar3DPoint_getX(swigCPtr, this);
  }

  public double getY() {
    return AriaJavaJNI.Ar3DPoint_getY(swigCPtr, this);
  }

  public double getZ() {
    return AriaJavaJNI.Ar3DPoint_getZ(swigCPtr, this);
  }

  public void setX(double x) {
    AriaJavaJNI.Ar3DPoint_setX(swigCPtr, this, x);
  }

  public void setY(double y) {
    AriaJavaJNI.Ar3DPoint_setY(swigCPtr, this, y);
  }

  public void setZ(double z) {
    AriaJavaJNI.Ar3DPoint_setZ(swigCPtr, this, z);
  }

}
