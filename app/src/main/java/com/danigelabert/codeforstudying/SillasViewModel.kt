package com.danigelabert.codeforstudying

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.danigelabert.codeforstudying.Sillas
import com.danigelabert.codeforstudying.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect


class SillasViewModel: ViewModel() {

    var sillas: LiveData<List<Sillas>>? = null


    //insert sillas
    fun newSillas(context: Context,preu:Int,nom:String,categoria:String) {

        var sillasVM=Sillas(preu, nom, categoria)
        Repository.addSillas(context, sillasVM)
    }

    //sql sillas by nom
    fun getSillasByNom(context: Context, nom: String) : LiveData<List<Sillas>>? {
        sillas = Repository.getSillasByNom(context,nom)
        return sillas
    }

    //sql sillas
    fun getSillas(context: Context) : LiveData<List<Sillas>>? {
        sillas = Repository.getSillas(context)
        return sillas
    }

    //delete sillas
    fun deleteSillas(context: Context, sillas: Sillas) {
        Repository.deleteSillas(context, sillas)
    }
}