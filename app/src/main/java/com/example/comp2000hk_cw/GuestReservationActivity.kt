package com.example.comp2000hk_cw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class GuestReservationActivity : ComponentActivity() {
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_reservation)

        btnBack = findViewById(R.id.btnBack)

        btnBack.setOnClickListener {
            val intent = Intent(this, GuestMainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}