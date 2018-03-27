package com.github.shuke.lib.app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.shuke.lib.util.L;

/******************************************************************
 * Fragment基类无MVP
 * Created by shuke on 2018/3/26
 * Copyright (c) 2018 m.neeqm.cn Inc. All Rights Reserved.
 ******************************************************************/

public abstract class SKBaseFragment extends Fragment implements ILayoutContract {

  protected String TAG = getClass().getSimpleName();
  private boolean mIsViewCreated;
  private boolean mIsVisibleToUser;

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initArgs(getArguments());
  }

  @Override public void initArgs(@Nullable Bundle args) {}

  @Nullable @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    int resId = layoutResId();
    if (resId == 0) {
      throw new IllegalStateException("Invalid resId return from method layoutResId!");
    }
    return inflater.inflate(resId, container, false);
  }

  @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    initViews(view.getContext(), view);
    mIsViewCreated = true;
  }

  @Override public void initViews(@NonNull Context context, @NonNull View view) {}

  @Override public void onResume() {
    super.onResume();
    if (mIsVisibleToUser) {
      onVisibleToUser(true);
    }
  }

  @Override public void onPause() {
    super.onPause();
    if (mIsVisibleToUser) {
      onVisibleToUser(false);
    }
  }

  @Override public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    L.i(TAG, "setUserVisibleHint: "
        + isVisibleToUser
        + " mIsViewCreated: "
        + mIsViewCreated
        + " isResumed: "
        + isResumed()
        + " isAdded: "
        + isAdded()
        + " mIsVisibleToUser: "
        + mIsVisibleToUser);
    if (mIsVisibleToUser != isVisibleToUser) {
      mIsVisibleToUser = isVisibleToUser;
      if (mIsViewCreated) {
        if (isResumed()) {
          onVisibleToUser(mIsVisibleToUser);
        }
      }
    }
  }

  @Override public void onHiddenChanged(boolean hidden) {
    super.onHiddenChanged(hidden);
    L.i(TAG, "onHiddenChanged: "
        + hidden
        + " mIsViewCreated: "
        + mIsViewCreated
        + " isResumed: "
        + isResumed()
        + " isAdded: "
        + isAdded()
        + " mIsVisibleToUser: "
        + mIsVisibleToUser);
    boolean isVisibleToUser = !hidden;
    if (mIsVisibleToUser != isVisibleToUser) {
      mIsVisibleToUser = isVisibleToUser;
      if (mIsViewCreated) {
        if (isResumed()) {
          onVisibleToUser(mIsVisibleToUser);
        }
      }
    }
  }

  @Override public void onDestroyView() {
    mIsViewCreated = false;
    mIsVisibleToUser = false;
    super.onDestroyView();
  }

  public void onVisibleToUser(boolean isVisibleToUser) {
    L.i(TAG, "onVisibleToUser: " + isVisibleToUser);
  }
}
