package com.tryden12.demominiclerkie.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Text(

    @Expose
    @SerializedName("id")
    val id : String? = null,

    @Expose
    @SerializedName("type")
    val type : String? = null,

    @Expose
    @SerializedName("text")
    val text : String? = null,

    @Expose
    @SerializedName("font_size")
    val font_size : String? = null,

    @Expose
    @SerializedName("color")
    val color : String? = null,

    @Expose
    @SerializedName("width_percent")
    val width_percent : String? = null,

    @Expose
    @SerializedName("alignment")
    val alignment : String? = null,

    @Expose
    @SerializedName("view_alignment")
    val view_alignment : String? = null,


    @Expose
    @SerializedName("click_action")
    val click_action : String? = null,

    @Expose
    @SerializedName("click_action_data")
    val click_action_data : String? = null


)