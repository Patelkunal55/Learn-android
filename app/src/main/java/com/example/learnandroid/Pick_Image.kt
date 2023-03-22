package com.example.learnandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_pick_image.*

class Pick_Image : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageView: ImageView

    private val contract = registerForActivityResult(ActivityResultContracts.GetContent()){
        image_shown.setImageURI(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_image)

        btn_pick_image.setOnClickListener {
            contract.launch("image/*")
        }
    }
}