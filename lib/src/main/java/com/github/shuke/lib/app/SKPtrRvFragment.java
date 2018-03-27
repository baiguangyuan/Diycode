package com.github.shuke.lib.app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.github.shuke.lib.R;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.lce.MvpLceView;
import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;

/******************************************************************
 * RecyclerView MVP基类
 * Created by shuke on 2018/3/26
 * Copyright (c) 2018 m.neeqm.cn Inc. All Rights Reserved.
 ******************************************************************/

public abstract class SKPtrRvFragment<A extends RecyclerView.Adapter, M, V extends MvpLceView<M>, P extends MvpPresenter<V>>
    extends SKMvpFragment<PtrClassicFrameLayout, M, V, P> implements ILayoutContract {

  protected RecyclerView recyclerView;
  protected A adapter;

  @Override public int layoutResId() {
    return R.layout.sk_ptr_rv_fragment;
  }

  @Override public void initViews(@NonNull Context context, @NonNull View view) {
    contentView.setLastUpdateTimeRelateObject(this);
    contentView.setPtrHandler(new PtrDefaultHandler() {
      @Override public void onRefreshBegin(PtrFrameLayout frame) {
        SKPtrRvFragment.this.onRefresh();
      }
    });

    recyclerView = view.findViewById(R.id.recyclerView);
    recyclerView.setLayoutManager(createLayoutManager(context));
    recyclerView.setAdapter(adapter = createAdapter(context, recyclerView));
  }

  public abstract void onRefresh();

  public RecyclerView.LayoutManager createLayoutManager(@NonNull Context context) {
    return new LinearLayoutManager(context);
  }

  public abstract A createAdapter(@NonNull Context context, RecyclerView recyclerView);

  @Override public void showContent() {
    super.showContent();
    contentView.refreshComplete();
  }

  @Override public void showError(Throwable e, boolean pullToRefresh) {
    super.showError(e, pullToRefresh);
    contentView.refreshComplete();
  }

  @Override protected String getErrorMessage(Throwable e, boolean pullToRefresh) {
    return e.getMessage();
  }
}
