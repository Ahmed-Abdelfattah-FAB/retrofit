package com.apps_square.retrofit.data.model


import com.google.gson.annotations.SerializedName

data class Products(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("data")
    val `data`: List<Data?>?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("status")
    val status: Boolean?
)