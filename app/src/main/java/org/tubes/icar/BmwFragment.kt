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

        navButton()

        return binding.root
    }

    private fun navButton(){
//        i8
        binding.btni8.setOnClickListener {
            findNavController().navigate(R.id.action_bmwFragment_to_bmwi8Fragment)
        }
//        x7
        binding.btnx7.setOnClickListener {
            findNavController().navigate(R.id.action_bmwFragment_to_bmwx7Fragment)
        }
//        m4
        binding.btnm4.setOnClickListener {
            findNavController().navigate(R.id.action_bmwFragment_to_bmwm4Fragment)
        }
//        z4
        binding.btnz4.setOnClickListener {
            findNavController().navigate(R.id.action_bmwFragment_to_bmwz4Fragment)
        }
//        520i
        binding.btni520.setOnClickListener {
            findNavController().navigate(R.id.action_bmwFragment_to_bmw520iFragment)
        }
//        530i
        binding.btni530.setOnClickListener {
            findNavController().navigate(R.id.action_bmwFragment_to_bmw530iFragment)
        }
//        218i
        binding.btn218i.setOnClickListener {
            findNavController().navigate(R.id.action_bmwFragment_to_bmw218iFragment)
        }
//        8seris
        binding.btn8seris.setOnClickListener {
            findNavController().navigate(R.id.action_bmwFragment_to_bmw8serisFragment)
        }
    }


}