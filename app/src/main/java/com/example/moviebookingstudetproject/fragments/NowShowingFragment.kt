package com.example.moviebookingstudetproject.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.activities.DetailActivity
import com.example.moviebookingstudetproject.const.FetchModel
import com.example.moviebookingstudetproject.delegate.MovieListDelegate
import com.example.moviebookingstudetproject.modal.MovieListItem
import com.example.moviebookingstudetproject.viewpods.MovieListViewPod
import kotlinx.android.synthetic.main.fragment_now_showing.*

class NowShowingFragment : Fragment(),MovieListDelegate {
    lateinit var mNowShowingViewPod: MovieListViewPod
    private lateinit var mNowShowingItems:List<MovieListItem>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_now_showing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mNowShowingItems = FetchModel.nowShowingArrayList
        Log.d("@Test",mNowShowingItems.toString())
        setUpViewPod()
    }



    private fun setUpViewPod(){
        mNowShowingViewPod = vpNowShowing as MovieListViewPod
        mNowShowingViewPod.setUpMovieListViewPod(this,mNowShowingItems,false)
        //mNowShowingViewPod = vpNowShowing as MovieListViewPod
        //mNowShowingViewPod.setUpMovieListViewPod(this,mNowShowingItems)
    }

    override fun onTapMovie() {
        startActivity(DetailActivity.newIntent(requireContext()))

    }
}