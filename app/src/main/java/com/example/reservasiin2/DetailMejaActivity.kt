package com.example.reservasiin2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.adapter.Keteranganadapter
import com.example.reservasiin2.adapter.detailmejaadapter

class DetailMejaActivity : AppCompatActivity() {
    private lateinit var rv : RecyclerView
    private lateinit var iv : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_meja)

        rv = findViewById(R.id.detailmejarv)
        iv = findViewById(R.id.back_detail_meja)
        iv.setOnClickListener {
            val intent = Intent(this,KeteranganActivity::class.java)
            startActivity(intent)
        }
        rv.apply {
            layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        }

        rv.adapter = detailmejaadapter(this)


    }
}