package com.example.codeforces

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val profile = findViewById<Button>(R.id.profile)
        val contest = findViewById<Button>(R.id.Contest)
        val home = findViewById<Button>(R.id.Home)
        profile.setOnClickListener{
            intent= Intent(applicationContext,Profile::class.java)
            startActivity(intent)
        }
        contest.setOnClickListener{
            intent =Intent(applicationContext,Contest::class.java)
            startActivity(intent)
        }
        home.setOnClickListener {
            intent = Intent(applicationContext,Home::class.java)
        }
    }

}