package com.example.sis145

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // vuelve transparente los iconos del movil
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.apply {
                addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                statusBarColor = Color.WHITE
                statusBarColor = Color.TRANSPARENT// Reemplaza con el color que desees utilizar
            }
        }

        setContentView(R.layout.activity_main)

        /*creacion de los botones*/

        val btn_grupos = findViewById<Button>(R.id.btn_grupos) as Button
        val btn_temas = findViewById<Button>(R.id.btn_temas) as Button
        val btn_acerca = findViewById<Button>(R.id.btn_acerca) as Button
        val btn_salir = findViewById<Button>(R.id.btn_salir) as Button


    // botones de la pagina principal que llevan a sus propias pantallas
        btn_grupos.setOnClickListener() {
            val intent = Intent(this@MainActivity, grupos::class.java)
            startActivity(intent)
        }
        btn_temas.setOnClickListener() {
            val intent = Intent(this@MainActivity, temas::class.java)
            startActivity(intent)
        }
        btn_acerca.setOnClickListener() {
            val intent = Intent(this@MainActivity, acerca::class.java)
            startActivity(intent)
        }
        btn_salir.setOnClickListener() {
            finish()
        }
    }

}