package com.example.kodehauztime_inchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        val name = bundle!!.getCharSequence("name")
        val dept = bundle.getCharSequence("dept")
        val gen = bundle.getCharSequence("gender")

        val date = SimpleDateFormat("dd/m/yyyy hh:mm:ss", Locale.ENGLISH)
        val moment = date.format(Date())

        val welcome : TextView = findViewById(R.id.welcome)
        val welcomeMsg = "Hello $name, Welcome.\nKindly locate the $dept department\nName:$name\nDepartment:$dept\nGender:$gen\nTime In:$moment"
        welcome.text = welcomeMsg


    }
}