package com.danigelabert.codeforstudying

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.danigelabert.codeforstudying.Sillas
import kotlinx.coroutines.flow.Flow

@Dao
interface SillasDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addSillas(Sillas: Sillas)

    @Query("SELECT * FROM Silla WHERE nom =:nom")
    fun getSillasByNom(nom:String): LiveData<List<Sillas>>

    @Query("SELECT * FROM Silla")
    fun getSillas(): LiveData<List<Sillas>>

    @Delete
    fun deleteSillas(sillas: Sillas)

}