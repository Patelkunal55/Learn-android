package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.learnandroid.fragment.FavouriteFragment
import com.example.learnandroid.fragment.HomeFragment
import com.example.learnandroid.fragment.SettingFragment
import kotlinx.android.synthetic.main.activity_bottom_navigation.*
import kotlinx.android.synthetic.main.activity_fragment_layout.*

class Bottom_Navigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val homeFragment = HomeFragment()
        val favouriteFragment = FavouriteFragment()
        val settingFragment = SettingFragment()

        makeCurrentFragment(homeFragment)

        bottom_nav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item_home -> makeCurrentFragment(homeFragment)
                R.id.item_favourite -> makeCurrentFragment(favouriteFragment)
                R.id.item_settting -> makeCurrentFragment(settingFragment)

            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}