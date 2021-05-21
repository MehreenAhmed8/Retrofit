package com.synavos.retrofit.data.repository

import com.synavos.retrofit.data.network.Api
import com.synavos.retrofit.data.network.response.LoginResponse
import retrofit2.Response

class UserRepository {
    suspend fun userLogin(username: String, password: String): Response<LoginResponse> {
        return Api().userLogin(username, password)
    }

}