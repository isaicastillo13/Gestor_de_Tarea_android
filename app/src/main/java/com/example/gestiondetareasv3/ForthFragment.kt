package com.example.gestiondetareasv3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.gestiondetareasv3.databinding.FragmentForthBinding



/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ForthFragment : Fragment() {

    private lateinit var editText: EditText
    private var _binding: FragmentForthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentForthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecordatorioLayout()

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_ForthFragment_FirstFragment)
        }
    }

    private fun setupRecordatorioLayout() {
        val btnGuardar: Button = binding.guardarButtonEdit
        editText = binding.inpNombreTareaEdit
        val fecha: EditText=binding.inpHoraFechaEdit
        val hora: EditText=binding.inpNombreTareaEdit

        btnGuardar.setOnClickListener {
            val nombreTarea = editText.text.toString()
            val Fecha= fecha.text.toString()
            val Hora=hora.text.toString()
            val mensaje = "Nombre de la tarea: $nombreTarea\nFecha: $Fecha \t Hora: $Hora"
            mostrarMensaje(mensaje)
        }
    }

    private fun mostrarMensaje(mensaje: String) {
        Toast.makeText(requireContext(), mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}