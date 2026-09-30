package com.mudassiryaseen.i230017

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<android.widget.TextView>(R.id.btnCreateAccount).setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}