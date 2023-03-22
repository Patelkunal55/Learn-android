package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
import kotlinx.android.synthetic.main.activity_spinner.*

class Spinner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val customlist = arrayOf("First","Second","Third","Fourth")
        val adapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,customlist)
        spMonths.adapter = adapter

        spMonths.onItemSelectedListener = object : android.widget.AdapterView.OnItemSelectedListener{
                                                    //this anoymous class

            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
               val pass : String = "You Selected: ${adapterView?.getItemAtPosition(position).toString()}"
               Toast.makeText(applicationContext,pass,Toast.LENGTH_LONG).show()
                spTextView.text = pass

            }

            override fun onNothingSelected(adapterView: AdapterView<*>?) {



            }
        }


    }
}