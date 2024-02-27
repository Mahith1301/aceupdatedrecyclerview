package com.example.nestedrecyclerview.adapter

//import androidx.recyclerview.widget.RecyclerView.Adapter
//import com.example.recyclegridview.R
//import com.example.recyclegridview.databinding.ParentItemLayoutBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.model.parentmodel

import com.example.updatedrecyclerview.R
import com.example.updatedrecyclerview.adapter.gridadapter


class parentadapter (private val parentmodel:List<parentmodel> ): RecyclerView.Adapter<parentadapter.parentviewholder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): parentviewholder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.parent_item_layout,parent,false)

        return  parentviewholder(view)
    }

    override fun getItemCount()=parentmodel.size

    override fun onBindViewHolder(holder: parentviewholder, position: Int) {
        val parentmodel = parentmodel[position]

        val childAdapter = childAdapter(parentmodel.appmodel)
        holder.childmodel.adapter = childAdapter
        holder.childmodel.layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)

        val gridAdapter = gridadapter(parentmodel.gridmodel,holder.itemView.context)
        holder.gridmodel.adapter = gridAdapter
        holder.gridmodel.layoutManager = GridLayoutManager(holder.itemView.context, 3)

    }



    inner class parentviewholder(itemView: View):RecyclerView.ViewHolder(itemView){

        val childmodel: RecyclerView= itemView.findViewById(R.id.appchild)
        val gridmodel :RecyclerView=itemView.findViewById(R.id.GV)

    }
}