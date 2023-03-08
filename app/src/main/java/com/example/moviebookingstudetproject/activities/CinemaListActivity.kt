package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.CinemaDateCardAdapter
import com.example.moviebookingstudetproject.adapters.CinemaListAdapter
import com.example.moviebookingstudetproject.adapters.SeatAdapter
import com.example.moviebookingstudetproject.delegate.SeatItemDelegate
import com.example.moviebookingstudetproject.delegate.SeatItemDelegateSeeDetail
import kotlinx.android.synthetic.main.activity_ticket_booking_screen.*

class CinemaListActivity : AppCompatActivity(),SeatItemDelegate,SeatItemDelegateSeeDetail {
    lateinit var cinemaDateCardAdapter: CinemaDateCardAdapter
    lateinit var mCinemaListAdapter: CinemaListAdapter

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, CinemaListActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket_booking_screen)
        setUpCinemaDateCardRecyclerview()
        setUpCinemaListRecyclerView()
    }

    private fun setUpCinemaDateCardRecyclerview() {
        cinemaDateCardAdapter = CinemaDateCardAdapter()
        rvDatesBooking.adapter = cinemaDateCardAdapter
        rvDatesBooking.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }


    private fun setUpCinemaListRecyclerView() {
        mCinemaListAdapter = CinemaListAdapter(this,this)
        rvBookingPlaces.adapter = mCinemaListAdapter
        val layoutManager = LinearLayoutManager(this)
        rvBookingPlaces.layoutManager = layoutManager
        val divider = DividerItemDecoration(this, layoutManager.orientation)
        rvBookingPlaces.addItemDecoration(divider)



    }

    override fun onTap() {
        Toast.makeText(this,"tappped ",Toast.LENGTH_LONG).show()
//        SeatActivity.newIntent(this@CinemaListActivity)
        val i = Intent(this,SeatActivity::class.java)
        startActivity(i)

    }

    override fun onTapSeeDetail() {
        Toast.makeText(this,"on Tap See Detail ",Toast.LENGTH_LONG).show()
    }
}