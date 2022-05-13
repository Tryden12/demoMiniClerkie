package com.tryden12.demominiclerkie.api

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/db")
    suspend fun getObject(
    )

}