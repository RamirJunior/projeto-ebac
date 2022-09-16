package com.example.meightproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.meightproject.databinding.ItemListaBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

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
        holder.posicao.text = position.toString()
        holder.conteudo.text = "aula de recycler"
    }

    override fun getItemCount(): Int {
        return 3
    }

    class ListItemViewHolder(binding: ItemListaBinding) : RecyclerView.ViewHolder(binding.root) {
        var posicao = binding.posicao
        var conteudo = binding.conteudo
    }
}