package com.mudassiryaseen.i230017

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        findViewById<android.widget.TextView>(R.id.btnCloseCamera).setOnClickListener {
            finish()
        }

        findViewById<android.widget.TextView>(R.id.btnShutter).setOnClickListener {
            startActivity(Intent(this, StoryEditorActivity::class.java))
        }
    }
}