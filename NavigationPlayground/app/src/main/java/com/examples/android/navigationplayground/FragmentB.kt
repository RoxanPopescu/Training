package com.examples.android.navigationplayground

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.examples.android.navigationplayground.databinding.FragmentBBinding

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentBBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_b,
            container,
            false
        )

        binding.buttonB.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_fragmentB_to_fragmentC)
        }
        return binding.root
    }
}
