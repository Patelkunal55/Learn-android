package com.example.learnandroid

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_popup_menu.*

class PopupMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_menu)

        btn_pop.setOnClickListener {
            showPopupMenu(it)
        }
    }

    private fun showPopupMenu(view: View){
        android.widget.PopupMenu(this,view).apply {
            inflate(R.menu.menu_itme)
            setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.item_1 -> {
                        Toast.makeText(applicationContext,"Item 1 Selected",Toast.LENGTH_SHORT).show()
                        // Handle menu item 1 click
                        true
                    }
                    R.id.item_2 -> {
                        Toast.makeText(applicationContext,"Item 2 Selected",Toast.LENGTH_SHORT).show()
                        // Handle menu item 2 click
                        true
                    }
                    R.id.item_3 -> {
                        Toast.makeText(applicationContext,"Item 3 Selected",Toast.LENGTH_SHORT).show()
                        // Handle menu item 1 click
                        true
                    }
                    R.id.item_4 -> {
                        Toast.makeText(applicationContext,"Item 4 Selected",Toast.LENGTH_SHORT).show()
                        // Handle menu item 1 click
                        true
                    }
                    else -> false
                }
            }
            show()
        }

    }
}