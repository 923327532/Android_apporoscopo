package com.roberto.horoscapp.Ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment  // Falta este import
import androidx.navigation.ui.setupWithNavController
import com.roberto.horoscapp.R
import com.roberto.horoscapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // ✅ Correcto
        setContentView(binding.root)
        initUI()
    }
    private fun initUI(){
        initNavigation()
    }

    private fun initNavigation(){
        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as? NavHostFragment

        // Debes verificar que navHost no sea null:
        val navController = navHost?.navController ?: return

        binding.buttomNavView.setupWithNavController(navController)
    }
}

