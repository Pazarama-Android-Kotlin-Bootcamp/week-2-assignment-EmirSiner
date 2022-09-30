package com.example.pazaramaweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.ActionBar

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val btnBack=findViewById<ImageButton>(R.id.suBack)

        btnBack.setOnClickListener {
            onBackPressed()
        }


    }

}


