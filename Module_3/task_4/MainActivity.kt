package com.example.kotlin_assignment

import android.content.Intent
import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btn1.setOnClickListener {

            var name = binding.edtName.text


            var i  = Intent(this,MainActivity2::class.java)
            i.putExtra("names",name)
            startActivity(i)
        }

    }
}