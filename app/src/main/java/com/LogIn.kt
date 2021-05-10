package com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fun_fact.MainActivity
import com.example.fun_fact.R
import com.example.fun_fact.databinding.ActivityLogInBinding

class LogIn : AppCompatActivity() {
    var binding : ActivityLogInBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)

        setContentView(binding?.root)
        setUp()
    }

    private fun setUp() {
        binding?.nextButton?.setOnClickListener(){
            var username = binding?.usernameInputText?.text.toString()
            var password = binding?.passwordTextInput?.text.toString()

            val realUsername =  "CrystalTech"
            val realPassword = "password123"

            if(username == realUsername && password == realPassword){
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Wrong details: Input Username: $realUsername and Password: $realPassword", Toast.LENGTH_SHORT).show()
            }
        }
        binding?.cancelButton?.setOnClickListener(){
           binding?.usernameInputText?.text?.clear()
           binding?.passwordTextInput?.text?.clear()
        }
    }


}