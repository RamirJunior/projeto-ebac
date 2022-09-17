package com.example.meightproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.meightproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val itemList: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.myList
        addingItensToList()

        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = ListAdapter(itemList)
    }

    private fun addingItensToList() {
        itemList.add(ContactInfo("Bill Gates","+3165498156137"))
        itemList.add(ContactInfo("Steve Jobs","+8164516575136"))
        itemList.add(ContactInfo("Will Smith","+1597654873264"))
        itemList.add(ContactInfo("Angelina Jolie","+13165484654864"))
        itemList.add(ContactInfo("Robert Downey Jr.","+8654845110854"))
        itemList.add(ContactInfo("Silvestre Stallone","+9456532168765"))
        itemList.add(ContactInfo("Mariah Carrey","+3165498156137"))
        itemList.add(ContactInfo("Bruno Mars","+5648754131546"))
        itemList.add(ContactInfo("Zack Zuckemberg","+5321646513155"))
        itemList.add(ContactInfo("Jennifer Lawrence","+3565326245487"))
        itemList.add(ContactInfo("Keanu Reeves","+7548913154862"))
        itemList.add(ContactInfo("Sandra Bullock","+2351849455465"))
    }
}
