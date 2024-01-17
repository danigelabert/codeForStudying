package com.danigelabert.codeforstudying

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.danigelabert.codeforstudying.Mobles
import com.danigelabert.codeforstudying.Sillas


@Database(
    entities = [Mobles::class, Sillas::class],
    version = 1,
    exportSchema = false
)


abstract class dataBase  : RoomDatabase(){
    abstract fun moblesDao() : MoblesDao
    abstract fun sillasDao() : SillasDao

    companion object {

        @Volatile
        private var INSTANCE: dataBase? = null

        fun getDatabase(context: Context): dataBase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            if (INSTANCE == null) {
                synchronized(this) {
                    // Pass the database to the INSTANCE
                    INSTANCE = buildDatabase(context)
                }
            }
            // Return database.
            return INSTANCE!!
        }

        private fun buildDatabase(context: Context): dataBase {
            return Room.databaseBuilder(
                context.applicationContext,
                dataBase::class.java,
                "muebles_database"
            )
                .build()
        }
    }
}