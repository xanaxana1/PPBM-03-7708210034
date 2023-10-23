package com.example.domdigi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        supportActionBar?.hide()



        val btn_scan =findViewById<Button>(R.id.btn_scan)

        btn_scan.setOnClickListener{
            val IntentPindah = Intent( this, MainActivityQR::class.java)

            startActivity( IntentPindah)
        }

        val btn_topup =findViewById<Button>(R.id.btn_topup)

        btn_topup.setOnClickListener{
            val IntentPindah = Intent( this, TopUp::class.java)

            startActivity( IntentPindah)
        }

        val btn_mail =findViewById<Button>(R.id.btn_mail)

        btn_mail.setOnClickListener{
            val IntentPindah = Intent( this, Mail::class.java)

            startActivity( IntentPindah)
        }

        val btn_transfer =findViewById<Button>(R.id.btn_transfer)

        btn_transfer.setOnClickListener{
            val IntentPindah = Intent( this, Transfer::class.java)

            startActivity( IntentPindah)
        }

        val btn_buypulsa =findViewById<Button>(R.id.btn_buy)

        btn_buypulsa.setOnClickListener{
            val IntentPindah = Intent( this, TopUp::class.java)

            startActivity( IntentPindah)
        }

        val btn_profile =findViewById<Button>(R.id.btn_more)

        btn_profile.setOnClickListener{
            val IntentPindah = Intent( this, About::class.java)

            startActivity( IntentPindah)
        }

    }
}