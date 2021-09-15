package com.example.retrofit.repository

import com.example.retrofit.api.RetrofitInstanc
import com.example.retrofit.model.Post

class Repository {
    suspend fun getPost():Post{
        return RetrofitInstanc.api.getPost()
    }
}