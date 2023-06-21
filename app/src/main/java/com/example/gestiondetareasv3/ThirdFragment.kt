package com.example.gestiondetareasv3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gestiondetareasv3.databinding.FragmentSecondBinding
import com.example.gestiondetareasv3.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_ThirdFragment_to_ForthFragment)
        }

        binding.guardarButton.setOnClickListener{
            guardarTarea()
        }
    }


    fun guardarTarea(){
        val nombreTarea = binding.inpNombreTarea.text
        val fechaTarea = binding.inpFechaTarea.text
        val horaTarea = binding.inpHoraTarea.text

        binding.nombreTareaPrueba.text = getString(R.string.tareaprueba,nombreTarea)
        binding.fechaTareaPrueba.text = getString(R.string.fechaprueba,fechaTarea)
        binding.horaTareaPrueba.text = getString(R.string.horaprueba,horaTarea)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}