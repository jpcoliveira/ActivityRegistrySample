package com.example.activityregistrysample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        lifecycleScope.launch {
            delay(3000)
            val intent = Intent()
            intent.putExtra("key1", "value1")
            setResult(12345, intent)
            finish()
        }
    }
}