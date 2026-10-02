package com.mudassiryaseen.i230017

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class YourStoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_story)

        findViewById<android.widget.TextView>(R.id.btnCloseStory).setOnClickListener {
            finish()
        }
    }
}