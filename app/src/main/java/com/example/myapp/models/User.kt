package com.example.myapp

import com.google.gson.annotations.SerializedName

data class User(@field:SerializedName("username") val username :String, @field:SerializedName("password") val password:String)