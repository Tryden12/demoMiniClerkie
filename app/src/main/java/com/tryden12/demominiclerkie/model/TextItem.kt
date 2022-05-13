package com.tryden12.demominiclerkie.model

data class TextItem(
    val alignment: String,
    val click_action: String,
    val click_action_data: ClickActionData,
    val color: String,
    val font_size: String,
    val font_weight: String,
    val id: String,
    val text: String,
    val type: String,
    val view_alignment: String,
    val width_percent: Double
)