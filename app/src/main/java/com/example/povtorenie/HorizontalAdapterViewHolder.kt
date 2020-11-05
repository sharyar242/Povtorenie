package com.example.povtorenie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class HorizontalAdapterViewHolder(): RecyclerView.Adapter<HorizontalAdapterViewHolder.HorizontalViewHolder>() {


    inner class HorizontalViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun populateModels(horizontalUser : Vertical){
            itemView.tvTitle.text = horizontalUser.title
            itemView.tvDescription.text = horizontalUser.description

        }


    }

    var listHorizontal: List<Vertical> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_horizontal,parent,false)
        return HorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.populateModels(listHorizontal[position])
    }

    override fun getItemCount(): Int = listHorizontal.size

}