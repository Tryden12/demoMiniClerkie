package com.tryden12.demominiclerkie.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tryden12.demominiclerkie.model.nestedDetailModels.ImageNestedDetails
import com.tryden12.demominiclerkie.model.nestedDetailModels.SubtitleNestedDetails
import com.tryden12.demominiclerkie.model.nestedDetailModels.TitleNestedDetails


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
    var title : MutableList<TitleNestedDetails>,

    @Expose
    @SerializedName("subtitle")
    var subtitle : MutableList<SubtitleNestedDetails>,

    @Expose
    @SerializedName("image")
    var image : MutableList<ImageNestedDetails>,

    @Expose
    @SerializedName("height")
    var height: String?,

    @Expose
    @SerializedName("click_action")
    var click_action: String? = null
)






