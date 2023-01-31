package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.viewHolders.CastListViewHolder

class CastListAdapter:RecyclerView.Adapter<CastListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_cast_list,parent,false)
    return CastListViewHolder(view)
    }

    override fun onBindViewHolder(holder: CastListViewHolder, position: Int) {

    }

    override fun getItemCount() = 6
}