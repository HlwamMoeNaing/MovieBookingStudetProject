package com.example.moviebookingstudetproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.viewHolders.BannerViewHolder

class ViewPagerBannerAdapter(private val imageList: ArrayList<Int>) :
    RecyclerView.Adapter<BannerViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_banner, parent, false)
        return BannerViewHolder(view)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.imageView.setImageResource(imageList[position])

    }

    override fun getItemCount(): Int {
        return imageList.size
    }


}