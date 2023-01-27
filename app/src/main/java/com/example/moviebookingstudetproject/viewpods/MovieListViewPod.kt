package com.example.moviebookingstudetproject.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviebookingstudetproject.adapters.MovieListAdapter
import com.example.moviebookingstudetproject.delegate.MovieListDelegate
import com.example.moviebookingstudetproject.modal.MovieListItem
import kotlinx.android.synthetic.main.view_pod_movie_list.view.*

class MovieListViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {
lateinit var movieAdapter:MovieListAdapter
lateinit var mDelegate:MovieListDelegate



    override fun onFinishInflate() {

        super.onFinishInflate()
    }

    fun setUpMovieListViewPod(delegate: MovieListDelegate,movieListItem: List<MovieListItem>,isDate:Boolean){

        setDelegate(delegate)
        setUpRecyclerView(movieListItem,isDate)

    }

    fun setDelegate(delegate: MovieListDelegate){
        this.mDelegate = delegate

    }

    fun setUpRecyclerView(movieListItem: List<MovieListItem>,isDate: Boolean){

        val manager = GridLayoutManager(context, 2)
        movieAdapter = MovieListAdapter(context,mDelegate,isDate)
        movieAdapter.setData(movieListItem)
        rvMovieList.adapter = movieAdapter
        rvMovieList.layoutManager = manager
        rvMovieList.addItemDecoration(DividerItemDecoration(context, manager.orientation))
    }
}