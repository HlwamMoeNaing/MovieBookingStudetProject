package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.CityAdapter
import kotlinx.android.synthetic.main.activity_pick_region.*

class PickRegionActivity : AppCompatActivity() {
    companion object {
        fun startPickRegion(context: Context): Intent {
            return Intent(context, PickRegionActivity::class.java)
        }
    }
    val cityArray = listOf<String>("Yangon","Mandalay","Taungyi","Magwe","Sagine")
    lateinit var mCityAdapter : CityAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_region)
        setUpCityRecycler()
        btnNavigate.setOnClickListener {
           startActivity( HomeActivity.startHome(this))
        }
    }
    private fun setUpCityRecycler(){
        mCityAdapter = CityAdapter(cityArray)
        rvCity.adapter = mCityAdapter
        rvCity.layoutManager = LinearLayoutManager(this)

    }
}