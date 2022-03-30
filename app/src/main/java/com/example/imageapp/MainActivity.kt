package com.example.imageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var btnclick : Button
    private lateinit var nextclick : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnclick = findViewById(R.id.btn_id)

        nextclick = findViewById(R.id.nextid)

        var pic = findViewById<View>(R.id.imageid) as ImageView

        nextclick.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnclick.setOnClickListener(){
            pic.setBackgroundResource(R.mipmap.imageb)

        }
        val arrayAdapter: ArrayAdapter<*>
        val items = arrayOf("Soviet Bear","Peacekeeper","Javelin","Imperial Warrior","Hammer Tank","Tsunami Raider")

        var mListView = findViewById<ListView>(R.id.Listid)
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,items)
        mListView.adapter = arrayAdapter
    }
}