package com.example.counter_app

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counter_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var timesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.add.text = "+"
        binding.subtract.text = "-"
        //functions that control the number text
        add()
        subtract()
        reset()

    }

    private fun add()
    {
        //Adding changing numbers display + 1
        binding.add.setOnClickListener {
            timesClicked += 1
            binding.number.text = timesClicked.toString()
        }
    }

    private fun subtract()
    {
        //Subtracts, changing numbers display -1 if greater than zero
        binding.subtract.setOnClickListener {
            if (timesClicked > 0) {
                timesClicked -= 1
            }
            binding.number.text = timesClicked.toString()

        }
    }

    private fun reset()
    {
        //Resets the click counter variable
        binding.reset.setOnClickListener {
            timesClicked = 0
            binding.number.text = timesClicked.toString()
        }
    }

}