package com.danigelabert.codeforstudying

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.danigelabert.codeforstudying.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

//    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFirstBinding.inflate(inflater)
        binding.button?.setOnClickListener{
            findNavController().navigate(R.id.action_firstFragment_to_segonFragment, null)
        }
        return binding.root
    }
}