package com.tryden12.demominiclerkie.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TextWithImage(


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

)