package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class button : Fragment(R.layout.fragment_button) {

    private var clickCount = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnStandard = view.findViewById<Button>(R.id.btnStandard)
        val btnImage = view.findViewById<ImageButton>(R.id.btnImage)
        val btnLongClick = view.findViewById<Button>(R.id.btnLongClick)
        val btnCounter = view.findViewById<Button>(R.id.btnCounter)
        val fab = view.findViewById<FloatingActionButton>(R.id.fabExample)

        // Acción estándar
        btnStandard.setOnClickListener {
            Toast.makeText(requireContext(), "Botón Estándar presionado", Toast.LENGTH_SHORT).show()
        }

        // Botón de imagen
        btnImage.setOnClickListener {
            Toast.makeText(requireContext(), "Botón de imagen presionado", Toast.LENGTH_SHORT).show()
        }

        // Long Click (Pulsación larga)
        btnLongClick.setOnLongClickListener {
            Toast.makeText(requireContext(), "¡Acción secundaria activada por clic largo!", Toast.LENGTH_SHORT).show()
            true // Indica que el evento ha sido gestionado
        }

        // Cambio de estado (Contador)
        btnCounter.setOnClickListener {
            clickCount++
            btnCounter.text = "Veces presionado: $clickCount"
        }

        // Floating Action Button (Acción flotante)
        fab.setOnClickListener {
            Toast.makeText(requireContext(), "Acción principal (FAB) ejecutada", Toast.LENGTH_SHORT).show()
        }
    }
}
