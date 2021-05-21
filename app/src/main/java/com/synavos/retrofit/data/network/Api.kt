package com.synavos.retrofit.data.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("/api/v1/admins/login")
    fun userLogin(
        @Field("username") username: String,
        @Field("password") password: String
    ) : Call<ResponseBody>


    companion object{
        operator fun invoke() : Api{
            return Retrofit.Builder()
                .baseUrl("http://192.168.2.49:5032")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api::class.java)
        }
    }
}