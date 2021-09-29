package com.example.shakarbiznes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shakarbiznes.R
import com.example.shakarbiznes.databinding.FragmentBoshBinding
import com.example.shakarbiznes.databinding.FragmentHisobotBinding

class HisobotFragment : Fragment() {

    private var _binding: FragmentHisobotBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHisobotBinding.inflate(inflater , container , false)



        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = HisobotFragment()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}