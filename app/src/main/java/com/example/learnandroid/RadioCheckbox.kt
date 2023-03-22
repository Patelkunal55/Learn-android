package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_radio_checkbox.*

class RadioCheckbox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_checkbox)

        btnOrder.setOnClickListener {

            val radioButtonMeat = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(radioButtonMeat)
            val chesse = cheese.isChecked
            val onion = onion.isChecked
            val salad = salad.isChecked
            val orderString = "You ordered a burger with: \n" +
                    "${meat.text}"+
                    (if (chesse) "\n Cheese" else "")+
                    (if (onion)"\n Onion" else "")+
                    (if (salad) "\n Salad" else "")

            muttonText.text = orderString

        }


    }
}