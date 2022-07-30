package com.apps_square.retrofit.data

import com.apps_square.retrofit.data.model.Products
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface AppsSquareService {
    @GET("api/products")
    fun products(): Call<Products>

    companion object {
        val retrofitClient: AppsSquareService by lazy {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://android-training.appssquare.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create(AppsSquareService::class.java)
        }
    }
}