package com.examples.android.navigationplayground

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.examples.android.navigationplayground.databinding.FragmentABinding
import kotlinx.android.synthetic.main.fragment_a.*

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentA.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentA : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentABinding = DataBindingUtil.inflate(
                inflater,
        R.layout.fragment_a,
        container,
        false
        )

        binding.buttonA.setOnClickListener {view: View ->
            view.findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }
        return binding.root
    }
}
