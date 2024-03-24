package com.example.innovationhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_main.login_btn
import kotlinx.android.synthetic.main.activity_main2.swipe_btn

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        swipe_btn.setOnClickListener {
            val i = Intent(this@MainActivity2, MainActivity4::class.java)
            startActivity(i)
        }

    }
}