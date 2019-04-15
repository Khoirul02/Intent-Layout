package com.huda.intent_layout_2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_linear.setOnClickListener {
            startActivity(Intent(this, Linear::class.java))
        }
        btn_relative.setOnClickListener {
            startActivity(Intent(this, Relative::class.java))
        }
        btn_constraint.setOnClickListener {
            startActivity(Intent(this,Constraint::class.java))
        }
    }
}
