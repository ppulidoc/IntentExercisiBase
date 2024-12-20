package com.paudam.intentexercisibase

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import androidx.databinding.DataBindingUtil
import com.paudam.intentexercisibase.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val KEY_NOM="nom"
    val KEY_DNI="dni"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.sendButton.setOnClickListener {

            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra(KEY_NOM, binding.nomText.text.toString())
            intent.putExtra(KEY_DNI,  binding.dniText.text.toString())
            startActivity(intent)

        }



    }
}