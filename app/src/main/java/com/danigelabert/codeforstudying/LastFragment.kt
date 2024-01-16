package com.danigelabert.codeforstudying

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.danigelabert.codeforstudying.databinding.FragmentFirstBinding
import com.danigelabert.codeforstudying.databinding.FragmentLastBinding


class LastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLastBinding.inflate(inflater)
        binding.button4?.setOnClickListener{
            findNavController().navigate(R.id.action_lastFragment_to_firstFragment, null)
        }
        return binding.root
    }
}