package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.SeatAdapter
import com.example.moviebookingstudetproject.delegate.SeatItemDelegate
import kotlinx.android.synthetic.main.activity_seat.*

class SeatActivity : AppCompatActivity(){



    companion object {
        fun startMe(context: Context) {
            context.startActivity(Intent(context, SeatActivity::class.java))
        }
    }
    lateinit var mSeatAdapter:SeatAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat)
        setUpToolBar()
        setUpSeatRecycler()

        btnBuy.setOnClickListener {
            SnackActivity.startMe(this)
        }
    }

    private fun setUpToolBar(){
        setSupportActionBar(toolBar)
        supportActionBar?.title =""
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_white_24dp)
    }

    private fun setUpSeatRecycler(){
        //rvSeats
        mSeatAdapter = SeatAdapter()
        rvSeats.adapter = mSeatAdapter
        rvSeats.layoutManager = LinearLayoutManager(this)
    }


}