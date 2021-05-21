package com.synavos.retrofit.ui.auth

import com.synavos.retrofit.data.network.response.Data

interface AuthListener {

    fun onStarted()
    fun onSuccess(data: Data)
    fun onFailure(message: String)
}