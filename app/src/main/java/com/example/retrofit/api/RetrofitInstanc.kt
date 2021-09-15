package com.example.retrofit.api

import com.example.retrofit.util.Constants
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstanc {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api:simpleApi by lazy {
        retrofit.create(simpleApi::class.java)
    }
}


