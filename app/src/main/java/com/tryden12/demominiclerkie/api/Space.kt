package com.tryden12.demominiclerkie.api

import com.tryden12.demominiclerkie.model.TextWithImage
import retrofit2.http.GET
import retrofit2.http.Path

interface Space {

    @GET("space")
    suspend fun getObject(
        @Path("id") id : Int
    ) : Space


}