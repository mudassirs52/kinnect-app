package com.mudassiryaseen.i230017

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StoryViewerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_viewer)

        findViewById<android.widget.TextView>(R.id.btnCloseViewer).setOnClickListener {
            finish()
        }
    }
}