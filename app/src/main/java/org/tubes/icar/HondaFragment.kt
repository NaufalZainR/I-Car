package org.tubes.icar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.tubes.icar.databinding.FragmentHondaBinding


class HondaFragment : Fragment() {

    private lateinit var binding : FragmentHondaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHondaBinding.inflate(inflater,container,false)
        navButton()
        return binding.root
    }

    private fun navButton(){
//        brio
        binding.btnBrio.setOnClickListener {
            findNavController().navigate(R.id.action_hondaFragment_to_hondabrioFragment)
        }
//        hrv
        binding.btnHrv.setOnClickListener {
            findNavController().navigate(R.id.action_hondaFragment_to_hondahrvFragment)
        }
//        Brv
        binding.btnBrv.setOnClickListener {
            findNavController().navigate(R.id.action_hondaFragment_to_hondabrvFragment)
        }
//        Crv
        binding.btnCrv.setOnClickListener {
            findNavController().navigate(R.id.action_hondaFragment_to_hondacrvFragment)
        }
//        city
        binding.btnCity.setOnClickListener {
            findNavController().navigate(R.id.action_hondaFragment_to_hondacityFragment)
        }
//        civic
        binding.btnCivic.setOnClickListener {
            findNavController().navigate(R.id.action_hondaFragment_to_hondacivicFragment)
        }
//        mobilio
        binding.btnMobilio.setOnClickListener {
            findNavController().navigate(R.id.action_hondaFragment_to_hondamobilioFragment)
        }
//        Accord
        binding.btnAccord.setOnClickListener {
            findNavController().navigate(R.id.action_hondaFragment_to_hondaaccordFragment)
        }
    }

}