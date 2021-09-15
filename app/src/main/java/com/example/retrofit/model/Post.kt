package com.example.retrofit.model

import com.google.gson.annotations.SerializedName


data class Post (
    @SerializedName("userId")
    var myUserid:Int,
    var id:Int,
    var title:String,
    var body:String
        )