package com.example.rectangles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.rectangles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit private var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetArea.setOnClickListener() {
            val length = binding.etLength.text.toString().toDouble()
            val width = binding.etWidth.text.toString().toDouble()

            val newRectangle = Rectangle(length, width)
            binding.tvArea.text = newRectangle.area.toString()
        }//end of click listener
    }
}