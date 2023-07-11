package com.example.reservasiin2.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reservasiin2.MainActivity
import com.example.reservasiin2.R
import com.example.reservasiin2.adapter.riwayatadapter
import com.example.reservasiin2.databinding.FragmentPencarianBinding
import com.example.reservasiin2.databinding.FragmentRiwayatBinding


class RiwayatFragment : Fragment() {

    private  var _binding : FragmentRiwayatBinding? = null
    private val Binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRiwayatBinding.inflate(inflater,container,false)
        _binding?.rvriwayat?.apply {
            layoutManager = LinearLayoutManager(activity)
        }
        _binding?.rvriwayat?.adapter = riwayatadapter(context as MainActivity)
        return Binding.root
    }
}