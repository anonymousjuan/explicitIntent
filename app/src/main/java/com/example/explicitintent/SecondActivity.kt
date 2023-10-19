package com.example.explicitintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val displayText : TextView = findViewById(R.id.displayTxt)

        val receivedItems = intent.getStringArrayListExtra("key")
        if (receivedItems != null && receivedItems.isNotEmpty()) {
            val itemsText = receivedItems.joinToString(", ")
            displayText.text = "Checked items: $itemsText"
        }
    }
}
