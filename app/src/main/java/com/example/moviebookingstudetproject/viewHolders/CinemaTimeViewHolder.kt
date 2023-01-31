package com.example.moviebookingstudetproject.viewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.delegate.SeatItemDelegate

class CinemaTimeViewHolder(view:View,delegate: SeatItemDelegate):RecyclerView.ViewHolder(view) {
    init {
        view.setOnClickListener {
            delegate.onTap()
        }
    }

}