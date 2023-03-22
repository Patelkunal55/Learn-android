package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_view_detailed.*

class WebViewDetailed : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_detailed)


        webview_detailed.loadUrl("https://www.google.co.in/")
    }
}