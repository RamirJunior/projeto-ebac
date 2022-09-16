package com.example.meightproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)

        return ListItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.posicao.text = position.toString()
        holder.conteudo.text = "aula de recycler"
    }

    override fun getItemCount(): Int {
        return 3
    }

    class ListItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var posicao = view.findViewById<TextView>(R.id.posicao)
        var conteudo = view.findViewById<TextView>(R.id.conteudo)
    }
}