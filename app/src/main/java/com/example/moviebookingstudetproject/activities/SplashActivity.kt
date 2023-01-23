package com.example.moviebookingstudetproject.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.SplashAdapters
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.android.synthetic.main.view_item_splash.*

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    lateinit var mSplashAdapters: SplashAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setUpSplashScreen()
        testBtn.setOnClickListener {
        startActivity(LoginActivity.startLogin(this))
        }
    }

    private fun setUpSplashScreen() {
        mSplashAdapters = SplashAdapters()
        splashViewPager.adapter = mSplashAdapters
        dotsIndicatorBanner.attachTo(splashViewPager)
    }
}