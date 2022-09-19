package com.sample.translator

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.free.translator.OnTranslationResult
import com.free.translator.Translator

class MainActivity : AppCompatActivity() {

    lateinit var textview : AppCompatTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById(R.id.text)
        Translator.startTranslation("en", "ur", getText(), object : OnTranslationResult {
            override fun onSuccess(text: String) {
                textview.text = text

            }
            override fun onFailure() {
                Toast.makeText(this@MainActivity, "Failure", Toast.LENGTH_SHORT).show()
            }
        })

    }

    fun getText(): String{
        return getString(R.string.temp_text)
    }
}