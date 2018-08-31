package com.example.jilei_text.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment<P extends BasePresenter> extends Fragment {

    protected P presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(provateLayoutId(), container, false);
        initView(view);
        presenter=provatePresenter();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        initListener();
    }

    //设置监听
    protected abstract void initListener();

    //初始化数据
    protected void initData(){}

    //创建presenter
    protected abstract P provatePresenter();

    //初始化控件
    protected abstract void initView(View view);

    //加载布局
    protected abstract int provateLayoutId();

    //解决内存泄漏

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroys();
    }
}
