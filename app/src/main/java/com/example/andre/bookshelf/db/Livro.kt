package com.example.andre.bookshelf.db

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "livro_table")
data class Livro (

    @ColumnInfo(name = "etTitulo")
    var etTitulo: String,

    @ColumnInfo(name = "etAutor")
    var etAutor: String

    ):Serializable{
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
    }

)