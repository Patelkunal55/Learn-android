package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dummy.*

class Dummy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dummy)

        button2.setOnClickListener {
            val input : String = editText2.text.toString()

            textView6.setText(input).toString()
            Toast.makeText(this,"Text is shown",Toast.LENGTH_SHORT).show()
        }
    }
}