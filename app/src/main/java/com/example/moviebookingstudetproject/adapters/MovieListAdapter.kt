package com.example.moviebookingstudetproject.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.delegate.MovieListDelegate
import com.example.moviebookingstudetproject.modal.MovieListItem
import com.example.moviebookingstudetproject.viewHolders.MovieListViewHolder
import com.example.moviebookingstudetproject.viewpods.MovieListViewPod
import org.w3c.dom.Text

class MovieListAdapter(val context:Context,private val delegate: MovieListDelegate,val isDate:Boolean):RecyclerView.Adapter<MovieListViewHolder>() {

    private val items = arrayListOf<MovieListItem>()


    @SuppressLint("NotifyDataSetChanged")
    fun setData(accountsList: List<MovieListItem>) {
        items.clear()
        items.addAll(accountsList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_movie_list,parent,false)
        return MovieListViewHolder(view,delegate)
    }

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        val tvDate = holder.itemView.findViewById<AppCompatTextView>(R.id.tvDate)
        val ivMovie = holder.itemView.findViewById<AppCompatImageView>(R.id.ivMovie)
        val tvImDbText = holder.itemView.findViewById<TextView>(R.id.tvImDbText)
        val tvMovieName = holder.itemView.findViewById<AppCompatTextView>(R.id.tvMovieName)
        if(!isDate){
            tvDate.visibility = View.GONE
        }else{
            tvDate.visibility = View.VISIBLE
        }

        tvDate.text = items[position].date
        ivMovie.setImageDrawable(AppCompatResources.getDrawable(context,items[position].image))
        tvImDbText.text = items[position].rating
        tvMovieName.text = items[position].movieName


    }

    override fun getItemCount()  = items.size
}