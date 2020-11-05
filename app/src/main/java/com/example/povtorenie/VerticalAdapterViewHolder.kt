package com.example.povtorenie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_horizontal.view.*

class VerticalAdapterViewHolder (): RecyclerView.Adapter<VerticalAdapterViewHolder.VerticalViewHolder>(){

    inner class VerticalViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){

        private val adapterHorizontal = HorizontalAdapterViewHolder()

        fun populateModels(verticalUser: List<Vertical>){
            itemView.recyclerViewHorizontal.adapter = adapterHorizontal
            adapterHorizontal.listHorizontal = verticalUser

        }

    }

    var listVertical : List<Vertical> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent , false)
        return VerticalViewHolder(view)
    }


    override fun getItemCount(): Int = listVertical.size


    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        holder.populateModels(listOf(listVertical[position]))
    }


}