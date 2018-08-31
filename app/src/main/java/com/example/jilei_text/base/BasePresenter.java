package com.example.jilei_text.base;

public abstract class BasePresenter<V extends IView> {
    public V view;

    public BasePresenter(V view) {
        this.view = view;
        initModel();
    }
    //初始化model
    protected abstract void initModel();
    //防止内存泄漏
    void onDestroys(){
        view=null;
    }

}


