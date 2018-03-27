package com.github.shuke.lib.app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import com.github.shuke.lib.util.L;

/******************************************************************
 * Activity基类无MVP
 * Created by shuke on 2018/3/26
 * Copyright (c) 2018 m.neeqm.cn Inc. All Rights Reserved.
 ******************************************************************/

public abstract class SKBaseActivity extends AppCompatActivity implements ILayoutContract {

  protected final String TAG = getClass().getSimpleName();

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    int resId = layoutResId();
    if (resId == 0) {
      throw new IllegalStateException("Invalid resId return from method layoutResId!");
    }
    setContentView(resId);
    initArgs(getIntent().getExtras());
    initViews(this, ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0));
  }

  @Override public void initArgs(@Nullable Bundle args) {}

  @Override public void initViews(@NonNull Context context, @NonNull View view) {}

  @Override protected void onResume() {
    super.onResume();
    L.i(TAG, "onResume...");
  }

  @Override protected void onPause() {
    super.onPause();
    L.i(TAG, "onPause...");
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    L.i(TAG, "onDestroy...");
  }
}
