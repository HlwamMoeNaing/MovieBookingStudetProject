package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviebookingstudetproject.R
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {

    companion object {
        fun startMe(context: Context) {
            context.startActivity(Intent(context, PaymentActivity::class.java))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        setUpListeners()
    }

    private fun setUpListeners() {
        btnUpiMethodProfilePayment.setOnClickListener {
            TicketComfirmationActivity.startMe(this)
        }

        btnGiftVoucherMethodProfilePayment.setOnClickListener {
            TicketComfirmationActivity.startMe(this)
        }

        btnQuickPayMethodProfilePayment.setOnClickListener {
            TicketComfirmationActivity.startMe(this)
        }

        btnCreditMethodProfilePayment.setOnClickListener {
            TicketComfirmationActivity.startMe(this)
        }

        btnRedeemMethodProfilePayment.setOnClickListener {
            TicketComfirmationActivity.startMe(this)
        }

        btnMobileWalletMethodProfilePayment.setOnClickListener {
            TicketComfirmationActivity.startMe(this)
        }

        btnNetBankingMethodProfilePayment.setOnClickListener {
            TicketComfirmationActivity.startMe(this)
        }
    }
}