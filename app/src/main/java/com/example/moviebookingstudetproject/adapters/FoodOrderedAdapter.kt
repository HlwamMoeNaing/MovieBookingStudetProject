package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.viewHolders.FoodOrderedViewHolder

class FoodOrderedAdapter : RecyclerView.Adapter<FoodOrderedViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodOrderedViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_tiket_checkout_items, parent, false)
        return FoodOrderedViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodOrderedViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}