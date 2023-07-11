package com.example.reservasiin2

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.reservasiin2.adapter.DetailAdapter
import com.example.reservasiin2.adapter.bottomsheetadapter
import com.google.android.material.bottomsheet.BottomSheetDialog

class DetailActivity : AppCompatActivity() {
    private lateinit var button : TextView
    private lateinit var rv : RecyclerView
    private lateinit var keranjang : ImageView
    private lateinit var button2 : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        keranjang = findViewById(R.id.btn_keranjang)
        rv = findViewById(R.id.rvdetail)
        button = findViewById(R.id.btn_pilih_tempat)

        button.setOnClickListener {
            val message : String = "bertanya"
            setcustomdialogbox(message)
        }

        keranjang.setOnClickListener {
            setbuttomsheet()
        }

        rv.apply {
            layoutManager = LinearLayoutManager(context)
        }
        rv.adapter = DetailAdapter(this)
    }

    @SuppressLint("MissingInflatedId")
    private fun setbuttomsheet() {
        val dialogView = layoutInflater.inflate(R.layout.bottom_sheet,null)
        val dialog = BottomSheetDialog(this, R.style.BottomSheetDialogTheme)
        dialog.setContentView(dialogView)

        button2 = dialogView.findViewById(R.id.imageView3btmsheet)
        rv = dialogView.findViewById(R.id.recyclerView2bottomsheet)
        rv.apply {
            layoutManager = LinearLayoutManager(context)
        }
        rv.adapter = bottomsheetadapter(this)
        button2.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun setcustomdialogbox(message: String) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialogbox)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val ya : Button = dialog.findViewById(R.id.btn_lanjut)
        val tidak : Button = dialog.findViewById(R.id.btn_tidak)

        ya.setOnClickListener {
            val intent = Intent(this,KeteranganActivity::class.java)
            startActivity(intent)
        }

        tidak.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}