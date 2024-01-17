package com.danigelabert.codeforstudying

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.danigelabert.codeforstudying.Mobles
import com.danigelabert.codeforstudying.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect


class MoblesViewModel: ViewModel() {

    var mobles: LiveData<List<Mobles>>? = null


    //insert mobles
    fun newSillas(context: Context, preu:Int, nom:String, categoria:String) {

        var moblesVM=Mobles(preu, nom, categoria)
        Repository.addMobles(context, moblesVM)
    }

    //sql mobles by tipus
    fun getSillasByNom(context: Context, tipus: String) : LiveData<List<Mobles>>? {
        mobles = Repository.getMoblesByTipus(context,tipus)
        return mobles
    }

    //sql mobles
    fun getSillas(context: Context) : LiveData<List<Mobles>>? {
        mobles = Repository.getMobles(context)
        return mobles
    }
}