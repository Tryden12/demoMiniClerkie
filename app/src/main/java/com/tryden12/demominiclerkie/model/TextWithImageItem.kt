package com.tryden12.demominiclerkie.model

data class TextWithImageItem(
    val click_action: String,
    val height: Int,
    val id: Int,
    val image: Image,
    val subtitle: Subtitle,
    val title: Title,
    val type: String
)