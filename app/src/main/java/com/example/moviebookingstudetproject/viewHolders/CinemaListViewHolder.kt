package com.example.moviebookingstudetproject.viewHolders

import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.adapters.CinemaTimeAdapter
import com.example.moviebookingstudetproject.delegate.SeatItemDelegate
import com.example.moviebookingstudetproject.delegate.SeatItemDelegateSeeDetail
import kotlinx.android.synthetic.main.view_holder_cenima_list.view.*

class CinemaListViewHolder(private val itemView: View,val delegate: SeatItemDelegate,val delegateTwo:SeatItemDelegateSeeDetail) : RecyclerView.ViewHolder(itemView) {

    private var showRecycler = false


    init {
        itemView.setOnClickListener {
            if (showRecycler) {
                itemView.rvCinemaTimesMoviesCinema.visibility = View.GONE
                it.llLongPressMoviesCinema.visibility = View.GONE
                showRecycler = false
            } else {
                itemView.rvCinemaTimesMoviesCinema.visibility = View.VISIBLE
                it.llLongPressMoviesCinema.visibility = View.VISIBLE
                setUpTimerRecyclerView()
                showRecycler = true


            }

        }
        itemView.tvSeeDetail.setOnClickListener {
            delegateTwo.onTapSeeDetail()
        }


    }

    private fun setUpTimerRecyclerView() {
        itemView.rvCinemaTimesMoviesCinema.adapter = CinemaTimeAdapter(delegate)
        itemView.rvCinemaTimesMoviesCinema.layoutManager =
            GridLayoutManager(itemView.context, 3, GridLayoutManager.VERTICAL, false)


    }


}