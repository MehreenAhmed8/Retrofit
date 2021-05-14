package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginSucessful : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sucessful)
        val intent1 = intent
        var strUser: String? = intent1.getStringExtra("name")

        val mName= findViewById<TextView>(R.id.name)
        if (strUser != null)
                mName.text=strUser

    }
}