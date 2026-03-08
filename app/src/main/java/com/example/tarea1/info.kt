package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment

class info : Fragment(R.layout.fragment_info) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val progressBar = view.findViewById<ProgressBar>(R.id.progressBarDemo)
        val btnLoad = view.findViewById<Button>(R.id.btnLoadInfo)
        val tvStatus = view.findViewById<TextView>(R.id.tvStatusInfo)

        btnLoad.setOnClickListener {
            btnLoad.isEnabled = false
            progressBar.visibility = View.VISIBLE
            tvStatus.text = "Cargando información del sistema..."

            view.postDelayed({
                progressBar.visibility = View.GONE
                tvStatus.text = "¡Información cargada correctamente!"
                btnLoad.isEnabled = true
            }, 2500)
        }
    }
}