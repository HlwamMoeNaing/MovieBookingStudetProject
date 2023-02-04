package com.example.moviebookingstudetproject.adapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moviebookingstudetproject.fragments.*
import com.google.android.material.tabs.TabLayout

class SnackFragmentViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->{

                val allFragment = AllSnackFragment()
                val bundle = Bundle()
                bundle.putString("Key","This is All Fragment")
               // tabLayout.selectTab()
                allFragment.arguments = bundle
                return allFragment
            }

            1->{
                val comboFragment = ComboFragment()
                val bundle = Bundle()
                bundle.putString("Key","This is Combo Fragment")
                comboFragment.arguments = bundle
                return comboFragment
            }
            2->{
                val snackFragment = SnackFragment()
                val bundle = Bundle()
                bundle.putString("Key","This is Snack Fragment")
                snackFragment.arguments = bundle
                return snackFragment
            }
            3->{
                val popCornFragment = PopCornFragment()
                val bundle = Bundle()
                bundle.putString("Key","This is Pop Corn Fragment")
                popCornFragment.arguments = bundle
                return popCornFragment
            }
            4->{
                val beverageFragment = BeverageFragment()
                val bundle = Bundle()
                bundle.putString("Key","This is beverage Fragment")
                beverageFragment.arguments = bundle
                return beverageFragment
            }
            else->{

                val allFragment = AllSnackFragment()
                val bundle = Bundle()
                bundle.putString("Key","This is All Fragment")
                // tabLayout.selectTab()
                allFragment.arguments = bundle
                return allFragment
            }
        }
    }
}