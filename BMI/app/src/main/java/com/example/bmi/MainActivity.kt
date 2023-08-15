package com.example.bmi

import com.example.bmi.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener{
        var weight =binding.Weight.text.toString()
        var height=binding.Height.text.toString()
        if(weight==null || height==null)
        {
            Toast.makeText(applicationContext,"Fill In The Entries", Toast.LENGTH_SHORT).show()
        }
        }
    }
}