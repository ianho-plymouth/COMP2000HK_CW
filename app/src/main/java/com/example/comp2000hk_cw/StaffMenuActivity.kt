package com.example.comp2000hk_cw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class StaffMenuActivity : ComponentActivity() {
    private lateinit var btnBack: Button
    private lateinit var btnEdit1: Button
    private lateinit var btnDelete1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_menu)

        btnBack = findViewById(R.id.btnBack)
        btnEdit1 = findViewById(R.id.btnEdit1)
        btnDelete1 = findViewById(R.id.btnDelete1)

        btnBack.setOnClickListener {
            val intent = Intent(this, StaffMainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnEdit1.setOnClickListener {
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