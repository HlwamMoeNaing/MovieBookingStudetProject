package com.example.moviebookingstudetproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.viewpods.SnackListViewPod
import kotlinx.android.synthetic.main.fragment_all_snack.*
import kotlinx.android.synthetic.main.fragment_combo.*

class ComboFragment : Fragment() {
lateinit var mComboViewPod:SnackListViewPod

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_combo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewPod()
    }

    private fun setUpViewPod() {
        mComboViewPod = vpCombo as SnackListViewPod
        mComboViewPod.setUpSnackViewPod()
    }

}