package com.mudassiryaseen.i230017

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StoryEditorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_editor)

        findViewById<android.widget.TextView>(R.id.btnCloseEditor).setOnClickListener {
            finish()
        }

        findViewById<android.widget.TextView>(R.id.btnShareStory).setOnClickListener {
            val intent = Intent(this, YourStoryActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }
}