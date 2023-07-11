package com.example.reservasiin2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.R

class pembayaranadapter(private val context : Context) : RecyclerView.Adapter<pembayaranadapter.viewholder> () {
    class viewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        return viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.cv_selected_item_2, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return 8
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {

    }
}