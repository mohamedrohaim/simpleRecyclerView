package com.example.listview

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val countryList:ArrayList<Countries>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var countryImage:ShapeableImageView=itemView.findViewById(R.id.titleImage)
        val countryName:TextView=itemView.findViewById(R.id.titleText)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem=countryList[position]
        holder.countryImage.setImageResource(currentItem.countryImage)
        holder.countryName.text = currentItem.countryName


    }

    override fun getItemCount(): Int {
        return countryList.size
    }

}