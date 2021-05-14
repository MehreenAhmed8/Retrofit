package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.MainThread
import androidx.appcompat.widget.Toolbar;
import com.example.myapp.services.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signIn = findViewById<Button>(R.id.sign_in)
        signIn.setOnClickListener{
            val mUsername =  findViewById<EditText>(R.id.username)
            val mPassword =  findViewById<EditText>(R.id.password)
            validate(mUsername,mPassword)
            val user = User(mUsername.text.toString(),mPassword.text.toString())
            RetrofitClient.instance.userLogin(user)
                    .enqueue(object: Callback<LoginResponse> {
                        override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                            Toast.makeText(applicationContext, "Error!!!", Toast.LENGTH_LONG).show()
                        }

                        override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                            if(!(response.body()==null))
                            {
                                Toast.makeText (this@MainActivity,"sucessfull",Toast.LENGTH_LONG).show()
                                val intent2 = Intent(this@MainActivity, LoginSucessful::class.java)
                                intent2.putExtra("name",  mUsername.text.toString())
                                startActivity(intent2)

                            }else{
                                Toast.makeText(applicationContext,"Incorrect Usermane or password", Toast.LENGTH_LONG).show()
                            }

                        }
                    })
        }
    }

fun validate(username: EditText  , password : EditText)
{
    if(username.text.toString().isEmpty() )
    {

        username.error = "Please enter valid username"
        username.requestFocus()
    }
    if(password.text.toString().isEmpty() )
    {
        password.error="Please enter valid password!"
        password.requestFocus()
    }
}


}