package org.tubes.icar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.tubes.icar.databinding.FragmentSuzukiBinding

class SuzukiFragment : Fragment() {

    private lateinit var binding : FragmentSuzukiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSuzukiBinding.inflate(inflater, container, false)

        navButton()

        return binding.root
    }

    private fun navButton(){
//        ioniq
        binding.btnBaleno.setOnClickListener {
            findNavController().navigate(R.id.action_suzukiFragment_to_suzukibalenoFragment)
        }
//        Creta
        binding.btnErtiga.setOnClickListener {
            findNavController().navigate(R.id.action_suzukiFragment_to_suzukiertigaFragment)
        }
//        Staria
        binding.btnJimmy.setOnClickListener {
            findNavController().navigate(R.id.action_suzukiFragment_to_suzukijimmyFragment)
        }
//        Crv
        binding.btnIgnis.setOnClickListener {
            findNavController().navigate(R.id.action_suzukiFragment_to_suzukiignisFragment)
        }
//        city
        binding.btnkarimun.setOnClickListener {
            findNavController().navigate(R.id.action_suzukiFragment_to_suzukikarimunFragment)
        }
//        civic
        binding.btnPreso.setOnClickListener {
            findNavController().navigate(R.id.action_suzukiFragment_to_suzukipresoFragment)
        }
//        mobilio
        binding.btnSx4.setOnClickListener {
            findNavController().navigate(R.id.action_suzukiFragment_to_suzukisx4Fragment)
        }
//        Accord
        binding.btnXl7.setOnClickListener {
            findNavController().navigate(R.id.action_suzukiFragment_to_suzukixl7Fragment)
        }
    }

}