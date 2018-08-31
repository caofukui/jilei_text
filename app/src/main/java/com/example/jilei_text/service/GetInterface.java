package com.example.jilei_text.service;

import com.example.jilei_text.bean.HomeBean;
import com.example.jilei_text.bean.LoginBean;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface GetInterface {

    //热门案例接口
    //https://app.tuozhe8.com/api.php/api/Lists/hot_case?version=1.7&token=&page=1
    @POST("api.php/api/Lists/hot_case")
    Observable<HomeBean> getReMen(@Query("version") String version, @Query("token") String token, @Query("page") int page);

    //http://172.17.8.100/movieApi/user/v1/login?phone=18311256817&pwd=eWLPHopE945d2ivttHaQTQ==
    @POST("movieApi/user/v1/login")
    @FormUrlEncoded()
    Observable<LoginBean> getLogin(@Field("phone") String phone, @Field("pwd") String pwd);

}
