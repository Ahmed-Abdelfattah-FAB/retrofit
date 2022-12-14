package com.apps_square.retrofit.data.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("price")
    val price: Int?,
    @SerializedName("quantity")
    val quantity: Int?,
    @SerializedName("restaurant_id")
    val restaurantId: Int?
)