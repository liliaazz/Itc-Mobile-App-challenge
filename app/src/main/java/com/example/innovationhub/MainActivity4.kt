package com.example.innovationhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.swipe_btn

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        swipe_btn.setOnClickListener {
            val i = Intent(this@MainActivity4, MainActivity3::class.java)
            startActivity(i)
        }
    }
}