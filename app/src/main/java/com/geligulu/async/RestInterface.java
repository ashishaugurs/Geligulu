package com.geligulu.async;



import com.geligulu.webservice.RequestURL;
import com.model.Deactivate;
import com.model.LoginModel;
import com.model.PlanModel;
import com.model.ResendEmail;
import com.model.SignUpModel;

import java.util.HashMap;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface RestInterface {

    @FormUrlEncoded
    @POST("ResendemailVerifyApi")
    Call<ResendEmail> getEmail(@FieldMap HashMap<String, Object> param);


    @FormUrlEncoded
    @POST("DeactivateAccountApi")
    Call<Deactivate> getDeactivate(@FieldMap HashMap<String, Object> param);

    @FormUrlEncoded
    @POST("socialLogin")
    Call<LoginModel> getUserData(@FieldMap HashMap<String, Object> param);

    @FormUrlEncoded
    @POST("auth/registerApi")
    Call<SignUpModel> getRegistered(@FieldMap HashMap<String, Object> param);

    @FormUrlEncoded
    @POST("PlanApi")
    Call<PlanModel> getPlan(@FieldMap HashMap<String, Object> param);


    @POST("auth/loginApi")
    Call<LoginModel> uploadMultipleFiles(@Body RequestBody file);
}
