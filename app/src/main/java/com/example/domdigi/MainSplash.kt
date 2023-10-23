package com.example.domdigi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.delay

class MainSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splash)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this@MainSplash, MainLogin::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}