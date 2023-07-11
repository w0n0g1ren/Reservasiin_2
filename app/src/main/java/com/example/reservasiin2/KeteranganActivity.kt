package com.example.reservasiin2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.reservasiin2.adapter.Keteranganadapter

class KeteranganActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var rv : RecyclerView
    private lateinit var iv : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keterangan)

        rv = findViewById(R.id.rv_tempat)
        button   = findViewById(R.id.btn_pesan)
        button.setOnClickListener {
            val intent = Intent (this,CekActivity::class.java)
            startActivity(intent)
        }

        rv.apply {
            layoutManager = LinearLayoutManager(context)
        }

        rv.adapter = Keteranganadapter(this)

        iv = findViewById(R.id.back_keterangan)
        iv.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }
    }
}