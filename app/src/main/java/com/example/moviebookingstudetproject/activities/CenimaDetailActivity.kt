package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviebookingstudetproject.R

class CenimaDetailActivity : AppCompatActivity() {
    companion object {
        fun startMe(context: Context) {
            context.startActivity(Intent(context, CenimaDetailActivity::class.java))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cenima_detail)
    }
}