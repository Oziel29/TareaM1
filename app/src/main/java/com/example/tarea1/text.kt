package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class text : Fragment(R.layout.fragment_text) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etInput = view.findViewById<EditText>(R.id.etInput)
        val etPassword = view.findViewById<EditText>(R.id.editTextTextPassword)
        val etPhone = view.findViewById<EditText>(R.id.etPhone)
        val btnEnviar = view.findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            // Mostrar mensaje
            Toast.makeText(requireContext(), "Datos enviados", Toast.LENGTH_SHORT).show()

            // Borrar contenido de los cuadros de texto
            etInput.text.clear()
            etPassword.text.clear()
            etPhone.text.clear()
        }
    }
}