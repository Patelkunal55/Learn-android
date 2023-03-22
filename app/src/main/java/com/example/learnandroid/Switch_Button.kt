package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_switch_button.*

class Switch_Button : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button)

        text_on_off.text = " "

        switch_on_off.setOnCheckedChangeListener { compoundButton, b ->

            if (switch_on_off.isChecked){
                text_on_off.text = "Switch is On"
                Toast.makeText(this,"Switch is On",Toast.LENGTH_SHORT).show()
            }else{
                text_on_off.text = "Switch is Off"
                Toast.makeText(this,"Switch is Off",Toast.LENGTH_SHORT).show()
            }
        }
    }
}