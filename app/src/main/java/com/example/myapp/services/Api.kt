package com.example.myapp

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Multipart
import retrofit2.http.POST

interface Api {
    @POST("/api/v1/admins/login")
    fun userLogin(
       @Body user : User
    ):Call<LoginResponse>
}