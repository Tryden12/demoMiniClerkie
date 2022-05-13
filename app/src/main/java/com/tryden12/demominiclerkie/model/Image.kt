package com.tryden12.demominiclerkie.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Image(


    @Expose
    @SerializedName("id")
    val id : Int? = null,

    @Expose
    @SerializedName("type")
    val type : String? = null,

    @Expose
    @SerializedName("width_percent")
    val width_percent : Int? = null,

    @Expose
    @SerializedName("h2w_ratio")
    val h2w_ratio : Int? = null,

    @Expose
    @SerializedName("view_alignment")
    val view_alignment : String? = null,

    @Expose
    @SerializedName("src")
    val src : String? = null,

    @Expose
    @SerializedName("click_action")
    val click_action : String? = null,

    @Expose
    @SerializedName("click_action_data")
    val click_action_data : String? = null



)