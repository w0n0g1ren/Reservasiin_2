package com.example.reservasiin2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.R

class bottomsheetadapter(private val context : Context) : RecyclerView.Adapter<bottomsheetadapter.viewholder> () {
    class viewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val jmlh : TextView = itemview.findViewById(R.id.jmlh)
        val tambah : ImageView = itemview.findViewById(R.id.btn_tambah)
        val kurang : ImageView = itemview.findViewById(R.id.btn_kurang)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        return viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.cv_keranjang, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.tambah.setOnClickListener {
            var angka = holder.jmlh.text.toString().toInt()
            var total = angka + 1
            holder.jmlh.text = total.toString()
        }
        holder.kurang.setOnClickListener {
            var angka = holder.jmlh.text.toString().toInt()
            var total = angka - 1

            if (total <= 1){
                holder.jmlh.text = "1"
            }else{
                holder.jmlh.text = total.toString()
            }

        }
    }
}