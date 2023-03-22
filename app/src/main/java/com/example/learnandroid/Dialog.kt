package com.example.learnandroid

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_dialog.*

class Dialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)


        btn_dialog.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("This dialog show message!")
            builder.setMessage("This is a personal dialog which is show in box")
            builder.setIcon(R.drawable.warning)

            builder.setPositiveButton("Yes") {dialogInterface , which ->
                Toast.makeText(this,"Yes is clicked",Toast.LENGTH_SHORT).show()
            }

            builder.setNegativeButton("No"){ dialogInterface ,which ->
                Toast.makeText(this,"No is clicked",Toast.LENGTH_SHORT).show()
            }

            builder.setNeutralButton("Cancel"){dialogInterface,which->
                Toast.makeText(this,"Cancel is clicked",Toast.LENGTH_SHORT).show()
            }

            val alertDialog : AlertDialog = builder.create()
            alertDialog.create()
            alertDialog.show()
        }
    }


}