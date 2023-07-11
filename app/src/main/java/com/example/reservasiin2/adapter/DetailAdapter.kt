package com.example.reservasiin2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.DetailActivity
import com.example.reservasiin2.R

class DetailAdapter(private val context : Context) : RecyclerView.Adapter<DetailAdapter.viewholder> () {
    class viewholder (itemview : View) : RecyclerView.ViewHolder(itemview) {
        val tambah : Button = itemview.findViewById(R.id.btn_tambah_detail)
        val layout : LinearLayout = itemview.findViewById(R.id.layoutsesuatu)
        val tambah_jmlh : ImageView = itemview.findViewById(R.id.btn_tambah_detail_jmlh)
        val kurang_jmlh : ImageView = itemview.findViewById(R.id.btn_kurang_detail_jmlh)
        val jmlh : TextView = itemview.findViewById(R.id.detail_jmlh)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        return viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.cv_detail,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.layout.visibility = View.GONE
        holder.tambah.setOnClickListener {
            holder.layout.visibility = View.VISIBLE
            if (holder.layout.isVisible){
                holder.tambah.visibility = View.GONE
            }else{

            }
        }
        holder.tambah_jmlh.setOnClickListener {
            var angka = holder.jmlh.text.toString().toInt()
            var total = angka + 1
            holder.jmlh.text = total.toString()
        }
        holder.kurang_jmlh.setOnClickListener {
            var angka = holder.jmlh.text.toString().toInt()
            var total = angka - 1

            if(total == 0){
                holder.layout.visibility = View.GONE
                holder.tambah.visibility = View.VISIBLE

            }else{
                holder.jmlh.text = total.toString()
            }
        }

    }
}