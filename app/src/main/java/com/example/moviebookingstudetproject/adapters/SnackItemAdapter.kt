package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.viewHolders.SnackItemViewHolder

class SnackItemAdapter:RecyclerView.Adapter<SnackItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnackItemViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_snack_items,parent,false)
        return SnackItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: SnackItemViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
      return 20
    }
}