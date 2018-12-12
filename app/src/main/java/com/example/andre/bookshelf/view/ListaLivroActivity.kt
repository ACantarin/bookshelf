package com.example.andre.bookshelf.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.andre.bookshelf.R
import kotlinx.android.synthetic.main.activity_lista_livro.*

class ListaLivroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_livro)

        val recyclerView = rvListaLivros

    }
}
