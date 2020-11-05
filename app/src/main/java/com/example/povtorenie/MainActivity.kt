package com.example.povtorenie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapter = VerticalAdapterViewHolder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter =adapter
        recyclerView.addItemDecoration(DividerItemDecoration(this , DividerItemDecoration.VERTICAL))
        setData()

    }

    private fun setData(){
        val


    }

}