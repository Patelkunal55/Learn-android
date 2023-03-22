package com.example.learnandroid

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.util.Calendar

class DatePicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        val cal = Calendar.getInstance()//an instance of the Calendar class is created using the getInstance() method.

        val year = cal.get(Calendar.YEAR)//the year, month, and day are retrieved from the Calendar
        val month = cal.get(Calendar.MONTH)// instance using the get() method and the appropriate field constants from the Calendar class.
        val day = cal.get(Calendar.DAY_OF_MONTH)

        pickDateBtn.setOnClickListener {

            val dpd = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, mYear, mMonth, mDay ->
                //This line creates a DatePickerDialog object, which is a dialog box
                // that allows the user to select a date. The DatePickerDialog
                // constructor takes several arguments:

                date_tv.setText("" +mDay+ "/" + mMonth + "/" + mYear)
            },year,month,day)
            dpd.show()
        }

    }












}