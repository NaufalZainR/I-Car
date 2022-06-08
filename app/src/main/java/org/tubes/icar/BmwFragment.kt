package org.tubes.icar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.tubes.icar.databinding.FragmentBmwBinding


class BmwFragment : Fragment() {

    private lateinit var binding : FragmentBmwBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBmwBinding.inflate(inflater, container, false)

        binding.btni8.setOnClickListener {
            findNavController().navigate(R.id.action_bmwFragment_to_bmwi8Fragment)
        }

        return binding.root
    }


}