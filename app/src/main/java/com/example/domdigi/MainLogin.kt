package com.example.domdigi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        supportActionBar?.hide()

        val btnpindah =findViewById<TextView>(R.id.SignUp)

        btnpindah.setOnClickListener{
             val IntentPindah = Intent( this, Registration::class.java)

                startActivity( IntentPindah)
            }

        val btnlogin =findViewById<Button>(R.id.Login)

        btnlogin.setOnClickListener{
            val IntentPindah = Intent( this, MainMenu::class.java)

            startActivity( IntentPindah)
        }
        }


    }