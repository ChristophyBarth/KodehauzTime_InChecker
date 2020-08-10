package com.example.kodehauztime_inchecker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun signIn(view: View) {
        val getName: EditText = findViewById(R.id.editName)
        val getDept: EditText = findViewById(R.id.editDept)
        val male: RadioButton = findViewById(R.id.male)
        val female: RadioButton = findViewById(R.id.female)

        val info = Bundle()

        info.putString("name", (getName.text).toString())
        info.putString("dept", (getDept.text).toString())

        val intent  = Intent(this@MainActivity, MainActivity2::class.java)


        if (!male.isChecked && !female.isChecked) {
            Toast.makeText(this, "Select Your Gender", Toast.LENGTH_SHORT).show()

        } else if (male.isChecked){
            info.putString("gender", "male")

        } else if (female.isChecked){
            info.putString("gender", "female")
        }


        val i = intent.putExtras(info)
        startActivity(i)

    }


}