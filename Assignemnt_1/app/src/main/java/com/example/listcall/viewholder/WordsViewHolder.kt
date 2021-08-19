package com.example.listcall.viewholder

import android.graphics.Color
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listcall.model.ListData_Model
import kotlinx.android.synthetic.main.item_layout.view.*

class WordsViewHolder(private val view:View):RecyclerView.ViewHolder(view) {

    var wordsTV: TextView? = null

    fun setData(wordsData: ListData_Model){
        view.apply {
            wordsTV.text = wordsData.name.toString()

        }

    }
    val cardView: LinearLayout = itemView.cardView
}


