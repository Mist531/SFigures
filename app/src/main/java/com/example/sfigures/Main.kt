package com.example.sfigures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun kvadrat(view: View) {
        startActivity(Intent(this, kvadrat::class.java))
    }
    fun pramougol(view: View) {
        startActivity(Intent(this, priamougol::class.java))
    }
    fun krug(view: View) {
        startActivity(Intent(this, oval::class.java))
    }
    fun info(view: View) {
        startActivity(Intent(this, info::class.java))
    }
}