package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.delegate.SeatItemDelegate
import com.example.moviebookingstudetproject.viewHolders.CinemaListViewHolder
import kotlinx.android.synthetic.main.view_holder_cenima_list.view.*

class CinemaListAdapter(val delegate: SeatItemDelegate):RecyclerView.Adapter<CinemaListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_cenima_list,parent,false)
        return CinemaListViewHolder(view,delegate)
    }

    override fun onBindViewHolder(holder: CinemaListViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return 5
    }
}