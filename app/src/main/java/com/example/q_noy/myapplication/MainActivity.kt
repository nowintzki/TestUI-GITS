package com.example.q_noy.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity(){

    private lateinit var lst : ListView

    var fruitname = arrayOf("CAU", "MANGGA", "APEL", "KADU", "MELON", "GANAS")

    var desc = arrayOf("Ini teh Cau", "Ini teh Mangga", "Ini teh Apel", "Ini teh Kadu", "Ini teh Melon", "Ini teh Ganas")

    var imgid = arrayOf<Int>(R.drawable.banana, R.drawable.mango,R.drawable.mango, R.drawable.apple, R.drawable.durian, R.drawable.melon, R.drawable.pineapple)

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lst = findViewById<ListView>(R.id.list1)

        val customListview = CustomListview(this, fruitname, desc, imgid)

        lst.adapter = customListview
    }


}