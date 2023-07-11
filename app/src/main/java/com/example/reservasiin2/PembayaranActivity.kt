package com.example.reservasiin2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.adapter.pembayaranadapter

class PembayaranActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var rv : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        rv = findViewById(R.id.recyclerView)
        button = findViewById(R.id.btn_bayar)
        button.setOnClickListener {
            val intent = Intent (this,LandingActivity::class.java)
            startActivity(intent)
        }

        rv.apply {
            layoutManager = LinearLayoutManager(context)
        }

        rv.adapter = pembayaranadapter(this)
    }
}