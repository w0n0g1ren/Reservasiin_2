package com.example.reservasiin2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reservasiin2.MainActivity
import com.example.reservasiin2.R
import com.example.reservasiin2.adapter.Homeadapter
import com.example.reservasiin2.adapter.PencarianAdapter
import com.example.reservasiin2.databinding.FragmentHomeBinding
import com.example.reservasiin2.databinding.FragmentPencarianBinding


class HomeFragment : Fragment() {

    private  var _binding : FragmentHomeBinding? = null
    private val Binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        _binding?.rv?.apply {
            layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        }
        _binding?.rv?.adapter = Homeadapter(context as MainActivity)
        return Binding.root
    }

}