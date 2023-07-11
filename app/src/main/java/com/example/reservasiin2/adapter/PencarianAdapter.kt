package com.example.reservasiin2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.DetailActivity
import com.example.reservasiin2.R

class PencarianAdapter(private val context : Context) : RecyclerView.Adapter<PencarianAdapter.viewholder> () {
    class viewholder (itemview : View) : RecyclerView.ViewHolder(itemview) {
        var cv : LinearLayout = itemview.findViewById(R.id.pencariancv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
       return viewholder(
           LayoutInflater.from(parent.context).inflate(R.layout.cv_pencarian,parent,false)
       )
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.cv.setOnClickListener {
            val intent = Intent(context,DetailActivity::class.java)
            context.startActivity(intent)
        }
    }
}