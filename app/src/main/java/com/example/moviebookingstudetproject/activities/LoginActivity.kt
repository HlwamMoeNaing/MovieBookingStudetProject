package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.moviebookingstudetproject.R
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    companion object {
        fun startLogin(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }
    var countryCode = arrayOf<String?>("+95","+86","+65","+75","+45")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        countrySpinner.onItemSelectedListener = this
        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(
            this,
            android.R.layout.simple_spinner_item,
            countryCode)

        ad.setDropDownViewResource(
            android.R.layout
                .simple_spinner_dropdown_item);

        // Set the ArrayAdapter (ad) data on the
        // Spinner which binds data to spinner
        countrySpinner.adapter = ad;


        btnConfirmOTP.setOnClickListener {
            startActivity(OTPActivity.startOTP(this))
        }

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        (p0?.getChildAt(0) as TextView).setTextColor(Color.WHITE)

        Toast.makeText(
            applicationContext,
            countryCode[position],
            Toast.LENGTH_LONG)
            .show();
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}