package com.mudassiryaseen.i230017

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ReactionPickerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reaction_picker)

        findViewById<android.view.View>(android.R.id.content).setOnClickListener {
            finish()
        }
    }
}