package com.example.imageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    private lateinit var backclick : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        backclick = findViewById(R.id.backid)

        backclick.setOnClickListener{
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
 ""   }
}