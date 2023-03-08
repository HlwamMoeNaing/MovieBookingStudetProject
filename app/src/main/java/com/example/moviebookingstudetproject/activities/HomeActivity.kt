package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.ViewPagerBannerAdapter
import com.example.moviebookingstudetproject.const.FetchModel
import com.example.moviebookingstudetproject.delegate.MovieListDelegate
import com.example.moviebookingstudetproject.fragments.CenimaListFragment
import com.example.moviebookingstudetproject.fragments.ComingSoonFragment
import com.example.moviebookingstudetproject.fragments.HomeFragment
import com.example.moviebookingstudetproject.fragments.NowShowingFragment
import com.example.moviebookingstudetproject.modal.MovieListItem
import com.example.moviebookingstudetproject.viewpods.MovieListViewPod
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.view.*
import java.lang.Math.abs

class HomeActivity : AppCompatActivity() {


    companion object {
        fun startMe(context: Context) {
            context.startActivity(Intent(context, HomeActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
      //  setUpToolBar()
        setUpFragment(HomeFragment())

        btNavHome.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.action_movies->setUpFragment(HomeFragment())
                R.id.action_cinema->setUpFragment(CenimaListFragment())
            }
            true
        }
    }
//    private fun setUpToolBar() {
//        setSupportActionBar(toolBar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_near_me_24)
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu_home, menu)
//        return true
//
//    }




    fun setUpFragment(fragment:Fragment){

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerOne,fragment)
            .commit()
    }





}