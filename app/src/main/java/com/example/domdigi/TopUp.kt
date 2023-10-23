package com.example.domdigi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TopUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_up)
        supportActionBar?.hide()

        val btn_topup =findViewById<Button>(R.id.btn_back)

        btn_topup.setOnClickListener{
            val IntentPindah = Intent( this, MainMenu::class.java)

            startActivity( IntentPindah)
        }
    }




}