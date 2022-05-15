package com.tryden12.demominiclerkie.ui.main

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tryden12.demominiclerkie.MainActivity
import com.tryden12.demominiclerkie.R
import com.tryden12.demominiclerkie.adapters.Adapter
import com.tryden12.demominiclerkie.adapters.MyAdapter
import com.tryden12.demominiclerkie.common.Common
import com.tryden12.demominiclerkie.databinding.FragmentMainBinding
import com.tryden12.demominiclerkie.model.TextWithImage
import kotlinx.android.synthetic.main.text_image_item.*
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class MainFragment : Fragment(), View.OnClickListener {

    var navController : NavController? = null
    lateinit var mService : com.tryden12.demominiclerkie.api.TextWithImage

    lateinit var adapter : Adapter
    var my_recycler_view : RecyclerView? = null
    var textWithImageModelArrayList: MutableList<TextWithImage>? = ArrayList()
    var textWithImageAdapter: Adapter? = null


    lateinit var myAdapter : MyAdapter
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
        binding.myRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.myRecyclerView!!.itemAnimator = DefaultItemAnimator()
        binding.myRecyclerView.adapter = Adapter(context,textWithImageModelArrayList)
        // Add divider
        val divider = DividerItemDecoration(
            context, layoutManager.orientation
        )
        binding.myRecyclerView.addItemDecoration(divider)


        /************************ Read Json ******************************************************/
        //readJson()
        jsonFileFromLocally



        /*****************************************************************************************/
        navController = Navigation.findNavController(view)
        view.findViewById<View>(R.id.view_fullscreen).setOnClickListener(this)
        view.findViewById<View>(R.id.view_popup).setOnClickListener(this)
        view.findViewById<Button>(R.id.view_fullscreen_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.view_popup_btn).setOnClickListener(this)
        /*****************************************************************************************/
    }


    fun loadJSONFromAsset(): String? {
        var json: String? = null
        json = try {
            val `is` =
                requireContext().assets.open("textWithImage.json")
            val size = `is`.available()
            val buffer = ByteArray(size)
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json
    }

    private val jsonFileFromLocally: Unit
        private get() {
            try {
                val jsonObject       = JSONObject(loadJSONFromAsset())
                val responseCode     = jsonObject.getString("responseCode")
                val responseMessage  = jsonObject.getString("responseMessage")
                val responseTime     = jsonObject.getString("responseTime")

                Log.e("clerkie", "responseCode     -->$responseCode")
                Log.e("clerkie", "responseMessage  -->$responseMessage")
                Log.e("clerkie", "responseTime     -->$responseTime")


                if (responseCode == "100") {
                } else {
                    Toast.makeText(context, "No data found", Toast.LENGTH_SHORT).show()
                }

                val jsonArray =
                    jsonObject.getJSONArray("textWithImageList")
                Log.e("clerkie", "Array length --> " + jsonArray.length())
                for (i in 0 until jsonArray.length()) {
                    val textWithImageModel = TextWithImage()
                    val jsonObjectItem     = jsonArray.getJSONObject(i)
                    Log.i("DEBUG_JSON", "$jsonObjectItem")

                    val titleText: String = jsonObjectItem
                        .getJSONObject("title").getString("text")
                    val subtitleText: String = jsonObjectItem
                        .getJSONObject("subtitle").getString("text")
                    val imageSrc: String = jsonObjectItem
                        .getJSONObject("image").getString("src")

                    Log.i("DEBUG_JSON_Title", "$titleText")
                    Log.i("DEBUG_JSON_Title", "$subtitleText")
                    Log.i("DEBUG_JSON_ImageSrc", "$imageSrc")


                    textWithImageModel.titleText    = "" + titleText
                    textWithImageModel.subtitleText = "" + subtitleText
                    textWithImageModel.imageSrc    = "" + imageSrc



                    textWithImageModelArrayList!!.add(textWithImageModel)
                } // for

                if (textWithImageModelArrayList != null) {
                    adapter!!.dataChanged(textWithImageModelArrayList!!)
                }

            } catch (e: JSONException) {
                e.printStackTrace()
            }


        }









    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.view_fullscreen -> navController!!.navigate(R.id.action_mainFragment_to_fullscreenFragment)
            R.id.view_popup -> navController!!.navigate(R.id.action_mainFragment_to_popupFragment)
            R.id.view_fullscreen_btn -> navController!!.navigate(R.id.action_mainFragment_to_fullscreenFragment)
            R.id.view_popup_btn -> navController!!.navigate(R.id.action_mainFragment_to_popupFragment)
        }
    }












    /*
    fun loadJSONFile(): String? {
        var json: String? = null
        json = try {
            val inputStream: InputStream = context?.getAssets()!!.open("textWithImage.json")
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

 */


}