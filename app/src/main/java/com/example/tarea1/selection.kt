package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import androidx.fragment.app.Fragment

class selection : Fragment(R.layout.fragment_selection) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cbOption = view.findViewById<CheckBox>(R.id.cbOption)
        val switchDemo = view.findViewById<Switch>(R.id.switchDemo)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroupDemo)

        cbOption.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(requireContext(), "Aceptado: $isChecked", Toast.LENGTH_SHORT).show()
        }

        switchDemo.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(requireContext(), "Notificaciones: $isChecked", Toast.LENGTH_SHORT).show()
        }

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val radio: RadioButton = view.findViewById(checkedId)
            Toast.makeText(requireContext(), "Elegiste: ${radio.text}", Toast.LENGTH_SHORT).show()
        }
    }
}