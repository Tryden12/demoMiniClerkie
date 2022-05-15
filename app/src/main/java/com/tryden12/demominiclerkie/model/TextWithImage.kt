package com.tryden12.demominiclerkie.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tryden12.demominiclerkie.model.nestedDetailModels.Image
import com.tryden12.demominiclerkie.model.nestedDetailModels.Subtitle
import com.tryden12.demominiclerkie.model.nestedDetailModels.Title


data class TextWithImage  // Constructor
    (
    // Getters
    @Expose
    @SerializedName("id")
    var id: Int?,

    @Expose
    @SerializedName("type")
    var type: String?,

    @Expose
    @SerializedName("title")
    var title : List<Title>,

    @Expose
    @SerializedName("subtitle")
    var subtitle : List<Subtitle>,

    @Expose
    @SerializedName("image")
    var image : List<Image>,

    @Expose
    @SerializedName("height")
    var height: String?,

    @Expose
    @SerializedName("click_action")
    var click_action: String? = null
)






