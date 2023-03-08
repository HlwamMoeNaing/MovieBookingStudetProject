package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.FoodOrderedAdapter
import kotlinx.android.synthetic.main.activity_checkout.*

class CheckoutActivity : AppCompatActivity() {

    private lateinit var mOrderedFoodAdapter: FoodOrderedAdapter
    companion object {
        fun startMe(context: Context) {
            context.startActivity(Intent(context, CheckoutActivity::class.java))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)
        setUpFoodOrderListRecyclerView()
        rlTicketCancellationMoviesCheckout.setOnClickListener {
            PaymentActivity.startMe(this)
        }
    }

    private fun setUpFoodOrderListRecyclerView() {
        mOrderedFoodAdapter = FoodOrderedAdapter()
        rvFoodOrderedListMoviesTicketCheckout.adapter = mOrderedFoodAdapter
        rvFoodOrderedListMoviesTicketCheckout.layoutManager = LinearLayoutManager(this)
        rvFoodOrderedListMoviesTicketCheckout.setHasFixedSize(true)
        mOrderedFoodAdapter.notifyDataSetChanged()
    }
}