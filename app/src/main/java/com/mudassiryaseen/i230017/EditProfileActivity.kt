package com.mudassiryaseen.i230017

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        findViewById<android.widget.TextView>(R.id.btnCancel).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        findViewById<android.widget.TextView>(R.id.btnSave).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}