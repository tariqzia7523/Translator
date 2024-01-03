package com.sample.translator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.widget.TextViewCompat
import com.free.translator.OnTranslationResult
import com.free.translator.Translator
import com.sample.translator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Translator.startTranslation("en", "ur", getText(), object : OnTranslationResult {
            override fun onSuccess(text: String) {
                binding.translatedTexView.text = text

            }
            override fun onFailure() {
                Toast.makeText(this@MainActivity, "Failure", Toast.LENGTH_SHORT).show()
            }
        })
    }
    fun getText(): String{
        return "Hy there! It is really nice to meet you."
    }
}