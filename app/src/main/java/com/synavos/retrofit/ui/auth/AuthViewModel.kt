package com.synavos.retrofit.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.synavos.retrofit.data.repository.UserRepository
import com.synavos.retrofit.utils.Coroutines


class AuthViewModel : ViewModel() {

    var username: String? = null
    var password: String? = null
    var authListener: AuthListener? = null


    fun onLoginButtonClick(view: View){
        authListener?.onStarted()
        if (username.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid email or password")
            return
        }

        Coroutines.main {
            val response = UserRepository().userLogin(username!!, password!!)
            if (response.isSuccessful) {
                authListener?.onSuccess(response.body()?.data!!)
            } else {
                authListener?.onFailure("Error Code: ${response.code()}")
            }
        }
    }

}