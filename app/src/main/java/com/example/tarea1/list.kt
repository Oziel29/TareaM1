package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment

class list : Fragment(R.layout.fragment_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listView = view.findViewById<ListView>(R.id.simpleListView)
        val items = arrayOf("Editores de Texto", "Botones", "Elementos de Selección", "Listas", "Elementos de Información")

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(requireContext(), "Tema: ${items[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}