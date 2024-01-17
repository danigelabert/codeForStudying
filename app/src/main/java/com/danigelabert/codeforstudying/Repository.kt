package com.danigelabert.codeforstudying

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Database
import com.danigelabert.codeforstudying.dataBase
import com.danigelabert.codeforstudying.Sillas
import com.danigelabert.codeforstudying.Mobles
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class Repository {


    companion object {

        var Databases: dataBase? = null

        var mobles: LiveData<List<Mobles>>? = null

        var sillas: LiveData<List<Sillas>>? = null


        fun initializeDB(context: Context): dataBase {
            return dataBase.getDatabase(context)
        }

        //Sillas
        fun addSillas(context: Context, sillas: Sillas) {

            Databases = initializeDB(context)

            CoroutineScope(IO).launch {
                Databases!!.sillasDao().addSillas(sillas)
            }
        }

        fun getSillas(context: Context): LiveData<List<Sillas>>? {

            Databases = initializeDB(context)

            CoroutineScope(IO).launch {
                sillas = Databases!!.sillasDao().getSillas()
            }
            return sillas
        }

        fun getSillasByNom(context: Context, nom: String): LiveData<List<Sillas>>? {

            Databases = initializeDB(context)

            CoroutineScope(IO).launch {
                sillas = Databases!!.sillasDao().getSillasByNom(nom)
            }
            return sillas
        }

        fun deleteSillas(context: Context, sillas: Sillas) {

            Databases = initializeDB(context)

            CoroutineScope(IO).launch {
                Databases!!.sillasDao().deleteSillas(sillas)
            }
        }


        //MOBLES
        fun addMobles(context: Context, mobles: Mobles) {

            Databases = initializeDB(context)

            CoroutineScope(IO).launch {
                Databases!!.moblesDao().addMobles(mobles)
            }
        }

        fun getMobles(context: Context): LiveData<List<Mobles>>? {

            Databases = initializeDB(context)

            CoroutineScope(IO).launch {
                mobles = Databases!!.moblesDao().getMobles()
            }
            return mobles
        }

        fun getMoblesByTipus(context: Context, tipus: String): LiveData<List<Mobles>>? {

            Databases = initializeDB(context)

            CoroutineScope(IO).launch {
                mobles = Databases!!.moblesDao().getMoblesByTipus(tipus)
            }
            return mobles
        }
    }
}