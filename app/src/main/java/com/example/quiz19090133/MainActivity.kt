package com.example.quiz19090133

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val nim:Long = 19090133
    val nama:String = "Helina Putri"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener() {
            intent = Intent(this, detail::class.java)
            intent.putExtra("id_value", nim)
            intent.putExtra("language_value", nama)
            startActivity(intent)
        }
    }
}