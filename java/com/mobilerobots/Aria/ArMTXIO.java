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

public class ArMTXIO {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArMTXIO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArMTXIO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArMTXIO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArMTXIO(String dev) {
    this(AriaJavaJNI.new_ArMTXIO__SWIG_0(dev), true);
  }

  public ArMTXIO() {
    this(AriaJavaJNI.new_ArMTXIO__SWIG_1(), true);
  }

  public boolean closeIO() {
    return AriaJavaJNI.ArMTXIO_closeIO(swigCPtr, this);
  }

  public boolean isEnabled() {
    return AriaJavaJNI.ArMTXIO_isEnabled(swigCPtr, this);
  }

  public boolean isAnalogSupported() {
    return AriaJavaJNI.ArMTXIO_isAnalogSupported(swigCPtr, this);
  }

  public boolean getRegValue(int reg, SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getRegValue(swigCPtr, this, reg, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public ArMTXIO.Direction getDigitalBankDirection(int bank) {
    return ArMTXIO.Direction.swigToEnum(AriaJavaJNI.ArMTXIO_getDigitalBankDirection(swigCPtr, this, bank));
  }

  public boolean setDigitalBankOutputs(int bank, short val) {
    return AriaJavaJNI.ArMTXIO_setDigitalBankOutputs(swigCPtr, this, bank, val);
  }

  public boolean getDigitalBankInputs(int bank, SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getDigitalBankInputs(swigCPtr, this, bank, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getDigitalBankOutputs(int bank, SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getDigitalBankOutputs(swigCPtr, this, bank, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setDigitalOutputBit(int bank, int bit) {
    return AriaJavaJNI.ArMTXIO_setDigitalOutputBit(swigCPtr, this, bank, bit);
  }

  public boolean getDigitalInputBit(int bank, int bit) {
    return AriaJavaJNI.ArMTXIO_getDigitalInputBit(swigCPtr, this, bank, bit);
  }

  public boolean setPeripheralPowerBankOutputs(int bank, short val) {
    return AriaJavaJNI.ArMTXIO_setPeripheralPowerBankOutputs(swigCPtr, this, bank, val);
  }

  public boolean getPeripheralPowerBankOutputs(int bank, SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getPeripheralPowerBankOutputs(swigCPtr, this, bank, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setPowerOutput(int bank, int bit, boolean on) {
    return AriaJavaJNI.ArMTXIO_setPowerOutput(swigCPtr, this, bank, bit, on);
  }

  public int lock() {
    return AriaJavaJNI.ArMTXIO_lock(swigCPtr, this);
  }

  public int unlock() {
    return AriaJavaJNI.ArMTXIO_unlock(swigCPtr, this);
  }

  public int tryLock() {
    return AriaJavaJNI.ArMTXIO_tryLock(swigCPtr, this);
  }

  public short getFirmwareRevision() {
    return AriaJavaJNI.ArMTXIO_getFirmwareRevision(swigCPtr, this);
  }

  public short getFirmwareVersion() {
    return AriaJavaJNI.ArMTXIO_getFirmwareVersion(swigCPtr, this);
  }

  public short getCompatibilityCode() {
    return AriaJavaJNI.ArMTXIO_getCompatibilityCode(swigCPtr, this);
  }

  public short getFPGAType() {
    return AriaJavaJNI.ArMTXIO_getFPGAType(swigCPtr, this);
  }

  public boolean getDigitalIOInputMon1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getDigitalIOInputMon1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getDigitalIOInputMon2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getDigitalIOInputMon2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getDigitalIOOutputMon1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getDigitalIOOutputMon1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getDigitalIOOutputMon2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getDigitalIOOutputMon2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getLightPole(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getLightPole(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setLightPole(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setLightPole(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getLPCTimeUSec(SWIGTYPE_p_unsigned_int timeUSec) {
    return AriaJavaJNI.ArMTXIO_getLPCTimeUSec(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(timeUSec));
  }

  public SWIGTYPE_p_ArRetFunctor1T_bool_unsigned_int_p_t getLPCTimeUSecCB() {
    long cPtr = AriaJavaJNI.ArMTXIO_getLPCTimeUSecCB(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArRetFunctor1T_bool_unsigned_int_p_t(cPtr, false);
  }

  public boolean setSemaphore1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setSemaphore1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getSemaphore1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getSemaphore1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setSemaphore2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setSemaphore2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getSemaphore2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getSemaphore2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setSemaphore3(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setSemaphore3(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getSemaphore3(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getSemaphore3(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setSemaphore4(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setSemaphore4(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getSemaphore4(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getSemaphore4(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean acquireSemaphore(long sem) {
    return AriaJavaJNI.ArMTXIO_acquireSemaphore(swigCPtr, this, sem);
  }

  public boolean releaseSemaphore(long sem) {
    return AriaJavaJNI.ArMTXIO_releaseSemaphore(swigCPtr, this, sem);
  }

  public boolean getBumperInput(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getBumperInput(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getPowerStatus1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getPowerStatus1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getPowerStatus2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getPowerStatus2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getLIDARSafety(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getLIDARSafety(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getESTOPStatus1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getESTOPStatus1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getESTOPStatus2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getESTOPStatus2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getESTOPStatus3(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getESTOPStatus3(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getESTOPStatus4(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getESTOPStatus4(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean compareESTOPStatus4HighNibbleAgainst(int val) {
    return AriaJavaJNI.ArMTXIO_compareESTOPStatus4HighNibbleAgainst(swigCPtr, this, val);
  }

  public boolean getDigitalOutputControl1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getDigitalOutputControl1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setDigitalOutputControl1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setDigitalOutputControl1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getDigitalOutputControl2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getDigitalOutputControl2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setDigitalOutputControl2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setDigitalOutputControl2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getPeripheralPower1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getPeripheralPower1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setPeripheralPower1(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setPeripheralPower1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getPeripheralPower2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getPeripheralPower2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setPeripheralPower2(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setPeripheralPower2(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getPeripheralPower3(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getPeripheralPower3(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setPeripheralPower3(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setPeripheralPower3(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getMotionPowerStatus(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getMotionPowerStatus(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getLIDARControl(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_getLIDARControl(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean setLIDARControl(SWIGTYPE_p_unsigned_char val) {
    return AriaJavaJNI.ArMTXIO_setLIDARControl(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(val));
  }

  public boolean getAnalogIOBlock1(long analog, SWIGTYPE_p_unsigned_short val) {
    return AriaJavaJNI.ArMTXIO_getAnalogIOBlock1(swigCPtr, this, analog, SWIGTYPE_p_unsigned_short.getCPtr(val));
  }

  public boolean getAnalogIOBlock2(long analog, SWIGTYPE_p_unsigned_short val) {
    return AriaJavaJNI.ArMTXIO_getAnalogIOBlock2(swigCPtr, this, analog, SWIGTYPE_p_unsigned_short.getCPtr(val));
  }

  public boolean setAnalogIOBlock2(long analog, SWIGTYPE_p_unsigned_short val) {
    return AriaJavaJNI.ArMTXIO_setAnalogIOBlock2(swigCPtr, this, analog, SWIGTYPE_p_unsigned_short.getCPtr(val));
  }

  public final static class Direction {
    public final static ArMTXIO.Direction DIGITAL_INPUT = new ArMTXIO.Direction("DIGITAL_INPUT");
    public final static ArMTXIO.Direction DIGITAL_OUTPUT = new ArMTXIO.Direction("DIGITAL_OUTPUT");
    public final static ArMTXIO.Direction INVALID = new ArMTXIO.Direction("INVALID");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Direction swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Direction.class + " with value " + swigValue);
    }

    private Direction(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Direction(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Direction(String swigName, Direction swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Direction[] swigValues = { DIGITAL_INPUT, DIGITAL_OUTPUT, INVALID };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
