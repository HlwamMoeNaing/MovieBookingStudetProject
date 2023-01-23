package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.viewHolders.CityViewHolder
import kotlinx.android.synthetic.main.view_item_cities.view.*

class CityAdapter(val list: List<String>) : RecyclerView.Adapter<CityViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_cities, parent, false)
        return CityViewHolder(view)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val cityName = holder.itemView.tvCityName
        cityName.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}