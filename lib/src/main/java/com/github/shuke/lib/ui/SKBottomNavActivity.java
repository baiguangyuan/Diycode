package com.github.shuke.lib.ui;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.github.shuke.lib.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuke on 2018/3/22.
 */

public abstract class SKBottomNavActivity extends SKBaseActivity {

  protected CommonTabLayout mBottomNav;

  @Override public int layoutResId() {
    return R.layout.sk_bottom_nav_activity;
  }

  @Override public void bindViews() {
    super.bindViews();
    bindBottomNav();
  }

  public abstract List<BottomNavItem> createBottomNavItems();

  protected void bindBottomNav() {
    mBottomNav = findViewById(R.id.bottomNav);
    List<BottomNavItem> navItems = createBottomNavItems();
    if (navItems == null || navItems.isEmpty()) {
      throw new IllegalStateException("BottomNavItems required.");
    }
    ArrayList<CustomTabEntity> tabEntities = new ArrayList<>(navItems.size());
    ArrayList<Fragment> fragments = new ArrayList<>(navItems.size());
    for (BottomNavItem item : navItems) {
      tabEntities.add(item.mTabEntity);
      fragments.add(item.mFragment);
    }
    mBottomNav.setTabData(tabEntities, this, R.id.container, fragments);
  }

  public static class BottomNavItem {

    private Fragment mFragment;
    private CustomTabEntity mTabEntity;

    public BottomNavItem(Builder builder) {
      mFragment = builder.fragment;
      mTabEntity = new SimpleTabEntity(builder.title, builder.iconRes, builder.selectedIconRes);
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
