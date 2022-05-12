package com.tryden12.demominiclerkie.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.tryden12.demominiclerkie.R

class MainFragment : Fragment(), View.OnClickListener {

    var navController : NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        view.findViewById<Button>(R.id.view_fullscreen_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.view_popup_btn).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.view_fullscreen_btn -> navController!!.navigate(R.id.action_mainFragment_to_fullscreenFragment)
            R.id.view_popup_btn -> navController!!.navigate(R.id.action_mainFragment_to_popupFragment)
        }
    }

}