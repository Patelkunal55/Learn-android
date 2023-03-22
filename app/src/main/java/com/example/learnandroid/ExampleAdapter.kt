package com.example.learnandroid
import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(private val exampleList:List<ExampleItem>,
private val listner : OnItemClickListner) :RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        //In the context of RecyclerView in Android, onCreateViewHolder()
        // is a method of the RecyclerView.Adapter class
        // that is responsible for creating a new ViewHolder object.

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item,parent,false)
        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        //In the context of RecyclerView in Android,
        // onBindViewHolder() is a method of the RecyclerView.Adapter class
        // that is responsible for binding data to the views in the ViewHolder object.
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.text1
        holder.textView1.text = currentItem.text2


    }

    override fun getItemCount() = exampleList.size

    inner class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    ,android.view.View.OnClickListener{

        val imageView : ImageView = itemView.image_view
        val textView : TextView = itemView.text_view_1
        val textView1 : TextView = itemView.text_view_2

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = bindingAdapterPosition// adapterPosition is deprecated
            //This line gets the position of the clicked item in the adapter, which is
            // the data source for the RecyclerView. The bindingAdapterPosition property
            // is used here to get the position, although adapterPosition is also available
            // (but deprecated). Note that the position may be invalid if the item has been
            // removed or the data set has changed since the RecyclerView was last drawn.

            if (position != RecyclerView.NO_POSITION) {
                //This line checks whether the position is valid (i.e. not equal to RecyclerView.NO_POSITION).
                // If the position is invalid, it means that the clicked item is no longer present
                // in the adapter or the adapter's data set has changed since the RecyclerView was last drawn.

                listner.onItemClick(position)
                //This line calls a method called onItemClick on a listener object (listner), passing in the
               // position of the clicked item as an argument. Presumably, this listener interface is implemented
               // by the activity or fragment that contains the RecyclerView, and it defines what should happen
               // when an item is clicked.
            }
        }
    }

    interface OnItemClickListner {
        fun onItemClick(position: Int)
    }





}