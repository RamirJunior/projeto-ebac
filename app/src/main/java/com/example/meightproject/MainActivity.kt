package com.example.meightproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meightproject.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), ListAdapter.ListAdapterListener {

    private lateinit var binding: ActivityMainBinding
    private val itemList: MutableList<ListItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.myList

        createMockData()

        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = ListAdapter(itemList, this)
    }

    private fun createMockData(){
        itemList.add(ListItem("São Luís", "MA"))
        itemList.add(ListItem("São Paulo", "SP"))
        itemList.add(ListItem("Belo Horizonte", "MG"))
        itemList.add(ListItem("Curitiba", "PR"))
        itemList.add(ListItem("Florianópolis", "SC"))
        itemList.add(ListItem("Rio de Janeiro", "RJ"))
        itemList.add(ListItem("Porto Alegre", "RS"))
        itemList.add(ListItem("Salvador", "BA"))
        itemList.add(ListItem("Belém", "PA"))
        itemList.add(ListItem("Palmas", "TO"))
    }

    override fun onItemClicked(content: String) {
        Snackbar.make(binding.root, content, Snackbar.LENGTH_SHORT).show()
    }
}
