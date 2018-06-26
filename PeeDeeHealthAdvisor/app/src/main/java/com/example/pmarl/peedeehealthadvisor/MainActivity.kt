package com.example.pmarl.peedeehealthadvisor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val myHealthData = findViewById(R.id.MyHealthData) as Button

        // Set on-click listener
        myHealthData.setOnClickListener {
            //Handler Code
            val intent = Intent(this, MyHealthDataActivity::class.java)
            startActivity(intent)
        }

        val healthResources = findViewById(R.id.HealthResources) as Button

        healthResources.setOnClickListener{
            val intent = Intent(this, SearchServiceActivity::class.java)
            startActivity(intent)
        }
    }
}
