package com.example.updatedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.adapter.parentadapter
import com.example.nestedrecyclerview.model.childmodel
import com.example.nestedrecyclerview.model.parentmodel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var recyclerView: RecyclerView =findViewById(R.id.recyclerview)
        //var horizontalview: RecyclerView =findViewById(R.id.appchild)


        var applist:List<childmodel>
        applist=ArrayList<childmodel>()

        //adding name and image to applist
        applist=applist+childmodel("android",R.drawable.android1)
        applist=applist+childmodel("home",R.drawable.home1)
        applist=applist+childmodel("camera",R.drawable.camera1)
        applist=applist+childmodel("home",R.drawable.home1)
        applist=applist+childmodel("camera",R.drawable.camera1)
        applist=applist+childmodel("android",R.drawable.android1)
        applist=applist+childmodel("android",R.drawable.android1)
        applist=applist+childmodel("home",R.drawable.home1)
        applist=applist+childmodel("camera",R.drawable.camera1)
        applist=applist+childmodel("home",R.drawable.home1)
        applist=applist+childmodel("camera",R.drawable.camera1)
        applist=applist+childmodel("android",R.drawable.android1)
        applist=applist+childmodel("android",R.drawable.android1)
        applist=applist+childmodel("home",R.drawable.home1)
        applist=applist+childmodel("camera",R.drawable.camera1)
        applist=applist+childmodel("home",R.drawable.home1)
        applist=applist+childmodel("camera",R.drawable.camera1)
        applist=applist+childmodel("android",R.drawable.android1)


        // Adding child models to each parent model
        val parentList: List<parentmodel> = ArrayList<parentmodel>().apply {
            add(parentmodel( applist, applist))


        }

        // Creating and setting up the parent adapter
        val parentAdapter = parentadapter(parentList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = parentAdapter


    }
}