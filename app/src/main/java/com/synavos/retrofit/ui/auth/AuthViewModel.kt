package com.synavos.retrofit.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.synavos.retrofit.data.repository.UserRepository


class AuthViewModel : ViewModel() {

    var username: String? = null
    var password: String? = null

    var authListener: AuthListener? = null


    fun onLoginButtonClick(view: View){
        authListener?.onStarted()
        if(username.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Invalid email or password")
            return
        }

        val loginResponse = UserRepository().userLogin(username!!, password!!)
        authListener?.onSuccess(loginResponse)
    }

}