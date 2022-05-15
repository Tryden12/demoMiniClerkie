package com.tryden12.demominiclerkie.ui.main

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.tryden12.demominiclerkie.R
import com.tryden12.demominiclerkie.adapters.MyAdapter
import com.tryden12.demominiclerkie.common.Common
import com.tryden12.demominiclerkie.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.*
import java.io.IOException
import java.io.InputStream

class MainFragment : Fragment(), View.OnClickListener {


    var navController : NavController? = null
    lateinit var mService : com.tryden12.demominiclerkie.api.TextWithImage
    lateinit var adapter : MyAdapter
    lateinit var dialog : AlertDialog

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //return inflater.inflate(R.layout.fragment_main, container, false)

        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mService = Common.retrofitService

        // Setup Layout Manager
        val layoutManager = LinearLayoutManager(context)
        binding.myRecyclerView.layoutManager = layoutManager

        // Add divider
        val divider = DividerItemDecoration(
            context, layoutManager.orientation
        )
        binding.myRecyclerView.addItemDecoration(divider)

        // Bind adapter to recycler view
        adapter = MyAdapter()
        binding.myRecyclerView.adapter = adapter


        navController = Navigation.findNavController(view)

        view.findViewById<Button>(R.id.view_fullscreen_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.view_popup_btn).setOnClickListener(this)


        /************************ Read Json ******************************************************/
        //readJson()





    }


    fun loadJSONFile(): String? {
        var json: String? = null
        json = try {
            val inputStream: InputStream = context?.getAssets()!!.open("yourfilename.json")
            val size = inputStream.available()
            val byteArray = ByteArray(size)
            inputStream.read(byteArray)
            inputStream.close()
            String(byteArray)
        } catch (e: IOException) {
            e.printStackTrace()
            return null
        }
        return json
    }


    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.view_fullscreen_btn -> navController!!.navigate(R.id.action_mainFragment_to_fullscreenFragment)
            R.id.view_popup_btn -> navController!!.navigate(R.id.action_mainFragment_to_popupFragment)
        }
    }

}