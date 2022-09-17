package com.example.meightproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meightproject.databinding.ItemListaBinding

class ListAdapter(
    val listItens: MutableList<ListItem>,
    val listener: ListAdapterListener
) : RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(
            ItemListaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val item = listItens[position]
        holder.posicao.text = position.toString()
        holder.conteudo.text = item.city

        holder.view.setOnClickListener {
            listener.onItemClicked(item.city)
        }
    }

    override fun getItemCount(): Int {
        return listItens.size
    }

    class ListItemViewHolder(binding: ItemListaBinding) : RecyclerView.ViewHolder(binding.root) {
        var view = binding.root
        var posicao = binding.posicao
        var conteudo = binding.conteudo
    }

    interface ListAdapterListener{
        fun onItemClicked(content: String)
    }
}