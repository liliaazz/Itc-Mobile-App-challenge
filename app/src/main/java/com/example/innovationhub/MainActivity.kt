package com.example.innovationhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlinx.android.synthetic.main.activity_main.login_btn

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener {
            val i = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(i)
        }

    }
}