package com.adelmotechnology.recyclergrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var  photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.VERTICAL
//        recyclerView.layoutManager = layoutManager
//
//        val adapter = HobbyAdapter(this, Supplier.hobbies)
//        recyclerView.adapter = adapter


        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))
        dataList.add(DataModel("Title","Desc",R.drawable.online))

        photoAdapter.setDataList(dataList)


    }
}