package com.example.comp2000hk_cw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvForgotPassword: TextView
    private lateinit var tvCreateAccount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvForgotPassword = findViewById(R.id.tvForgotPassword)
        tvCreateAccount = findViewById(R.id.tvCreateAccount)

        btnLogin.setOnClickListener {
//            val email = etEmail.text.toString().trim()
//            val pwd = etPassword.text.toString().trim()
//            validate email & pwd

            val intent = Intent(this, GuestMainActivity::class.java)
            startActivity(intent)
            finish()
        }

        tvCreateAccount.setOnClickListener {
            val intent = Intent(this, GuestCreateAccountActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}