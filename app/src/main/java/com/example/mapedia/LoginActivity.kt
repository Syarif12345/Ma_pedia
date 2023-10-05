package com.example.mapedia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvForgotPassword: TextView
    private lateinit var tvRegister: TextView

    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activty)

        edtEmail = findViewById(R.id.edt_email_login)
        edtPassword = findViewById(R.id.edt_password_login)
        btnLogin = findViewById(R.id.btn_login)
        tvForgotPassword = findViewById(R.id.forgot_password)
        tvRegister = findViewById(R.id.tv_to_register)
        val btnRegister: Button = findViewById(R.id.btnRegister)
        val tvToRegister: TextView = findViewById(R.id.tv_to_register)


        databaseHelper = DatabaseHelper(this)



        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            val user = databaseHelper.getUser(email)

            if (user != null && user.password == password) {
                navigateToStoryList()
            } else {
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegister.setOnClickListener {
            navigateToRegister()
        }

        tvToRegister.setOnClickListener {
            navigateToRegister()
        }

        tvForgotPassword.setOnClickListener {
            // Implementasi aksi saat klik Forgot Password
        }
    }

    private fun navigateToRegister() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToStoryList() {
        val intent = Intent(this, StorylistActivity::class.java)
        startActivity(intent)
        finish()
    }
}
