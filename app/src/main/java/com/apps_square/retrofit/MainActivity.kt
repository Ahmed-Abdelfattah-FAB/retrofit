package com.apps_square.retrofit

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.apps_square.retrofit.data.AppsSquareService.Companion.retrofitClient
import com.apps_square.retrofit.data.model.Products
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        photoAdapter = PhotoAdapter()
        recyclerView.adapter = photoAdapter
        getProducts()
    }

    private fun getProducts() {
        retrofitClient.products().enqueue(object : Callback<Products> {
            override fun onResponse(call: Call<Products>, response: Response<Products>) {
                response.body()?.data?.let { data-> photoAdapter.setDataList(data) }
            }

            override fun onFailure(call: Call<Products>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Something went wrong, Check Internet Connection", Toast.LENGTH_SHORT).show()
            }
        })
    }
}