package com.example.activityregistrysample

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val launcher = registerForActivityResult(StartActivityForResult()) { result ->
        Toast.makeText(
            this,
            "${result.resultCode} ${result.data?.extras?.get("key1")}",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(null)//<<--------- set savedInstanceState to works

        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textView).setOnClickListener {
            launcher.launch(Intent(this, MainActivity2::class.java))
        }
    }
}
