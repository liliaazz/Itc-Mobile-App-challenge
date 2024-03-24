package com.example.innovationhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main3.Courses_btn
import kotlinx.android.synthetic.main.activity_main3.home_btn
import kotlinx.android.synthetic.main.activity_main3.profile
import kotlinx.android.synthetic.main.activity_main3.profile_btn
import kotlinx.android.synthetic.main.activity_main3.trainers_btn

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        trainers_btn.setOnClickListener {
            displayFragment(TeachersFragment())
        }

        profile.setOnClickListener {
            displayFragment(ProfileFragment())
        }

        home_btn.setOnClickListener {
            displayFragment(homeFragment())
        }

        profile_btn.setOnClickListener {
            displayFragment(ProfileFragment())
        }

        Courses_btn.setOnClickListener {
            displayFragment(CourseFragment())
        }

    }

    private fun displayFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frag_container, fragment)
            .commit()
    }

}