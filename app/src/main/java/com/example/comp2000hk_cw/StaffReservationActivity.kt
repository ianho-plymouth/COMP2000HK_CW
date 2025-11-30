package com.example.comp2000hk_cw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class StaffReservationActivity : ComponentActivity() {
    private lateinit var btnBack: Button
    private lateinit var btnView1: Button
    private lateinit var btnDelete1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_reservation)

        btnBack = findViewById(R.id.btnBack)
        btnView1 = findViewById(R.id.btnView1)
        btnDelete1 = findViewById(R.id.btnDelete1)

        btnBack.setOnClickListener {
            val intent = Intent(this, StaffMainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnView1.setOnClickListener {
            val intent = Intent(this, StaffMainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnDelete1.setOnClickListener {
            val intent = Intent(this, StaffMainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}