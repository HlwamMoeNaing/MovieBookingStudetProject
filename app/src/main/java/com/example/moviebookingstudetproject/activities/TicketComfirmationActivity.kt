package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import com.example.moviebookingstudetproject.R
import kotlinx.android.synthetic.main.activity_ticket_comfirmation.*

class TicketComfirmationActivity : AppCompatActivity() {
    companion object {
        fun startMe(context: Context) {
            context.startActivity(Intent(context, TicketComfirmationActivity::class.java))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket_comfirmation)

        btnDoneMoviesTicketConfirmation.setOnClickListener {
            HomeActivity.startMe(this)
        }
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            ivBookingSuccessMoviesTicketConfirmation?.visibility = View.INVISIBLE

        },3000)
    }
}