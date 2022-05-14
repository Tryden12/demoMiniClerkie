package com.tryden12.demominiclerkie.api

import android.telecom.Call
import com.tryden12.demominiclerkie.model.TextWithImage
import retrofit2.http.GET
import retrofit2.http.Path

interface TextWithImage {

    @GET("text_with_image")
    fun getItemList(): MutableList<TextWithImage>

/*
    @GET("text_with_image")
    suspend fun getObject(
        @Path("id") id: Int
    ) : TextWithImage
 */


}