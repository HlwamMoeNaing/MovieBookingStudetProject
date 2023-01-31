package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.delegate.SeatItemDelegate
import com.example.moviebookingstudetproject.viewHolders.CinemaTimeViewHolder

class CinemaTimeAdapter(val delegate:SeatItemDelegate):RecyclerView.Adapter<CinemaTimeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaTimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_cinema_time_card,parent,false)
        return CinemaTimeViewHolder(view,delegate)
    }

    override fun onBindViewHolder(holder: CinemaTimeViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 5
    }
}