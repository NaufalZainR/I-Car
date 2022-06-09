package org.tubes.icar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.tubes.icar.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var binding : FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDashboardBinding.inflate(inflater, container, false)

        navButton()

        return binding.root
    }


    private fun navButton(){
//        bmw
        binding.btnBmw.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_bmwFragment)
        }
//        mitshubishi
        binding.btnMitsubishi.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_mitshubishiFragment)
        }
//        honda
        binding.btnHonda.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_hondaFragment)
        }
//        mercedez
        binding.btnMercedez.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_mercedezFragment)
        }
//        toyota
        binding.btnToyota.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_toyotaFragment)
        }
//        suzuki
        binding.btnSuzuki.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_suzukiFragment)
        }
//        hyundai
        binding.btnHyundai.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_hyundaiFragment)
        }
//        daihatshu
        binding.btnDaihatsu.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_daihatsuFragment)
        }

//        logout
        binding.btnLogout.setOnClickListener{
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }
    }


}