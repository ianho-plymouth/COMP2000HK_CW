package com.example.comp2000hk_cw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class GuestMainActivity : ComponentActivity() {
    private lateinit var btnViewMenu: Button
    private lateinit var btnReserveNow: Button
    private lateinit var btnViewReservation: Button
    private lateinit var btnSetting: Button
    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_main)

        btnViewMenu = findViewById(R.id.btnViewMenu)
        btnReserveNow = findViewById(R.id.btnReserveNow)
        btnViewReservation = findViewById(R.id.btnViewReservation)
        btnSetting = findViewById(R.id.btnSetting)
        btnLogout = findViewById(R.id.btnLogout)

        btnViewMenu.setOnClickListener {
            val intent = Intent(this, GuestMenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnReserveNow.setOnClickListener {
            val intent = Intent(this, GuestReserveActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnViewReservation.setOnClickListener {
            val intent = Intent(this, GuestReservationActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnSetting.setOnClickListener {
            val intent = Intent(this, GuestSettingActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}