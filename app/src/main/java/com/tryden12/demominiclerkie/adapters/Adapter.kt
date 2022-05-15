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
import com.tryden12.demominiclerkie.model.TextWithImage
import kotlinx.android.synthetic.main.text_image_item.view.*

class Adapter(private val context: Context?, private var textWithImageList: List<TextWithImage>?) :
    RecyclerView.Adapter<Adapter.CustomViewHolder>() {

    fun dataChanged(textWithImageList: List<TextWithImage>) {
        this.textWithImageList = textWithImageList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): CustomViewHolder {
        val mView = LayoutInflater.from(context)
            .inflate(R.layout.text_image_item, viewGroup, false)
        return CustomViewHolder(mView)
    }

    override fun onBindViewHolder(customViewHolder: CustomViewHolder, pos: Int) {
        val textWithImage = textWithImageList!![pos]
        customViewHolder.title.text = textWithImage.title.toString()
        customViewHolder.subtitle.text = textWithImage.subtitle.toString()

         //Picasso.get().load(textWithImage.image).into(customViewHolder.image)


    }

    override fun getItemCount(): Int {
        return if (textWithImageList == null) 0 else textWithImageList!!.size
    }

    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title : TextView
        var subtitle : TextView

        init {
            image    = itemView.findViewById(R.id.item_imageview)
            title    = itemView.findViewById(R.id.item_title)
            subtitle = itemView.findViewById(R.id.item_subtitle)
        }

    }
}