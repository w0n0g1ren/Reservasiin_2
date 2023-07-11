package com.example.reservasiin2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.MainActivity
import com.example.reservasiin2.R
import com.example.reservasiin2.adapter.PencarianAdapter
import com.example.reservasiin2.databinding.FragmentPencarianBinding


class PencarianFragment : Fragment() {

    private  var _binding : FragmentPencarianBinding? = null
    private val Binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPencarianBinding.inflate(inflater,container,false)
        _binding?.rvPencarian?.apply {
            layoutManager = LinearLayoutManager(activity)
        }
        _binding?.rvPencarian?.adapter = PencarianAdapter(context as MainActivity)
        return Binding.root
    }

}