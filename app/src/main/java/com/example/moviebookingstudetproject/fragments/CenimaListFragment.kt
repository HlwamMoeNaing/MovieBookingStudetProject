package com.example.moviebookingstudetproject.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.activities.SeatActivity
import com.example.moviebookingstudetproject.adapters.CinemaListAdapter
import com.example.moviebookingstudetproject.delegate.SeatItemDelegate
import com.example.moviebookingstudetproject.delegate.SeatItemDelegateSeeDetail
import kotlinx.android.synthetic.main.activity_ticket_booking_screen.*

class CenimaListFragment : Fragment(), SeatItemDelegate ,SeatItemDelegateSeeDetail{
    lateinit var mCinemaListAdapter: CinemaListAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cenima_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpCinemaListRecyclerView()
    }

    private fun setUpCinemaListRecyclerView() {
        mCinemaListAdapter = CinemaListAdapter(this,this)
        rvBookingPlaces.adapter = mCinemaListAdapter
        val layoutManager = LinearLayoutManager(requireContext())
        rvBookingPlaces.layoutManager = layoutManager
        val divider = DividerItemDecoration(requireContext(), layoutManager.orientation)
        rvBookingPlaces.addItemDecoration(divider)


    }

    override fun onTap() {
        Toast.makeText(requireContext(), "tappped ", Toast.LENGTH_LONG).show()
//        SeatActivity.newIntent(this@CinemaListActivity)
        SeatActivity.startMe(requireContext())
    }

    override fun onTapSeeDetail() {
        Toast.makeText(requireContext(), "onTapSeeDetail ", Toast.LENGTH_LONG).show()
    }

}