package com.danigelabert.codeforstudying

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.danigelabert.codeforstudying.databinding.ActivitySegonBinding
import com.danigelabert.codeforstudying.databinding.FragmentFirstBinding
import com.danigelabert.codeforstudying.databinding.FragmentSegonBinding

class SegonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSegonBinding.inflate(inflater)
        binding.button2?.setOnClickListener{
            findNavController().navigate(R.id.action_segonFragment_to_tecerFragment, null)
        }
        return binding.root
    }

}