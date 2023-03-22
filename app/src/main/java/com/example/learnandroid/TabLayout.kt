package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnandroid.adapters.ViewPagerAdapter
import com.example.learnandroid.fragment.FavouriteFragment
import com.example.learnandroid.fragment.HomeFragment
import com.example.learnandroid.fragment.SettingFragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_tab_layout.*

class TabLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        setUpTab()
    }

    private fun setUpTab(){
        val adapter = ViewPagerAdapter(this)
        adapter.addFragment(HomeFragment(),"Home")
        adapter.addFragment(FavouriteFragment(),"Favourites")
        adapter.addFragment(SettingFragment(),"Setting")
        viewPager.adapter = adapter


        TabLayoutMediator(tab_layout,viewPager){ tabs,positon->
            tabs.text = adapter.getTitle(positon)
        }.attach()

        //tabs.setupWithViewPager(viewPager)
        //tabs.getTabAt(0)!!.setIcon(R.drawable.ic_home)
        //tabs.getTabAt(1)!!.setIcon(R.drawable.ic_favorite)
        //tabs.getTabAt(2)!!.setIcon(R.drawable.ic_settings)
    }
}