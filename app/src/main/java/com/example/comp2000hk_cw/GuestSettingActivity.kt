package com.example.comp2000hk_cw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class GuestSettingActivity : ComponentActivity() {
    private lateinit var btnBack: Button
    private lateinit var btnReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_setting)

        btnBack = findViewById(R.id.btnBack)
        btnReset = findViewById(R.id.btnReset)

        btnBack.setOnClickListener {
            val intent = Intent(this, GuestMainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnReset.setOnClickListener {
            Toast.makeText(
                this,
                "Reset Password Success",
                Toast.LENGTH_LONG
            ).show()
            val intent = Intent(this, GuestMainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}