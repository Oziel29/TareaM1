package com.example.tarea1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // 1. Establecer el Fragment inicial (el de texto) al abrir la app
        if (savedInstanceState == null) {
            loadFragment(text())
        }

        // 2. Configurar el listener para detectar los clics en el menú inferior
        navView.setOnItemSelectedListener { item ->
            val fragment: Fragment = when (item.itemId) {
                R.id.nav_text -> text()
                R.id.nav_button -> button()
                R.id.nav_selection -> selection()
                R.id.nav_list -> list()
                R.id.nav_info -> info()
                else -> text()
            }
            loadFragment(fragment)
            true
        }
    }

    /**
     * Función auxiliar para realizar la transacción de fragments
     */
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out) // Animación suave
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}