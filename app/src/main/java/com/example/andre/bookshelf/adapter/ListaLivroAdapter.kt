package com.example.andre.bookshelf.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.andre.bookshelf.db.Livro

class ListaLivroAdapter internal constructor(context: Context){

    var onItemClick : ((Livro) -> Unit)? = null

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var livros = emptyList<Livro>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //val tituloLivro: TextView
    }
}