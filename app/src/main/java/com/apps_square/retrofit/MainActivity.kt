package com.apps_square.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var datalist= mutableListOf<DataModel>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager =GridLayoutManager(applicationContext ,2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        datalist.add(DataModel("Title","desc",R.drawable.ic_launcher_foreground))
        datalist.add(DataModel("Title","desc",R.drawable.ic_launcher_foreground))
        datalist.add(DataModel("Title","desc",R.drawable.ic_launcher_foreground))
        datalist.add(DataModel("Title","desc",R.drawable.ic_launcher_foreground))
        datalist.add(DataModel("Title","desc",R.drawable.ic_launcher_foreground))
        datalist.add(DataModel("Title","desc",R.drawable.ic_launcher_foreground))
        datalist.add(DataModel("Title","desc",R.drawable.ic_launcher_foreground))
        datalist.add(DataModel("Title","desc",R.drawable.ic_launcher_foreground))

        photoAdapter.setDataList(datalist)

    }
}