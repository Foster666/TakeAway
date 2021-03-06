package com.sx.mvp.presenter.api;

import com.sx.mvp.model.net.ResponseInfo;
import com.sx.mvp.utils.Constant;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @Author sunxin
 * @Date 2017/5/19 22:50
 * @Description Retrofit对请求参数的请求方式的拼装
 */

public interface ResponseInfoApi {

    //登录
    @GET(Constant.LOGIN)
    Call<ResponseInfo> login(
            @Query("username")
            String username,
            @Query("password")
            String password
    );
}
