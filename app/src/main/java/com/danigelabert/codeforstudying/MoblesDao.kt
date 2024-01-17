package com.danigelabert.codeforstudying

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.danigelabert.codeforstudying.Mobles
import kotlinx.coroutines.flow.Flow

@Dao
interface MoblesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addMobles(moble: Mobles)

    @Query("SELECT * FROM Mesas WHERE tipus =:tipus")
    fun getMoblesByTipus(tipus:String): LiveData<List<Mobles>>

    @Query("SELECT * FROM Mesas")
    fun getMobles(): LiveData<List<Mobles>>

}