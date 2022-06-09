package org.tubes.icar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.tubes.icar.databinding.FragmentHyundaiBinding

class HyundaiFragment : Fragment() {

    private lateinit var binding : FragmentHyundaiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHyundaiBinding.inflate(inflater, container, false)

        navButton()

        return binding.root
    }

    private fun navButton(){
//        ioniq
        binding.btnIoniq.setOnClickListener {
            findNavController().navigate(R.id.action_hyundaiFragment_to_hyundaiioniqFragment)
        }
//        Creta
        binding.btnCreta.setOnClickListener {
            findNavController().navigate(R.id.action_hyundaiFragment_to_hyundaicretaFragment)
        }
//        Staria
        binding.btnStaria.setOnClickListener {
            findNavController().navigate(R.id.action_hyundaiFragment_to_hyundaistariaFragment)
        }
//        Crv
        binding.btnKona.setOnClickListener {
            findNavController().navigate(R.id.action_hyundaiFragment_to_hyundaikonaFragment)
        }
//        city
        binding.btnPalisade.setOnClickListener {
            findNavController().navigate(R.id.action_hyundaiFragment_to_hyundaipalisadeFragment)
        }
//        civic
        binding.btnSanta.setOnClickListener {
            findNavController().navigate(R.id.action_hyundaiFragment_to_hyundaisantaFragment)
        }
//        mobilio
        binding.btnCester.setOnClickListener {
            findNavController().navigate(R.id.action_hyundaiFragment_to_hyundaicesterFragment)
        }
//        Accord
        binding.btnTuscon.setOnClickListener {
            findNavController().navigate(R.id.action_hyundaiFragment_to_hyundaitusconFragment)
        }
    }


}