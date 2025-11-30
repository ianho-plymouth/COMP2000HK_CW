package com.example.comp2000hk_cw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class GuestReserveActivity : ComponentActivity() {
    private lateinit var btnBack: Button
    private lateinit var btnConfirm : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_reserve)

        btnBack = findViewById(R.id.btnBack)
        btnConfirm = findViewById(R.id.btnConfirm)

        btnBack.setOnClickListener {
            val intent = Intent(this, GuestMainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnConfirm.setOnClickListener {
            Toast.makeText(
                this,
                "Reservation Confirmed",
                Toast.LENGTH_LONG
            ).show()
            val intent = Intent(this, GuestMainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}