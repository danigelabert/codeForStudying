package com.danigelabert.codeforstudying

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.danigelabert.codeforstudying.databinding.FragmentFirstBinding
import com.danigelabert.codeforstudying.databinding.FragmentTecerBinding

class TecerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTecerBinding.inflate(inflater)
        binding.button3?.setOnClickListener{
            findNavController().navigate(R.id.action_tecerFragment_to_lastFragment, null)
        }
        return binding.root
    }

}