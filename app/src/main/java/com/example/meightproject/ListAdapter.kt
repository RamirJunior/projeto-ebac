package com.example.meightproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meightproject.databinding.ContactItemBinding

class ListAdapter(
    private val listItems: MutableList<ContactInfo>
) : RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(
            ContactItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val item = listItems[position]
        holder.name.text = item.name
        holder.phone.text = item.phone
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    class ListItemViewHolder(binding: ContactItemBinding) : RecyclerView.ViewHolder(binding.root){
        var name = binding.name
        var phone = binding.phone
    }
}
