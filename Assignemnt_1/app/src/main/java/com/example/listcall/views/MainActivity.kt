package com.example.listcall.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listcall.R
import com.example.listcall.adapter.WordsAdapter
import com.example.listcall.model.ListData_Model
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var wordAdapter : WordsAdapter

    private var wordList: List<ListData_Model>? = null
    private var is_colorchanged: Boolean = false
    private  var color:Long =0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buildRecyclerData();
        setRecyclerView()

        btnRefresh.setOnClickListener {
            setRecyclerView()
        }
    }

    private fun buildRecyclerData() {
        wordList = ArrayList()


        for (i in 0..99) {
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Alpha"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Beta"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Cat"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Fantom"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Fantom"))

            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Saitama"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Goal"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Helina"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Machine"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Note"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Beta"))
            (wordList as ArrayList<ListData_Model>).add(ListData_Model("Saitama"))

        }
    }

    private fun setRecyclerView() {
        val adapter = wordList?.let { WordsAdapter(it) }
        val linearLayout = LinearLayoutManager(this)
        recyclerview.layoutManager = linearLayout
        recyclerview.adapter = adapter
        if (adapter != null) {
            adapter.notifyDataSetChanged()
        }
    }
}