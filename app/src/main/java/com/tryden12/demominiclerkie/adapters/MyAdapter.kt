package com.tryden12.demominiclerkie.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.tryden12.demominiclerkie.R
import com.tryden12.demominiclerkie.api.Text
import com.tryden12.demominiclerkie.model.TextWithImage
import kotlinx.android.synthetic.main.text_image_item.view.*

class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

     private val itemList = mutableListOf<TextWithImage>()

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.text_image_item, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        Picasso.get().load(itemList[position].imageSrc).into(viewHolder.image)
        viewHolder.title.text = itemList[position].title
        viewHolder.subtitle.text = itemList[position].subtitle

    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var image: ImageView
        var title : TextView
        var subtitle : TextView

        init {
            image    = itemView.item_imageview
            title    = itemView.item_title
            subtitle = itemView.item_subtitle

            itemView.setOnClickListener(this)
        }


        override fun onClick(v: View?) {
            // Setup popup and fullscreen
        }
    }
}