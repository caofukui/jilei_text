package com.example.jilei_text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jilei_text.base.BaseActivity;
import com.example.jilei_text.bean.HomeBean;
import com.example.jilei_text.bean.LoginBean;
import com.example.jilei_text.mvp.presenter.HomePresenter;
import com.example.jilei_text.mvp.view.IHomeView;

public class MainActivity extends BaseActivity<HomePresenter> implements IHomeView {

    private TextView textView;
    private String token="";
    private String version="1.7";
    private int page=1;
    private String phone="18311256817";
    private String pwd="eWLPHopE945d2ivttHaQTQ==";

    @Override
    protected HomePresenter ProvatePresenter() {
        return new HomePresenter(this);
    }

    @Override
    protected int provateLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        textView=findViewById(R.id.main_tv_title);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.setReMen(phone,pwd);
            }
        });
    }

    @Override
    public void onSuccess(LoginBean loginBean) {
        Toast.makeText(MainActivity.this,""+loginBean.getMessage(),Toast.LENGTH_SHORT).show();
    }
}
