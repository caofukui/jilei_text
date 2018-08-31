package com.example.jilei_text.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    public P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(provateLayoutId());
        initView();
        initListener();
        initData();
        presenter=ProvatePresenter();

    }

    //创建presenter
    protected abstract P ProvatePresenter();
    //初始数据
    protected void initData(){}
    //监听
    protected void initListener() {

    }
    //初始化控件
    protected void initView(){}

    protected abstract int provateLayoutId();


    //解决内存泄漏
    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroys();
    }
}
