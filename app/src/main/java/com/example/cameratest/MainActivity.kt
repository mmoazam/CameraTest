package com.example.cameratest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStartCamera = findViewById<Button>(R.id.buttonStartCamera)

        buttonStartCamera.setOnClickListener {
            intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

    } // end of onCreate

} // end of class