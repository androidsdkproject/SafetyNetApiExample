package com.example.android1.safetynetapiexample;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Kamal Verma on 24-August-2017
 * Kamalverma1207@gmail.com
 * Precise Automation and Robotics
 **/


public interface RetrofitInterface {

    @POST("verify")
    Call<Response> getResult(@Body JWSRequest request, @Query("key") String apiKey);
}