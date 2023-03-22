package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Option_Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_menu)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.nav_delete -> Toast.makeText(this,"Delete Selected",Toast.LENGTH_SHORT).show()
            R.id.nav_favortie -> Toast.makeText(this,"Favorite Selected",Toast.LENGTH_SHORT).show()
            R.id.nav_item_1 -> Toast.makeText(this,"Item1 Selected",Toast.LENGTH_SHORT).show()
            R.id.nav_item_2 -> Toast.makeText(this,"Item2 Selected",Toast.LENGTH_SHORT).show()
            R.id.nav_item_3 -> Toast.makeText(this,"Item3 Selected",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}