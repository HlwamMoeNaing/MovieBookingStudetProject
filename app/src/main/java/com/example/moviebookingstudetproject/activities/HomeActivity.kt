package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.ViewPagerBannerAdapter
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.view.*
import java.lang.Math.abs

class HomeActivity : AppCompatActivity() {
    companion object {
        fun startHome(context: Context): Intent {
            return Intent(context, HomeActivity::class.java)
        }
    }
    private lateinit var  viewPager2: ViewPager2
    private lateinit var imageList:ArrayList<Int>
    private lateinit var adapter: ViewPagerBannerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setUpToolBar()
        init()
        setUpTransformer()
    }

    private fun setUpToolBar() {
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_near_me_24)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return true

    }


    private fun setUpTransformer(){
        val transformer = CompositePageTransformer()
        transformer.addTransformer(MarginPageTransformer(40))
        transformer.addTransformer { page, position ->
            val r = 1 - abs(position)
            page.scaleY = 0.85f + r * 0.14f
        }

        viewPager2.setPageTransformer(transformer)
    }

    private fun init(){
        viewPager2 = findViewById(R.id.bannerViewPager)
        imageList = ArrayList()

        imageList.add(R.drawable.banner_item)
        imageList.add(R.drawable.banner_item)
        imageList.add(R.drawable.banner_item)
        imageList.add(R.drawable.banner_item)



        adapter = ViewPagerBannerAdapter(imageList)

        viewPager2.adapter = adapter
        dotsIndicatorBanner.attachTo(viewPager2)
        viewPager2.offscreenPageLimit = 3
        viewPager2.clipToPadding = false
        viewPager2.clipChildren = false
        viewPager2.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

    }
}