package com.example.moviebookingstudetproject.viewpods

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.moviebookingstudetproject.adapters.SnackItemAdapter
import kotlinx.android.synthetic.main.snack_recycler_view_pod.view.*

class SnackListViewPod @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {
    lateinit var mSnackItemAdapter: SnackItemAdapter


    override fun onFinishInflate() {
        super.onFinishInflate()
    }

    fun setUpSnackViewPod() {
        setRecyclerView()
    }

    private fun setRecyclerView() {
        mSnackItemAdapter = SnackItemAdapter()
        rvSnack.adapter = mSnackItemAdapter
        rvSnack.layoutManager = GridLayoutManager(context, 2)
    }
}