package com.tryden12.demominiclerkie.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MyRetrofitBuilder {

    const val BASE_URL = "https://my-json-server.typicode.com/Tryden12/mockjson/"

    val retrofitBuilder : Retrofit.Builder by lazy {
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    val textWithImage : TextWithImage by lazy {
        retrofitBuilder
            .build().create(TextWithImage::class.java)
    }

    val text : Text by lazy {
        retrofitBuilder
            .build().create(Text::class.java)
    }

    val image : Image by lazy {
        retrofitBuilder
            .build().create(Image::class.java)
    }

    val space : Space by lazy {
        retrofitBuilder
            .build().create(Space::class.java)
    }
}