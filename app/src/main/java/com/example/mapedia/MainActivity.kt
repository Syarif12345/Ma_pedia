package com.example.mapedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var login = findViewById<View>(R.id.buttonback) as Button

        var aboutus = findViewById<View>(R.id.button3) as Button
        var help = findViewById<View>(R.id.button6) as Button

            login.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
        }
            aboutus.setOnClickListener {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }

            help.setOnClickListener {
                val intent = Intent(this, HelpActivity::class.java)
                startActivity(intent)
            }
        login = findViewById<Button>(R.id.buttonback)
        login.setBackgroundColor(resources.getColor(R.color.white))

        aboutus = findViewById<Button>(R.id.button3)
        aboutus.setBackgroundColor(resources.getColor(R.color.white))

        help = findViewById<Button>(R.id.button6)
        help.setBackgroundColor(resources.getColor(R.color.white))

    }
}