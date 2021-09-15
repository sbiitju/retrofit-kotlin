package com.example.retrofit.api

import com.example.retrofit.model.Post
import retrofit2.http.GET

interface simpleApi {
    @GET("todos/1")
    suspend fun getPost():Post
}