package com.example.navigationcomponentsapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentsapp.R
import com.example.navigationcomponentsapp.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private var binding: FragmentFirstBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.navigateButton.setOnClickListener(){
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}