package com.github.shuke.lib.app;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.github.shuke.lib.R;
import java.util.ArrayList;
import java.util.List;

/******************************************************************
 * 底部导航基类
 * Created by shuke on 2018/3/26
 * Copyright (c) 2018 m.neeqm.cn Inc. All Rights Reserved.
 ******************************************************************/

public abstract class SKBottomNavActivity extends SKBaseActivity {

  protected CommonTabLayout mBottomNav;

  @Override public int layoutResId() {
    return R.layout.sk_bottom_nav_activity;
  }

  @Override public void initViews(@NonNull Context context, @NonNull View view) {
    super.initViews(context, view);
    initBottomNav();
  }

  public abstract List<BottomNavItem> createBottomNavItems();

  protected void initBottomNav() {
    List<BottomNavItem> navItems = createBottomNavItems();
    if (navItems == null || navItems.isEmpty()) {
      throw new IllegalStateException("BottomNavItem is required");
    }
    ArrayList<CustomTabEntity> tabEntities = new ArrayList<>(navItems.size());
    ArrayList<Fragment> fragments = new ArrayList<>(navItems.size());
    for (BottomNavItem item : navItems) {
      tabEntities.add(item.tabEntity);
      fragments.add(item.fragment);
    }
    mBottomNav = findViewById(R.id.bottomNav);
    mBottomNav.setTabData(tabEntities, this, R.id.container, fragments);
  }

  public static class BottomNavItem {

    private Fragment fragment;
    private CustomTabEntity tabEntity;

    public BottomNavItem(final Builder builder) {
      fragment = builder.fragment;
      tabEntity = new CustomTabEntity() {
        @Override public String getTabTitle() {
          return builder.title;
        }

        @Override public int getTabSelectedIcon() {
          return builder.selectedIconRes != 0 ? builder.selectedIconRes : builder.iconRes;
        }

        @Override public int getTabUnselectedIcon() {
          return builder.iconRes;
        }
      };
    }

    public static class Builder {

      private String title;
      private int iconRes;
      private int selectedIconRes;
      private Fragment fragment;

      public Builder(@DrawableRes int iconRes) {
        this.iconRes = iconRes;
      }

      public Builder selectedIcon(@DrawableRes int selectedIconRes) {
        this.selectedIconRes = selectedIconRes;
        return this;
      }

      public Builder title(@NonNull String title) {
        this.title = title;
        return this;
      }

      public Builder fragment(@NonNull Fragment fragment) {
        this.fragment = fragment;
        return this;
      }

      public BottomNavItem build() {
        if (fragment == null) {
          throw new IllegalStateException("Fragment required.");
        }
        return new BottomNavItem(this);
      }
    }
  }
}
