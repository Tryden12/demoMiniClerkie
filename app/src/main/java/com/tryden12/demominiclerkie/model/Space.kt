package com.tryden12.demominiclerkie.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Space(


    @Expose
    @SerializedName("id")
    val id : Int? = null,

    @Expose
    @SerializedName("type")
    val type : String? = null,

    @Expose
    @SerializedName("height")
    val height : Int? = null,
)