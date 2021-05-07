package com.example.unishare

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter  : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private val itemImages = intArrayOf(R.drawable.logo, R.drawable.img5, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5)
    private val itemTitles = arrayOf("logo","logo1","Image1", "Image2","Image3","Image4","Image5")
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var image : ImageView
        var textTitle : TextView

        init{
            image = itemView.findViewById(R.id.post)
            textTitle = itemView.findViewById(R.id.title)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_model, parent,false)
        return ViewHolder(v)
    }
    override fun getItemCount(): Int {
        return itemTitles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textTitle.text = itemTitles[position]
        holder.image.setImageResource(itemImages[position])
        holder.itemView.setOnClickListener { v: View ->
            Toast.makeText(v.context, "Clicked on the item", Toast.LENGTH_SHORT).show()
        }
    }

}