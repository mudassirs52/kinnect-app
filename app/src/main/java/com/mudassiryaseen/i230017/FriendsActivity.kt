package com.mudassiryaseen.i230017

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FriendsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        findViewById<android.widget.TextView>(R.id.btnSearch).setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        findViewById<android.widget.TextView>(R.id.tabHome).setOnClickListener {
            finish()
        }
    }
}