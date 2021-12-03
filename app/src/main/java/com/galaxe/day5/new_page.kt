package com.galaxe.day5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class new_page : AppCompatActivity() {

    lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_page)
//
        tv = findViewById(R.id.textView)
        var b: Bundle? = intent.extras
        var name = b?.get("fname")
        var pass = b?.get("pass")

        tv.setText("Your name is $name and pass is $pass")
//        var name =
    }
}