package com.example.moviebookingstudetproject.viewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_holder_snack_items.view.*

class SnackItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

     var count = 1

    init {

       setUpClickListener()

    }

    fun setUpClickListener(){

        itemView.tvFoodCountMoviesFood.text = count.toString()
        itemView.btnAddMoviesFood.setOnClickListener {
            itemView.btnAddMoviesFood.visibility = View.GONE
            itemView.llFoodAddMinusMoviesFood.visibility = View.VISIBLE
        }

        itemView.btnPlusMoviesFood.setOnClickListener {
            count++
            itemView.tvFoodCountMoviesFood.text = count.toString()
        }
        itemView.btnMinusMoviesFood.setOnClickListener {
            count--
            if (count < 0){
                itemView.btnAddMoviesFood.visibility = View.VISIBLE
                itemView.llFoodAddMinusMoviesFood.visibility = View.GONE
            }
            itemView.tvFoodCountMoviesFood.text = count.toString()

        }



    }
}