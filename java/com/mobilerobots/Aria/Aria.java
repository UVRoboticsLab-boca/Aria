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

public class Aria {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Aria(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Aria obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_Aria(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static void init(Aria.SigHandleMethod method, boolean initSockets, boolean sigHandleExitNotShutdown) {
    AriaJavaJNI.Aria_init__SWIG_0(method.swigValue(), initSockets, sigHandleExitNotShutdown);
  }

  public static void init(Aria.SigHandleMethod method, boolean initSockets) {
    AriaJavaJNI.Aria_init__SWIG_1(method.swigValue(), initSockets);
  }

  public static void init(Aria.SigHandleMethod method) {
    AriaJavaJNI.Aria_init__SWIG_2(method.swigValue());
  }

  public static void init() {
    AriaJavaJNI.Aria_init__SWIG_3();
  }

  public static void uninit() {
    AriaJavaJNI.Aria_uninit();
  }

  public static void addInitCallBack(ArFunctor cb, ArListPos.Pos position) {
    AriaJavaJNI.Aria_addInitCallBack(ArFunctor.getCPtr(cb), cb, position.swigValue());
  }

  public static void addUninitCallBack(ArFunctor cb, ArListPos.Pos position) {
    AriaJavaJNI.Aria_addUninitCallBack(ArFunctor.getCPtr(cb), cb, position.swigValue());
  }

  public static void shutdown() {
    AriaJavaJNI.Aria_shutdown();
  }

  public static void exit(int exitCode) {
    AriaJavaJNI.Aria_exit__SWIG_0(exitCode);
  }

  public static void exit() {
    AriaJavaJNI.Aria_exit__SWIG_1();
  }

  public static boolean getRunning() {
    return AriaJavaJNI.Aria_getRunning();
  }

  public static void setDirectory(String directory) {
    AriaJavaJNI.Aria_setDirectory(directory);
  }

  public static String getDirectory() {
    return AriaJavaJNI.Aria_getDirectory();
  }

  public static boolean parseArgs() {
    return AriaJavaJNI.Aria_parseArgs();
  }

  public static void logOptions() {
    AriaJavaJNI.Aria_logOptions();
  }

  public static void setKeyHandler(ArKeyHandler keyHandler) {
    AriaJavaJNI.Aria_setKeyHandler(ArKeyHandler.getCPtr(keyHandler), keyHandler);
  }

  public static ArKeyHandler getKeyHandler() {
    long cPtr = AriaJavaJNI.Aria_getKeyHandler();
    return (cPtr == 0) ? null : new ArKeyHandler(cPtr, false);
  }

  public static void setJoyHandler(ArJoyHandler joyHandler) {
    AriaJavaJNI.Aria_setJoyHandler(ArJoyHandler.getCPtr(joyHandler), joyHandler);
  }

  public static ArJoyHandler getJoyHandler() {
    long cPtr = AriaJavaJNI.Aria_getJoyHandler();
    return (cPtr == 0) ? null : new ArJoyHandler(cPtr, false);
  }

  public static void addExitCallback(ArFunctor functor, int position) {
    AriaJavaJNI.Aria_addExitCallback__SWIG_0(ArFunctor.getCPtr(functor), functor, position);
  }

  public static void addExitCallback(ArFunctor functor) {
    AriaJavaJNI.Aria_addExitCallback__SWIG_1(ArFunctor.getCPtr(functor), functor);
  }

  public static void remExitCallback(ArFunctor functor) {
    AriaJavaJNI.Aria_remExitCallback(ArFunctor.getCPtr(functor), functor);
  }

  public static void setExitCallbacksLogLevel(ArLog.LogLevel level) {
    AriaJavaJNI.Aria_setExitCallbacksLogLevel(level.swigValue());
  }

  public static void exitOld(int exitCode) {
    AriaJavaJNI.Aria_exitOld__SWIG_0(exitCode);
  }

  public static void exitOld() {
    AriaJavaJNI.Aria_exitOld__SWIG_1();
  }

  public static void signalHandlerCB(int sig) {
    AriaJavaJNI.Aria_signalHandlerCB(sig);
  }

  public static void callExitCallbacks() {
    AriaJavaJNI.Aria_callExitCallbacks();
  }

  public static void addParseArgsCB(ArRetFunctor_Bool functor, int position) {
    AriaJavaJNI.Aria_addParseArgsCB__SWIG_0(ArRetFunctor_Bool.getCPtr(functor), functor, position);
  }

  public static void addParseArgsCB(ArRetFunctor_Bool functor) {
    AriaJavaJNI.Aria_addParseArgsCB__SWIG_1(ArRetFunctor_Bool.getCPtr(functor), functor);
  }

  public static void setParseArgLogLevel(ArLog.LogLevel level) {
    AriaJavaJNI.Aria_setParseArgLogLevel(level.swigValue());
  }

  public static void addLogOptionsCB(ArFunctor functor, int position) {
    AriaJavaJNI.Aria_addLogOptionsCB__SWIG_0(ArFunctor.getCPtr(functor), functor, position);
  }

  public static void addLogOptionsCB(ArFunctor functor) {
    AriaJavaJNI.Aria_addLogOptionsCB__SWIG_1(ArFunctor.getCPtr(functor), functor);
  }

  public static boolean deviceConnectionAddCreator(String deviceConnectionType, SWIGTYPE_p_ArRetFunctor3T_ArDeviceConnection_p_char_const_p_char_const_p_char_const_p_t creator) {
    return AriaJavaJNI.Aria_deviceConnectionAddCreator(deviceConnectionType, SWIGTYPE_p_ArRetFunctor3T_ArDeviceConnection_p_char_const_p_char_const_p_char_const_p_t.getCPtr(creator));
  }

  public static String deviceConnectionGetTypes() {
    return AriaJavaJNI.Aria_deviceConnectionGetTypes();
  }

  public static String deviceConnectionGetChoices() {
    return AriaJavaJNI.Aria_deviceConnectionGetChoices();
  }

  public static ArDeviceConnection deviceConnectionCreate(String deviceConnectionType, String port, String defaultInfo, String prefix) {
    long cPtr = AriaJavaJNI.Aria_deviceConnectionCreate__SWIG_0(deviceConnectionType, port, defaultInfo, prefix);
    return (cPtr == 0) ? null : new ArDeviceConnection(cPtr, false);
  }

  public static ArDeviceConnection deviceConnectionCreate(String deviceConnectionType, String port, String defaultInfo) {
    long cPtr = AriaJavaJNI.Aria_deviceConnectionCreate__SWIG_1(deviceConnectionType, port, defaultInfo);
    return (cPtr == 0) ? null : new ArDeviceConnection(cPtr, false);
  }

  public static void setRobotJoyHandler(ArRobotJoyHandler robotJoyHandler) {
    AriaJavaJNI.Aria_setRobotJoyHandler(ArRobotJoyHandler.getCPtr(robotJoyHandler), robotJoyHandler);
  }

  public static ArRobotJoyHandler getRobotJoyHandler() {
    long cPtr = AriaJavaJNI.Aria_getRobotJoyHandler();
    return (cPtr == 0) ? null : new ArRobotJoyHandler(cPtr, false);
  }

  public static ArConfig getConfig() {
    long cPtr = AriaJavaJNI.Aria_getConfig();
    return (cPtr == 0) ? null : new ArConfig(cPtr, false);
  }

  public static ArStringInfoGroup getInfoGroup() {
    long cPtr = AriaJavaJNI.Aria_getInfoGroup();
    return (cPtr == 0) ? null : new ArStringInfoGroup(cPtr, false);
  }

  public static void addRobot(ArRobot robot) {
    AriaJavaJNI.Aria_addRobot(ArRobot.getCPtr(robot), robot);
  }

  public static void delRobot(ArRobot robot) {
    AriaJavaJNI.Aria_delRobot(ArRobot.getCPtr(robot), robot);
  }

  public static ArRobot findRobot(String name) {
    long cPtr = AriaJavaJNI.Aria_findRobot(name);
    return (cPtr == 0) ? null : new ArRobot(cPtr, false);
  }

  public static SWIGTYPE_p_std__listT_ArRobot_p_t getRobotList() {
    long cPtr = AriaJavaJNI.Aria_getRobotList();
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_ArRobot_p_t(cPtr, false);
  }

  public static int getMaxNumLasers() {
    return AriaJavaJNI.Aria_getMaxNumLasers();
  }

  public static void setMaxNumLasers(int maxNumLasers) {
    AriaJavaJNI.Aria_setMaxNumLasers(maxNumLasers);
  }

  public static int getMaxNumSonarBoards() {
    return AriaJavaJNI.Aria_getMaxNumSonarBoards();
  }

  public static void setMaxNumSonarBoards(int maxNumSonarBoards) {
    AriaJavaJNI.Aria_setMaxNumSonarBoards(maxNumSonarBoards);
  }

  public static int getMaxNumBatteries() {
    return AriaJavaJNI.Aria_getMaxNumBatteries();
  }

  public static void setMaxNumBatteries(int maxNumBatteries) {
    AriaJavaJNI.Aria_setMaxNumBatteries(maxNumBatteries);
  }

  public static int getMaxNumLCDs() {
    return AriaJavaJNI.Aria_getMaxNumLCDs();
  }

  public static void setMaxNumLCDs(int maxNumLCDs) {
    AriaJavaJNI.Aria_setMaxNumLCDs(maxNumLCDs);
  }

  public static ArLaser laserCreate(String laserType, int laserNumber, String prefix) {
    long cPtr = AriaJavaJNI.Aria_laserCreate__SWIG_0(laserType, laserNumber, prefix);
    return (cPtr == 0) ? null : new ArLaser(cPtr, false);
  }

  public static ArLaser laserCreate(String laserType, int laserNumber) {
    long cPtr = AriaJavaJNI.Aria_laserCreate__SWIG_1(laserType, laserNumber);
    return (cPtr == 0) ? null : new ArLaser(cPtr, false);
  }

  public static boolean laserAddCreator(String laserType, SWIGTYPE_p_ArRetFunctor2T_ArLaser_p_int_char_const_p_t creator) {
    return AriaJavaJNI.Aria_laserAddCreator(laserType, SWIGTYPE_p_ArRetFunctor2T_ArLaser_p_int_char_const_p_t.getCPtr(creator));
  }

  public static String laserGetTypes() {
    return AriaJavaJNI.Aria_laserGetTypes();
  }

  public static String laserGetChoices() {
    return AriaJavaJNI.Aria_laserGetChoices();
  }

  public static SWIGTYPE_p_ArBatteryMTX batteryCreate(String batteryType, int batteryNumber, String prefix) {
    long cPtr = AriaJavaJNI.Aria_batteryCreate__SWIG_0(batteryType, batteryNumber, prefix);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArBatteryMTX(cPtr, false);
  }

  public static SWIGTYPE_p_ArBatteryMTX batteryCreate(String batteryType, int batteryNumber) {
    long cPtr = AriaJavaJNI.Aria_batteryCreate__SWIG_1(batteryType, batteryNumber);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArBatteryMTX(cPtr, false);
  }

  public static boolean batteryAddCreator(String batteryType, SWIGTYPE_p_ArRetFunctor2T_ArBatteryMTX_p_int_char_const_p_t creator) {
    return AriaJavaJNI.Aria_batteryAddCreator(batteryType, SWIGTYPE_p_ArRetFunctor2T_ArBatteryMTX_p_int_char_const_p_t.getCPtr(creator));
  }

  public static String batteryGetTypes() {
    return AriaJavaJNI.Aria_batteryGetTypes();
  }

  public static String batteryGetChoices() {
    return AriaJavaJNI.Aria_batteryGetChoices();
  }

  public static SWIGTYPE_p_ArLCDMTX lcdCreate(String lcdType, int lcdNumber, String prefix) {
    long cPtr = AriaJavaJNI.Aria_lcdCreate__SWIG_0(lcdType, lcdNumber, prefix);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArLCDMTX(cPtr, false);
  }

  public static SWIGTYPE_p_ArLCDMTX lcdCreate(String lcdType, int lcdNumber) {
    long cPtr = AriaJavaJNI.Aria_lcdCreate__SWIG_1(lcdType, lcdNumber);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArLCDMTX(cPtr, false);
  }

  public static boolean lcdAddCreator(String lcdType, SWIGTYPE_p_ArRetFunctor2T_ArLCDMTX_p_int_char_const_p_t creator) {
    return AriaJavaJNI.Aria_lcdAddCreator(lcdType, SWIGTYPE_p_ArRetFunctor2T_ArLCDMTX_p_int_char_const_p_t.getCPtr(creator));
  }

  public static String lcdGetTypes() {
    return AriaJavaJNI.Aria_lcdGetTypes();
  }

  public static String lcdGetChoices() {
    return AriaJavaJNI.Aria_lcdGetChoices();
  }

  public static SWIGTYPE_p_ArSonarMTX sonarCreate(String sonarType, int sonarNumber, String prefix) {
    long cPtr = AriaJavaJNI.Aria_sonarCreate__SWIG_0(sonarType, sonarNumber, prefix);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArSonarMTX(cPtr, false);
  }

  public static SWIGTYPE_p_ArSonarMTX sonarCreate(String sonarType, int sonarNumber) {
    long cPtr = AriaJavaJNI.Aria_sonarCreate__SWIG_1(sonarType, sonarNumber);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArSonarMTX(cPtr, false);
  }

  public static boolean sonarAddCreator(String sonarType, SWIGTYPE_p_ArRetFunctor2T_ArSonarMTX_p_int_char_const_p_t creator) {
    return AriaJavaJNI.Aria_sonarAddCreator(sonarType, SWIGTYPE_p_ArRetFunctor2T_ArSonarMTX_p_int_char_const_p_t.getCPtr(creator));
  }

  public static String sonarGetTypes() {
    return AriaJavaJNI.Aria_sonarGetTypes();
  }

  public static String sonarGetChoices() {
    return AriaJavaJNI.Aria_sonarGetChoices();
  }

  public static void setMaxNumVideoDevices(long n) {
    AriaJavaJNI.Aria_setMaxNumVideoDevices(n);
  }

  public static long getMaxNumVideoDevices() {
    return AriaJavaJNI.Aria_getMaxNumVideoDevices();
  }

  public static void setMaxNumPTZs(long n) {
    AriaJavaJNI.Aria_setMaxNumPTZs(n);
  }

  public static long getMaxNumPTZs() {
    return AriaJavaJNI.Aria_getMaxNumPTZs();
  }

  public static String getIdentifier() {
    return AriaJavaJNI.Aria_getIdentifier();
  }

  public static void setIdentifier(String identifier) {
    AriaJavaJNI.Aria_setIdentifier(identifier);
  }

  public Aria() {
    this(AriaJavaJNI.new_Aria(), true);
  }

  public final static class SigHandleMethod {
    public final static Aria.SigHandleMethod SIGHANDLE_SINGLE = new Aria.SigHandleMethod("SIGHANDLE_SINGLE");
    public final static Aria.SigHandleMethod SIGHANDLE_THREAD = new Aria.SigHandleMethod("SIGHANDLE_THREAD");
    public final static Aria.SigHandleMethod SIGHANDLE_NONE = new Aria.SigHandleMethod("SIGHANDLE_NONE");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static SigHandleMethod swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + SigHandleMethod.class + " with value " + swigValue);
    }

    private SigHandleMethod(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private SigHandleMethod(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private SigHandleMethod(String swigName, SigHandleMethod swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static SigHandleMethod[] swigValues = { SIGHANDLE_SINGLE, SIGHANDLE_THREAD, SIGHANDLE_NONE };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
