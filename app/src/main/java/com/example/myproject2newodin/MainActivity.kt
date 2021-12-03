package com.example.myproject2newodin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
////////\\\\\\\\
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
fun main() {
    for (i in 'а'..'я'){
        if (i.code % 2 == 0) print(i)
    }
}