package com.example.reservasiin2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.adapter.cekadapter

class CekActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var iv : ImageView
    private lateinit var rv : RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cek)

        rv = findViewById(R.id.rv_cek)
        button = findViewById(R.id.btn_pilih_pembayaran)
        iv = findViewById(R.id.back_cek)
        button.setOnClickListener {
            val intent = Intent (this,PembayaranActivity::class.java)
            startActivity(intent)
        }

        rv.apply {
            layoutManager = LinearLayoutManager(context)
        }
        rv.adapter = cekadapter(this)

        iv.setOnClickListener {
            val intent = Intent(this,KeteranganActivity::class.java)
            startActivity(intent)
        }
    }
}