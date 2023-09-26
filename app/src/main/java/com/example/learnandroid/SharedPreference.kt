package com.example.learnandroid

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreference : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        loadData()
        b_button.setOnClickListener {//This on Clicked button
            saveData()
        }
    }
    private fun saveData() {
        val insertedText = editTextED.text.toString()//this is edit text
        textViewTV.text = insertedText //this is textView
        //initialize Shared Preferences
        val sharedPreference = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)

        //To store the user's preference
        val editior = sharedPreference.edit()
        editior.apply {
            putString("STRING_KEY", insertedText)
            putBoolean("BOOLEAN_KEY", sw_switch.isChecked)
        }.apply()
        Toast.makeText(this, "Data Saved!", Toast.LENGTH_SHORT).show()
    }
    private fun loadData() {
        //To retrieve the user's preference
        val sharedPreference = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val savedString = sharedPreference.getString("STRING_KEY", null)
        val savedBoolean = sharedPreference.getBoolean("BOOLEAN_KEY", false)

        textViewTV.text = savedString
        sw_switch.isChecked = savedBoolean
        Toast.makeText(this, "Data is loaded", Toast.LENGTH_SHORT).show()
    }
}
