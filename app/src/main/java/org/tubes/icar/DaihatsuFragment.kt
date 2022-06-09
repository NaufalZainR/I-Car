package org.tubes.icar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.tubes.icar.databinding.FragmentDaihatsuBinding

class DaihatsuFragment : Fragment() {

    private lateinit var binding : FragmentDaihatsuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDaihatsuBinding.inflate(inflater, container, false)

        navButton()

        return binding.root
    }

    private fun navButton(){
//        ioniq
        binding.btnXenia.setOnClickListener {
            findNavController().navigate(R.id.action_daihatsuFragment_to_daihatsuxeniaFragment)
        }
//        Creta
        binding.btnSirion.setOnClickListener {
            findNavController().navigate(R.id.action_daihatsuFragment_to_daihatsusirionFragment)
        }
//        Staria
        binding.btnLuxio.setOnClickListener {
            findNavController().navigate(R.id.action_daihatsuFragment_to_daihatsuluxioFragment)
        }
//        Crv
        binding.btnTerios.setOnClickListener {
            findNavController().navigate(R.id.action_daihatsuFragment_to_daihatsuteriosFragment)
        }
//        city
        binding.btnRocky.setOnClickListener {
            findNavController().navigate(R.id.action_daihatsuFragment_to_daihatsurockyFragment)
        }
//        civic
        binding.btnGrandmax.setOnClickListener {
            findNavController().navigate(R.id.action_daihatsuFragment_to_daihatsugrandmaxFragment)
        }
//        mobilio
        binding.btnSigra.setOnClickListener {
            findNavController().navigate(R.id.action_daihatsuFragment_to_daihatsusigraFragment)
        }
//        Accord
        binding.btnAlya.setOnClickListener {
            findNavController().navigate(R.id.action_daihatsuFragment_to_daihatsualyaFragment)
        }
    }


}