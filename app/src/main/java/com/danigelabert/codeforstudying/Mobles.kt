package com.danigelabert.codeforstudying


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Mesas")
data class Mobles(
    @ColumnInfo(name = "Precio")
    var preu: Int,
    var tipus: String,
    @ColumnInfo(name = "Categoria")
    var categoria: String
){
    @PrimaryKey(autoGenerate = true)
    var Id: Int? = null
}
