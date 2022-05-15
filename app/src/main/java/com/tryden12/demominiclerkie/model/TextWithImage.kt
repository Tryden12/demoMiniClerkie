package com.tryden12.demominiclerkie.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tryden12.demominiclerkie.model.nestedDetailModels.Image
import com.tryden12.demominiclerkie.model.nestedDetailModels.Subtitle
import com.tryden12.demominiclerkie.model.nestedDetailModels.Title


class TextWithImage { // Constructor

    // Getters
    @Expose
    @SerializedName("id")
    var id: Int? = null

    @Expose
    @SerializedName("type")
    var type: String? = null

    @Expose
    @SerializedName("title")
    var title: List<Title>? = null

    @Expose
    @SerializedName("subtitle")
    var subtitle: List<Subtitle>? = null

    @Expose
    @SerializedName("image")
    var image: List<Image>? = null

    @Expose
    @SerializedName("height")
    var height: String? = null

    @Expose
    @SerializedName("click_action")
    var click_action: String? = null


    var titleText: String = ""
    var subtitleText: String = ""
    var imageSrc: String = ""
}






