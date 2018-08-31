package com.example.jilei_text.mvp.view;

import com.example.jilei_text.base.IView;
import com.example.jilei_text.bean.HomeBean;
import com.example.jilei_text.bean.LoginBean;

public interface IHomeView extends IView {
    void onSuccess(LoginBean loginBean);
}
