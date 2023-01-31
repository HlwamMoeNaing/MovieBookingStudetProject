package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.viewHolders.CinemaDateCardViewHolder

class CinemaDateCardAdapter:RecyclerView.Adapter<CinemaDateCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaDateCardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_date_list_item,parent,false)
    return CinemaDateCardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CinemaDateCardViewHolder, position: Int) {

    }

    override fun getItemCount()= 7
}