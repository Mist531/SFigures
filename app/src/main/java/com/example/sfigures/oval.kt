package com.example.sfigures

import android.content.Intent
import kotlin.math.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.lang.Exception

class oval : AppCompatActivity() {
    val p = 3.14
    var krug_radius: EditText? = null
    var krug_diametr: EditText? = null
    var krug_dlinaokr: EditText? = null
    var stroka: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oval)
        krug_radius = findViewById(R.id.krug_radius)
        krug_diametr = findViewById(R.id.krug_diametr)
        krug_dlinaokr = findViewById(R.id.krug_dlinaokr)
        stroka = ""
    }
    fun back(view: View) {
        finish()
    }
    fun dalee(view: View) {
        try {
            if ((krug_radius?.text?.length != 0) or (krug_diametr?.text?.length != 0) or (krug_dlinaokr?.text?.length != 0)) {
                if (krug_radius?.text?.length != 0) {
                    var num: Float = krug_radius?.text.toString().toFloat()
                    stroka = stroka + "R=" + num + " => S=${num * num * p}\n"
                }
                if (krug_diametr?.text?.length != 0) {
                    var num1: Float = krug_diametr?.text.toString().toFloat()
                    stroka = stroka + "d=" + num1 + " => S=${((num1 * num1) / 4) * p}\n"
                }
                if (krug_dlinaokr?.text?.length != 0) {
                    var num2: Float = krug_dlinaokr?.text.toString().toFloat()
                    stroka = stroka + "C=" + num2 + " => S=${(num2 * num2) / (4 * p)}\n"

                }
                if (stroka != "") {
                    Toast.makeText(this, ""+stroka, Toast.LENGTH_SHORT).show()
                    stroka =""
                }
            }
            else {
                Toast.makeText(this, "Введите данные", Toast.LENGTH_LONG).show()
            }
        }
        catch(e: Exception){
            Toast.makeText(this, "Введины невозможные числа", Toast.LENGTH_SHORT).show()
            if (stroka != "") {
                stroka =""
            }
        }
    }
}