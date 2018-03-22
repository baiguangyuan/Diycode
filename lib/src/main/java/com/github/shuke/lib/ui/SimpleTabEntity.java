package com.github.shuke.lib.ui;

import com.flyco.tablayout.listener.CustomTabEntity;

/**
 * Created by shuke on 2018/3/22.
 */

public class SimpleTabEntity implements CustomTabEntity {

  private String mTitle;
  private int mIconRes;
  private int mSelectedIconRes;

  public SimpleTabEntity(String title, int iconRes, int selectedIconRes) {
    mTitle = title;
    mIconRes = iconRes;
    mSelectedIconRes = selectedIconRes;
  }

  @Override public String getTabTitle() {
    return mTitle;
  }

  @Override public int getTabSelectedIcon() {
    return mSelectedIconRes;
  }

  @Override public int getTabUnselectedIcon() {
    return mIconRes;
  }
}
