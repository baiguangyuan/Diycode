package com.github.shuke.lib.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.ViewGroup;
import java.util.List;

/******************************************************************
 * FragmentPagerAdapter
 * @see android.support.v4.app.FragmentPagerAdapter
 * Created by shuke on 2018/3/26
 * Copyright (c) 2018 m.neeqm.cn Inc. All Rights Reserved.
 ******************************************************************/

public class SKFragmentAdapter extends FragmentPagerAdapter {

  private final List<PagerProvider> mProviders;

  public SKFragmentAdapter(FragmentManager fm, List<PagerProvider> providers) {
    super(fm);
    this.mProviders = providers;
  }

  @Nullable @Override public CharSequence getPageTitle(int position) {
    return mProviders.get(position).title;
  }

  @Override public Fragment getItem(int position) {
    return mProviders.get(position).fragment;
  }

  @Override public int getCount() {
    return mProviders.size();
  }

  @Override public void destroyItem(ViewGroup container, int position, Object object) {
    // 覆写destroyItem并且空实现,这样每个Fragment中的视图就不会被销毁
    // super.destroyItem(container, position, object);
  }

  @Override public int getItemPosition(@NonNull Object object) {
    return PagerAdapter.POSITION_NONE;
  }

  public static class PagerProvider {

    private String title;
    private Fragment fragment;

    public PagerProvider(String title, Fragment fragment) {
      this.title = title;
      this.fragment = fragment;
    }
  }
}
