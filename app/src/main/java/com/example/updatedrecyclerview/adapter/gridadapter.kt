package com.example.updatedrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.model.childmodel
import com.example.updatedrecyclerview.R

class gridadapter(private val itemList: List<childmodel>, private val context: Context) :
    RecyclerView.Adapter<gridadapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.child_app_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = itemList[position]

        // Customize the following lines based on your data model
        holder.imageViewGrid.setImageResource(currentItem.appimage)
        holder.textViewGrid.text = currentItem.appname
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewGrid: ImageView = itemView.findViewById(R.id.appimage)
        val textViewGrid: TextView = itemView.findViewById(R.id.apptextview)
    }
}
