package com.example.myproject1newodin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myproject2newodin.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val button: Button =findViewById(R.id.jump)
        button.setOnClickListener {
            /*val address = Uri.parse("https://www.google.ru/")
            val openlink = Intent(Intent.ACTION_VIEW, address)
            startActivity(openlink)*/
            intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
    }
}
}