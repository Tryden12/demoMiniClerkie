package com.tryden12.demominiclerkie.api

import com.tryden12.demominiclerkie.model.TextWithImage
import retrofit2.http.GET
import retrofit2.http.Path

interface Text {

    @GET("text")
    suspend fun getObject(
        @Path("id") id : String
    ) : Text


}