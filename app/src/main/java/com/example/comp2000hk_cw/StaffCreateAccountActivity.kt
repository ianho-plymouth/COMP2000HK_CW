package com.example.comp2000hk_cw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class StaffCreateAccountActivity : ComponentActivity() {
    private lateinit var btnBack: Button
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_create_account)

        btnBack = findViewById(R.id.btnBack)
        btnRegister = findViewById(R.id.btnRegister)

        btnBack.setOnClickListener {
            val intent = Intent(this, StaffMainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnRegister.setOnClickListener {
            Toast.makeText(
                this,
                "Registered",
                Toast.LENGTH_LONG
            ).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}