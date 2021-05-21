package com.synavos.retrofit.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.synavos.retrofit.R
import com.synavos.retrofit.data.network.response.Data
import com.synavos.retrofit.databinding.ActivityLoginBinding
import com.synavos.retrofit.utils.hide
import com.synavos.retrofit.utils.show
import com.synavos.retrofit.utils.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel

        viewModel.authListener = this

    }


    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSuccess(data: Data) {

        progress_bar.hide()
        toast("${data.username} is Login Sucessfully ")

    }

    override fun onFailure(message: String) {
        progress_bar.hide()
        toast(message)
    }
}