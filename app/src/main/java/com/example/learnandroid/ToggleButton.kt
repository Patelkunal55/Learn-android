package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        toggle_button.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked){
                tv_text.text = "Button is On"
            }else{
                tv_text.text = "Button is Off"
            }

            Toast.makeText(applicationContext,if (isChecked)"Button is On" else "Button is Off",
                Toast.LENGTH_SHORT).show()

        }
    }
}