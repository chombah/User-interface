package com.example.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var btn_submit: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_submit=findViewById(R.id.btn_submit)
        btn_submit!!.setOnClickListener {
            val intent= Intent(this,FoodActivity::class.java)
            startActivity(intent)
        }
    }
}