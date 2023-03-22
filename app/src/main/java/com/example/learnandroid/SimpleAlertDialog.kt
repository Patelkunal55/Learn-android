package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_simple_alert_dialog.*

class SimpleAlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_alert_dialog)

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle) //set title for dialog

            builder.setMessage(R.string.dialogMessage)//set Message for dialog

            builder.setIcon(R.drawable.warning)//set Icon for dialog

            builder.setPositiveButton("Yes"){dialogInterface,which ->
                Toast.makeText(applicationContext,"clicked Yes",Toast.LENGTH_SHORT).show()
            }

            builder.setNeutralButton("Cancel"){dialogInterface,which ->
                Toast.makeText(applicationContext,"clicked cancel\n operation cancel",Toast.LENGTH_SHORT).show()
            }

            builder.setNegativeButton("No"){dialogInterface,which ->
                Toast.makeText(applicationContext,"clicked No",Toast.LENGTH_SHORT).show()
            }

            val alertDialog: AlertDialog = builder.create()//Create the alertDialog

            alertDialog.setCancelable(false)
            alertDialog.create()
            alertDialog.show()



        }
    }
}