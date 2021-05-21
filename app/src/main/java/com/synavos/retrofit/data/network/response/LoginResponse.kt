package com.synavos.retrofit.data.network.response

data class LoginResponse(
    val X_Auth: String,
    val data: Data,
    val opt: Boolean,
    val error: String?
)