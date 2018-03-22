package com.github.shuke.lib.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by shuke on 2018/3/22.
 */

public abstract class SKBaseActivity extends AppCompatActivity implements LayoutContract {

  protected final String TAG = getClass().getSimpleName();

  @Override public int menuResId() {
    return 0;
  }

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(layoutResId());
    initArgs(getIntent().getExtras());
    bindViews();
  }

  @Override public void initArgs(@Nullable Bundle args) {
  }

  @Override public void bindViews() {
  }
}
