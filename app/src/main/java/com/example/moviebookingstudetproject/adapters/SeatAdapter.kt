package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.delegate.SeatItemDelegate
import com.example.moviebookingstudetproject.viewHolders.BaseSeatViewHolder
import com.example.moviebookingstudetproject.viewHolders.CoupleSeatViewHolder
import com.example.moviebookingstudetproject.viewHolders.SingleSeatViewHolder

class SeatAdapter : RecyclerView.Adapter<BaseSeatViewHolder>() {
    val VIEW_TYPE_SINGLE_SEAT = 1
    val VIEW_TYPE_COUPLE_SEAT = 2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseSeatViewHolder {
        return when (viewType) {
            VIEW_TYPE_SINGLE_SEAT -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.view_holder_seat_items, parent, false)
                SingleSeatViewHolder(itemView)
            }
            VIEW_TYPE_COUPLE_SEAT -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.view_holder_gold_seat, parent, false)
                CoupleSeatViewHolder(itemView)
            }
            else -> {
                val itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.view_holder_seat_items, parent, false)
                SingleSeatViewHolder(itemView)
            }

        }
    }

    override fun onBindViewHolder(holder: BaseSeatViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            position == 0 -> {
                VIEW_TYPE_SINGLE_SEAT
            }
            position == 1 ->{
                VIEW_TYPE_SINGLE_SEAT
            }
            position == 2 -> {
                VIEW_TYPE_SINGLE_SEAT
            }
            else -> {
                VIEW_TYPE_COUPLE_SEAT
            }
        }
    }
}