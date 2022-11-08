package com.example.gd10_d_10858

import com.google.gson.annotations.SerializedName
data class ResponseCreate(
    @SerializedName("status") val stt:Int,
    @SerializedName("error") val e:Boolean,
    @SerializedName("message") val pesan:String,)