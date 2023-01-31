package com.example.moviebookingstudetproject.viewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.delegate.CityDelegate

class CityViewHolder(view:View,cityDelegate: CityDelegate):RecyclerView.ViewHolder(view) {
    init {
        view.setOnClickListener {
            cityDelegate.onTap()
        }
    }
}