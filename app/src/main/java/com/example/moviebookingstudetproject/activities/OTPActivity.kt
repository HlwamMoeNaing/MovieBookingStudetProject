package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviebookingstudetproject.R
import kotlinx.android.synthetic.main.activity_login.*

class OTPActivity : AppCompatActivity() {
    companion object {
        fun startOTP(context: Context): Intent {
            return Intent(context, OTPActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpactivity)

        btnConfirmOTP.setOnClickListener {
            startActivity(PickRegionActivity.startPickRegion(this))
        }
    }
}