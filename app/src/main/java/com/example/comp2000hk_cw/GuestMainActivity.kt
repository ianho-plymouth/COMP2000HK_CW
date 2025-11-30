package com.example.comp2000hk_cw

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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
    }
}