package com.example.moviebookingstudetproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.moviebookingstudetproject.R
import com.example.moviebookingstudetproject.adapters.ViewPagerBannerAdapter
import com.example.moviebookingstudetproject.const.FetchModel
import com.example.moviebookingstudetproject.delegate.MovieListDelegate
import com.example.moviebookingstudetproject.modal.MovieListItem
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), MovieListDelegate {
    private lateinit var  viewPager2: ViewPager2
    private lateinit var imageList:ArrayList<Int>

    private lateinit var mCommintSoonItems:List<MovieListItem>
    private var isDate = false
    private lateinit var adapter: ViewPagerBannerAdapter
    private var isNowShowing = true
    private var isComingSoon = false

    //lateinit var mNowShowingViewPod:MovieListViewPod

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager2 = view.findViewById(R.id.bannerViewPager)
        init()
        setUpTransformer()
        setUpViewPod()
        mCommintSoonItems = FetchModel.comingSoonArrayList
        setUpFragment(NowShowingFragment())
    }
    private fun setUp(){
        btnNowShowing.setOnClickListener {
            isDate = false
            isNowShowing = true
            isComingSoon = false
            if(isNowShowing){
                btnNowShowing.background = AppCompatResources.getDrawable(requireContext(),R.drawable.button_radius_bg)
                btnComingSoon.background = AppCompatResources.getDrawable(requireContext(),R.drawable.button_transprance_radius_bg)
            }

            setUpFragment(NowShowingFragment())




        }

        btnComingSoon.setOnClickListener {
            isDate = true

            isNowShowing = false
            isComingSoon = true
            if(isComingSoon){
                btnComingSoon.background = AppCompatResources.getDrawable(requireContext(),R.drawable.button_radius_bg)
                btnNowShowing.background = AppCompatResources.getDrawable(requireContext(),R.drawable.button_transprance_radius_bg)
            }

            setUpFragment(ComingSoonFragment())

        }


    }
    private fun setUpViewPod(){
        setUp()
        //mNowShowingItems = ArrayList()
        mCommintSoonItems = ArrayList()

        //mNowShowingViewPod = vpNowShowing as MovieListViewPod
        //mNowShowingViewPod.setUpMovieListViewPod(this,mNowShowingItems)
    }
    private fun setUpTransformer(){
        val transformer = CompositePageTransformer()
        transformer.addTransformer(MarginPageTransformer(40))
        transformer.addTransformer { page, position ->
            val r = 1 - Math.abs(position)
            page.scaleY = 0.85f + r * 0.14f
        }

        viewPager2.setPageTransformer(transformer)
    }
    private fun init(){

        imageList = ArrayList()

        imageList.add(R.drawable.banner_item)
        imageList.add(R.drawable.banner_item)
        imageList.add(R.drawable.banner_item)
        imageList.add(R.drawable.banner_item)



        adapter = ViewPagerBannerAdapter(imageList)

        viewPager2.adapter = adapter
        dotsIndicatorBanner.attachTo(viewPager2)
        viewPager2.offscreenPageLimit = 3
        viewPager2.clipToPadding = false
        viewPager2.clipChildren = false
        viewPager2.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

    }
    fun setUpFragment(fragment:Fragment){

        childFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerOne,fragment)
            .commit()
    }

    override fun onTapMovie() {

    }
}