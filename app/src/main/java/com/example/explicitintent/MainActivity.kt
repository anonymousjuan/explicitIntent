package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val launchSecondActivityButton = findViewById<View>(R.id.launchSecondActivityButton)
        val checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        val checkbox2 = findViewById<CheckBox>(R.id.checkbox2)

        launchSecondActivityButton.setOnClickListener {


            val intent = Intent(this, SecondActivity::class.java)
            val dataToSend = ArrayList<String>()

            if(checkbox1.isChecked){
                dataToSend.add("One Cup rice")
            }
            if (checkbox2.isChecked){
                dataToSend.add("Adobo")
            }
            intent.putStringArrayListExtra("key",dataToSend)
            startActivity(intent)
        }
    }
}