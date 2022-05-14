package com.tryden12.demominiclerkie.model

import com.tryden12.demominiclerkie.model.nestedDetailModels.ImageNestedDetails
import com.tryden12.demominiclerkie.model.nestedDetailModels.SubtitleNestedDetails
import com.tryden12.demominiclerkie.model.nestedDetailModels.TitleNestedDetails


data class TextWithImage  // Constructor
    (
    // Getters
    var id: Int?, var type: String?, var title : MutableList<TitleNestedDetails>,
    var subtitle : MutableList<SubtitleNestedDetails>, var imageSrc : MutableList<ImageNestedDetails>,
    var height: String?, var click_action: String?
)


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


    override fun getItemList(): MutableList<com.tryden12.demominiclerkie.model.TextWithImage> {
        TODO("Not yet implemented")
    }
}

 */



