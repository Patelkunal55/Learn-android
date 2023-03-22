package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*
import kotlin.random.Random

class RecyclerView : AppCompatActivity(),ExampleAdapter.OnItemClickListner {

    private val dataItem = ArrayList<ExampleItem>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)


        dataItem()

        recycler_view.adapter = ExampleAdapter(dataItem,this)
        //This line sets the adapter for the RecyclerView, which is responsible for managing the data
        // and creating views for each item in the list. The ExampleAdapter is a custom adapter that
        // is being used here, and exampleList is a list of data that will be displayed in the RecyclerView.
        // The this keyword refers to the current context (i.e. the activity or fragment that contains
        // the RecyclerView).

        recycler_view.layoutManager = LinearLayoutManager(this)
        //This line sets the layout manager for the RecyclerView, which is responsible for measuring
        // and positioning item views within the list. Here, we are using the LinearLayoutManager class,
        // which arranges items in a vertical or horizontal linear list. The this keyword again refers
        // to the current context.

        recycler_view.setHasFixedSize(true)
        //This line sets a fixed size for the RecyclerView, which can improve performance by allowing
        // the RecyclerView to optimize its layout calculations. Setting this to true tells the RecyclerView
        // that its size won't change at runtime.



    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this,"Clicked: $position",Toast.LENGTH_SHORT).show()
        val clickedItem = dataItem[position]
        clickedItem.text1 = "Clicked"
    }

    fun dataItem(){



         dataItem.add(ExampleItem(R.drawable.ic_kabaddi,"Line1","Line2"))
         dataItem.add(ExampleItem(R.drawable.ic_satisfied,"Line1","Line2"))


    }




}