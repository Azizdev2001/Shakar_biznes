package com.example.shakarbiznes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.shakarbiznes.R
import com.example.shakarbiznes.databinding.FragmentBoshBinding

class BoshFragment : Fragment() {
    private var _binding: FragmentBoshBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBoshBinding.inflate(inflater, container, false)

        saralash()

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = BoshFragment()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun saralash() {
        val items = arrayOf("20", "50", "100", "200", "500", "1000", "Barchasi")
        val adapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item, items)
        binding.sonlar.adapter = adapter

        binding.sonlar.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }
}