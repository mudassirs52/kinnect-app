package com.mudassiryaseen.i230017

import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        findViewById<android.widget.TextView>(R.id.btnBack).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val rbFemale = findViewById<RadioButton>(R.id.rbFemale)
        val rbMale = findViewById<RadioButton>(R.id.rbMale)
        val rbCustom = findViewById<RadioButton>(R.id.rbCustom)
        val genderOptions = listOf(rbFemale, rbMale, rbCustom)

        genderOptions.forEach { selected ->
            selected.setOnClickListener {
                genderOptions.forEach { option ->
                    if (option == selected) {
                        option.setBackgroundResource(R.drawable.bg_input_selected)
                        option.setTextColor(getColor(R.color.teal))
                    } else {
                        option.setBackgroundResource(R.drawable.bg_input)
                        option.setTextColor(getColor(R.color.ink))
                    }
                }
            }
        }
    }
}