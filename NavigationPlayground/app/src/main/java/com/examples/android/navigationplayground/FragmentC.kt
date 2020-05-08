package com.examples.android.navigationplayground

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.examples.android.navigationplayground.R.layout.fragment_c
import com.examples.android.navigationplayground.databinding.FragmentCBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentC.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentC : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentCBinding = DataBindingUtil.inflate(
            inflater,
            fragment_c,
            container,
            false
        )
//        binding.buttonC.setOnClickListener {view: View ->
//            view.findNavController().navigate(R.id.action_fragmentC_to_fragmentB)
//        }
        return binding.root
    }
}
