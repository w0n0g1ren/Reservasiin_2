package com.example.reservasiin2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.DetailActivity
import com.example.reservasiin2.R

class riwayatadapter(private val context : Context) : RecyclerView.Adapter<riwayatadapter.viewholder> () {
    class viewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var btn: Button = itemview.findViewById(R.id.btn_pesan_lagi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        return viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.cv_riwayat, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.btn.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            context.startActivity(intent)
        }
    }
}