package com.github.shuke.lib.util;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/******************************************************************
 * 日志工具类
 * Created by shuke on 2018/3/26
 * Copyright (c) 2018 m.neeqm.cn Inc. All Rights Reserved.
 ******************************************************************/

public final class L {

  public static boolean DEBUG = true;

  public static void init(String tag, boolean debug) {
    L.DEBUG = debug;
    Logger.init(tag)
        .logLevel(debug ? LogLevel.FULL : LogLevel.NONE)
        .hideThreadInfo()
        .methodCount(0);
  }

  public static void i(String tag, String msg, Object... args) {
    if (DEBUG) {
      Logger.t(tag).i(msg, args);
    }
  }

  public static void d(String tag, String msg, Object... args) {
    if (DEBUG) {
      Logger.t(tag).d(msg, args);
    }
  }

  public static void w(String tag, String msg, Object... args) {
    if (DEBUG) {
      Logger.t(tag).w(msg, args);
    }
  }

  public static void e(String tag, String msg, Object... args) {
    if (DEBUG) {
      Logger.t(tag).e(msg, args);
    }
  }

  public static void json(String tag, String msg) {
    if (DEBUG) {
      Logger.t(tag).json(msg);
    }
  }
}
