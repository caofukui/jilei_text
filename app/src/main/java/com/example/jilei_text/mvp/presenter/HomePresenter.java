package com.example.jilei_text.mvp.presenter;

import com.example.jilei_text.base.BasePresenter;
import com.example.jilei_text.bean.HomeBean;
import com.example.jilei_text.bean.LoginBean;
import com.example.jilei_text.mvp.model.HomeModel;
import com.example.jilei_text.mvp.model.IHomeModel;
import com.example.jilei_text.mvp.view.IHomeView;

public class HomePresenter extends BasePresenter<IHomeView> {

    private HomeModel homeModel;

    public HomePresenter(IHomeView view) {
        super(view);
    }

    @Override
    protected void initModel() {
        homeModel=new HomeModel();
    }

    public void setReMen(String phone, String pwd){
        homeModel.getReMen(phone, pwd, new IHomeModel() {
            @Override
            public void onSuccess(LoginBean loginBean) {
                view.onSuccess(loginBean);
            }
        });
    }

}
