package com.tryden12.demominiclerkie.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tryden12.demominiclerkie.R
import com.tryden12.demominiclerkie.databinding.FragmentMainBinding
import com.tryden12.demominiclerkie.databinding.FragmentPopupBinding

class PopupFragment : Fragment() {

    private lateinit var binding: FragmentPopupBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_popup, container, false)

        binding = FragmentPopupBinding.inflate(layoutInflater)
        return binding.root
    }

}