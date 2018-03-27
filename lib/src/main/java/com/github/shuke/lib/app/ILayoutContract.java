package com.github.shuke.lib.app;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

/******************************************************************
 * 布局接口，Activity 和 Fragment 需要实现的接口
 * Created by shuke on 2018/3/26
 * Copyright (c) 2018 m.neeqm.cn Inc. All Rights Reserved.
 ******************************************************************/

public interface ILayoutContract {

  /**
   * 布局资源ID like R.layout.*
   */
  @LayoutRes int layoutResId();

  /**
   * 初始化参数
   *
   * @param args 启动参数
   * @see Intent#getExtras()
   * @see Fragment#getArguments()
   */
  void initArgs(@Nullable Bundle args);

  /**
   * 初始化View
   *
   * @param context 上下文
   * @param view 根布局 Fragment
   */
  void initViews(@NonNull Context context, @NonNull View view);
}
