package com.example.reservasiin2.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioButton
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.DetailMejaActivity
import com.example.reservasiin2.R

class Keteranganadapter (private val context : Context) : RecyclerView.Adapter<Keteranganadapter.viewholder> () {
    private var isNewRadioButtonChecked = false
    private var lastcheckedposition = -1

    class viewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var iv: ImageView = itemview.findViewById(R.id.detailmeja)
        var rb : RadioButton = itemview.findViewById(R.id.rb_tempat)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        return viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.cv_selected_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.iv.setOnClickListener {
            val intent = Intent(context,DetailMejaActivity::class.java)
            context.startActivity(intent)
        }
    }
}