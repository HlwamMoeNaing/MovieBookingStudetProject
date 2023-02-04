package com.example.moviebookingstudetproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.SnackFragmentViewPagerAdapter
import com.example.moviebookingstudetproject.const.FetchModel
import com.example.moviebookingstudetproject.fragments.*
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_snack.*

class SnackActivity : AppCompatActivity() {
    lateinit var mSnackViewPagerAdapter: SnackFragmentViewPagerAdapter

    companion object {
        fun startMe(context: Context) {
            context.startActivity(Intent(context, SnackActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // supportFragmentManager.beginTransaction().add(R.id.fContainer,AllSnackFragment()).commit()
        setContentView(R.layout.activity_snack)
        setUpTabLayout()
        helloGit()
       // setUpListener()
    }

    fun setUpTabLayout() {
        mSnackViewPagerAdapter = SnackFragmentViewPagerAdapter(this)
        vpTabLayout.adapter = mSnackViewPagerAdapter

        TabLayoutMediator(tabLayoutSnackBar, vpTabLayout) { tab, position ->
            for (i in FetchModel.tabList.indices) {
                if (position == i) {
                    tab.text = FetchModel.tabList[i]
                }
            }

        }.attach()

//        val tabs = FetchModel.tabList
//        tabs.forEach {
//            val tab = tabLayoutSnackBar.newTab()
//            tab.text = it
//            tabLayoutSnackBar.addTab(tab)
//        }


    }

    private fun setUpListener() {
        tabLayoutSnackBar.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {


//                if(tab?.text == FetchModel.tabList[0]){
//                    supportFragmentManager.beginTransaction().replace(R.id.fContainer,AllSnackFragment()).commit()
//                }else if(tab?.text == FetchModel.tabList[1]){
//                    supportFragmentManager.beginTransaction().replace(R.id.fContainer,ComboFragment()).commit()
//                }else if(tab?.text == FetchModel.tabList[2]){
//                    supportFragmentManager.beginTransaction().replace(R.id.fContainer,SnackFragment()).commit()
//                }else if(tab?.text == FetchModel.tabList[3]){
//                    supportFragmentManager.beginTransaction().replace(R.id.fContainer,PopCornFragment()).commit()
//                }else if(tab?.text == FetchModel.tabList[4]){
//                    supportFragmentManager.beginTransaction().replace(R.id.fContainer,BeverageFragment()).commit()
//                }else{
//                    supportFragmentManager.beginTransaction().replace(R.id.fContainer,AllSnackFragment()).commit()
//                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }

    fun helloGit() {
        print("Hello Git")
    }


}