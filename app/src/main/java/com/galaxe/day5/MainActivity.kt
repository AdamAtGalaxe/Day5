package com.galaxe.day5

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var userName: EditText
    lateinit var password: EditText
    lateinit var web: Button
    lateinit var dial: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById(R.id.user)
        password = findViewById(R.id.pass)
        web = findViewById(R.id.web)
        dial = findViewById(R.id.dialer)
        web.setOnClickListener(View.OnClickListener {

            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent)

        })
        dial.setOnClickListener(View.OnClickListener {
            intent = Intent(Intent.ACTION_DIAL, Uri.parse( "tel:8455878182"))
            startActivity(intent)
        })
    }
    fun login(v: View){
        intent = Intent(this, new_page::class.java )
        intent.putExtra("fname", userName.text.toString())
        intent.putExtra("pass", password.text.toString())
        startActivity(intent)
    }


}

/*
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Start", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Resume", Toast.LENGTH_LONG).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Pause", Toast.LENGTH_LONG).show()

    }

    override fun onRestart() {

        super.onRestart()
        Toast.makeText(this, "Restart", Toast.LENGTH_LONG).show()

    }

    override fun onDestroy() {
        Toast.makeText(this, "Destroy", Toast.LENGTH_LONG).show()
        super.onDestroy()


    }
 */