package com.tryden12.demominiclerkie.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tryden12.demominiclerkie.api.Image
import com.tryden12.demominiclerkie.api.Space
import com.tryden12.demominiclerkie.api.Text
import com.tryden12.demominiclerkie.api.TextWithImage

class TextWithImage{
    var id: Int? = null
    var type: String? = null
    var title: String? = null
    var subtitle: String? = null
    var imageSrc: String? = null
    var height: String? = null
    var click_action: String? = null

}


/*
    @Expose
    @SerializedName("id")
    val id: Int? = null,

    @Expose
    @SerializedName("type")
    val type: String? = null,


    @Expose
    @SerializedName("title")
    val title: String? = null,

    @Expose
    @SerializedName("subtitle")
    val subtitle: String? = null,

    @Expose
    @SerializedName("image")
    val image: String? = null,

    @Expose
    @SerializedName("height")
    val height: String? = null,

    @Expose
    @SerializedName("click_action")
    val click_action: String? = null

) : TextWithImage, Text, Image, Space {
    override suspend fun getObject(id: Int): com.tryden12.demominiclerkie.model.TextWithImage {
        TODO("Not yet implemented")
    }

    override suspend fun getObject(id: String): Text {
        TODO("Not yet implemented")
    }
    }
 */


