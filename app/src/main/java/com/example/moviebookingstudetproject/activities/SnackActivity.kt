package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.SnackFragmentViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_snack.*

class SnackActivity : AppCompatActivity() {
    lateinit var mSnackViewPagerAdapter:SnackFragmentViewPagerAdapter

    companion object {
        fun startMe(context: Context) {
            context.startActivity(Intent(context, SnackActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack)
        setUpTabLayout()
    }

    fun setUpTabLayout() {
        mSnackViewPagerAdapter = SnackFragmentViewPagerAdapter(this)
        vpTabLayout.adapter = mSnackViewPagerAdapter

        TabLayoutMediator(tabLayoutSnackBar, vpTabLayout) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "All"
                }
                1 -> {
                    tab.text = "Combo"
                }
                2 -> {
                    tab.text = "Snack"
                }
                3 -> {
                    tab.text = "Pop Corn"
                }
                4 -> {
                    tab.text = "Beverage"
                }
                5 -> {
                    tab.text = "Beverage"
                }
                6 -> {
                    tab.text = "Beverage"
                }

            }

        }.attach()
    }
}