package org.tubes.icar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.tubes.icar.databinding.FragmentHondaBinding


class HondaFragment : Fragment() {

    private lateinit var binding : FragmentHondaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHondaBinding.inflate(inflater,container,false)

        return binding.root
    }


}