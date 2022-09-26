package com.example.kotlin_assignment

import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnRed.setOnClickListener {
            binding.rlBg.setBackgroundResource(R.color.Red)
        }
        binding.btnGreen.setOnClickListener {
            binding.rlBg.setBackgroundResource(R.color.Green)
        }

        binding.btnBlue.setOnClickListener {
            binding.rlBg.setBackgroundResource(R.color.Blue)
        }

    }
}