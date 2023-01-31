package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.CastListAdapter
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    lateinit var mCastAdapter: CastListAdapter
    private var isPlaying = false

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, DetailActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        btnBooking.setOnClickListener {
            startActivity(CinemaListActivity.newIntent(this))
        }

        setUpCastListRecycler()
        playPauseController()
    }

    private fun playPauseController(){
        btnPlay.setOnClickListener {
            setUpMovieTrailerVideo()
            if(!isPlaying){
                btnPlay.setImageResource(R.drawable.ic_baseline_pause_white_22dp)
                vvTrailer.start()
                isPlaying = true
            }else{
                btnPlay.setImageResource(R.drawable.play_btn)
                vvTrailer.pause()
                isPlaying = false
            }
        }
    }


    private fun setUpMovieTrailerVideo(){
        val mediaController = MediaController(this)
        mediaController.setAnchorView(vvTrailer)

        val videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cat)
        vvTrailer.setMediaController(mediaController)

        vvTrailer.setVideoURI(videoUri)
        vvTrailer.requestFocus()
    }

    private fun setUpCastListRecycler() {
        mCastAdapter = CastListAdapter()
        rvCastMoviesDetails.adapter = mCastAdapter
        rvCastMoviesDetails.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL, false
        )


    }

}