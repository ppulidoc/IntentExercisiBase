package com.paudam.intentexercisibase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.paudam.intentexercisibase.databinding.ActivityMain2Binding
import com.paudam.intentexercisibase.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var v_nom:String
    lateinit var v_dni:String

    val KEY_NOM="nom"
    val KEY_DNI="dni"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMain2Binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        enableEdgeToEdge()
       // setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //con esto haces un get intent, con esto obtienes los intents de otras variables
    val intent2 = intent
        binding.textViewNom.text = intent2.getStringExtra(KEY_NOM)
        binding.textViewDNI.text = intent2.getStringExtra(KEY_DNI)





    }
}