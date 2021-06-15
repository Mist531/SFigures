package com.example.sfigures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.lang.Exception

class kvadrat : AppCompatActivity() {
    var kvadrat_storonakv: EditText? = null
    var kvadrat_diagonal: EditText? = null
    var stroka: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kvadrat)
        kvadrat_storonakv = findViewById(R.id.kvadrat_storonakv)
        kvadrat_diagonal = findViewById(R.id.kvadrat_diagonal)
        stroka = ""
    }
    fun back(view: View) {
        startActivity(Intent(this, Main::class.java))
    }
    fun dalee(view: View) {
        try{
        if ((kvadrat_storonakv?.text?.length != 0) or (kvadrat_diagonal?.text?.length != 0)) {
            if (kvadrat_storonakv?.text?.length != 0) {
                var num: Float = kvadrat_storonakv?.text.toString().toFloat()
                stroka = stroka + "a=" + num + " => S=${num * num}\n"
            }
            if (kvadrat_diagonal?.text?.length != 0) {
                var num1: Float = kvadrat_diagonal?.text.toString().toFloat()
                stroka = stroka + "d=" + num1 + " => S=${num1 * num1 * 0.5}\n"
            }
            if (stroka != "") {
                Toast.makeText(this, ""+stroka, Toast.LENGTH_SHORT).show()
                stroka =""
            }
        }
        else {
            Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show()
        }}
        catch(e: Exception){
            Toast.makeText(this, "Введины невозможные числа", Toast.LENGTH_SHORT).show()
            if (stroka != "") {
                stroka =""
            }
        }
    }
}