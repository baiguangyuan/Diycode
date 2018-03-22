package com.github.shuke.lib.ui;

import android.app.Fragment;
import android.content.ContentProvider;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.MenuRes;
import android.support.annotation.Nullable;

/**
 * Created by shuke on 2018/3/22.
 */

public interface LayoutContract {

  /**
   * 布局资源ID like R.layout.*
   */
  @LayoutRes int layoutResId();

  /**
   * 布局资源ID like R.menu.*
   */
  @MenuRes int menuResId();

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
   */
  void bindViews();
}
