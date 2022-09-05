package com.sample.translator

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.free.translator.OnTranslationResult
import com.free.translator.Translator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Translator.startTranslation("en", "ar", "How are you", object : OnTranslationResult {
            override fun onSuccess(text: String) {
                Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
            }
            override fun onFailure() {
                Toast.makeText(this@MainActivity, "Failure", Toast.LENGTH_SHORT).show()
            }
        })

    }
}