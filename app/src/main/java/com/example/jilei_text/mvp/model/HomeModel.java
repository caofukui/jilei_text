package com.example.jilei_text.mvp.model;

import com.example.jilei_text.bean.HomeBean;
import com.example.jilei_text.bean.LoginBean;
import com.example.jilei_text.utils.RetrofitUtils;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class HomeModel {

    public void getReMen(String phone, String pwd, final IHomeModel iHomeModel){
        Observable<LoginBean> observable = RetrofitUtils.getInstance().getInterface().getLogin(phone, pwd);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        iHomeModel.onSuccess(loginBean);
                    }
                });
    }

}
