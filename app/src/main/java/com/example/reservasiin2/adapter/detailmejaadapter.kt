package com.example.reservasiin2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.R

class detailmejaadapter(private val context : Context) : RecyclerView.Adapter<detailmejaadapter.viewholder> () {
    class viewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        return viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.detailmeja, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {

    }
}