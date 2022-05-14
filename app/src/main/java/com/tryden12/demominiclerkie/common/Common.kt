package com.tryden12.demominiclerkie.common

import com.tryden12.demominiclerkie.api.MyRetrofitBuilder
import com.tryden12.demominiclerkie.api.TextWithImage
import retrofit2.Retrofit

object Common {

    private val BASE_URL = "https://my-json-server.typicode.com/Tryden12/mockjson/"

    val retrofitService : TextWithImage
    get() = MyRetrofitBuilder.getClient(BASE_URL).create(TextWithImage::class.java)

}