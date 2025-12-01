package com.example.comp2000hk_cw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class StaffMainActivity : ComponentActivity() {
    private lateinit var btnEditMenu: Button
    private lateinit var btnViewReservation: Button
    private lateinit var btnSetting: Button
    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_main)

        btnEditMenu = findViewById(R.id.btnEditMenu)
        btnViewReservation = findViewById(R.id.btnViewReservation)
        btnSetting = findViewById(R.id.btnSetting)
        btnLogout = findViewById(R.id.btnLogout)

        btnEditMenu.setOnClickListener {
            val intent = Intent(this, StaffMenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnViewReservation.setOnClickListener {
            val intent = Intent(this, StaffReservationActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnSetting.setOnClickListener {
            val intent = Intent(this, StaffSettingActivity::class.java)
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