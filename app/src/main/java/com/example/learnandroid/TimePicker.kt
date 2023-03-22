package com.example.learnandroid

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_time_picker.*
import java.text.SimpleDateFormat
import java.util.Calendar

class TimePicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        pickTimeBtn.setOnClickListener {
            val cal = Calendar.getInstance()//get calender time zone default
            val timersetListner = TimePickerDialog.OnTimeSetListener{timePicker,hour,minutes->//get Time dialog
                cal.set(Calendar.HOUR_OF_DAY,hour)
                cal.set(Calendar.MINUTE,minutes)

                timer_tv.text = SimpleDateFormat("HH:mm").format(cal.time)
            }

            TimePickerDialog(this,timersetListner,cal.get(Calendar.HOUR_OF_DAY),cal.get(Calendar.MINUTE),true).show()
        }
    }
}