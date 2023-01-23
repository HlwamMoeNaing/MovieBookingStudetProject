package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.viewHolders.SplashViewHolder

class SplashAdapters:RecyclerView.Adapter<SplashViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SplashViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_splash,parent,false)
        return SplashViewHolder(view)
    }

    override fun onBindViewHolder(holder: SplashViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 4
    }
}