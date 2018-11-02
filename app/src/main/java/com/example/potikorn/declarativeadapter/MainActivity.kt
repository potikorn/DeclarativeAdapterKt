package com.example.potikorn.declarativeadapter

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.potikorn.declarativeadapter.multipletype.MultipleTypeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMenu1.setOnClickListener {
            startActivity(Intent(this, MultipleTypeActivity::class.java))
        }
    }
}
