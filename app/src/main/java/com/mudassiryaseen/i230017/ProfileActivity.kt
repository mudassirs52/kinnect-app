package com.mudassiryaseen.i230017

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        findViewById<android.widget.TextView>(R.id.btnBack).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        findViewById<android.widget.TextView>(R.id.btnEditProfile).setOnClickListener {
            startActivity(Intent(this, EditProfileActivity::class.java))
        }
    }
}