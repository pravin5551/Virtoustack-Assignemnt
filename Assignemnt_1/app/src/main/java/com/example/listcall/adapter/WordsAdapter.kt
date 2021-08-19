package com.example.listcall.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listcall.R
import com.example.listcall.model.ListData_Model
import com.example.listcall.viewholder.WordsViewHolder

class WordsAdapter(private var wordList:List<ListData_Model>):


    RecyclerView.Adapter<WordsViewHolder>() {


    private var selectedItemPosition: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return WordsViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        val dataClass = wordList[position]
        holder.setData(dataClass)
        holder.itemView.setOnClickListener {
            selectedItemPosition = position
            notifyDataSetChanged()
        }

        if(selectedItemPosition == position)
            holder.cardView.setBackgroundColor(Color.parseColor("#FF0000"))
        else
            holder.cardView.setBackgroundColor(Color.parseColor("#00FF00"))
    }

    override fun getItemCount(): Int {
        return wordList.size
    }
}