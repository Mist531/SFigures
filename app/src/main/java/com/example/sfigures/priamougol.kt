package com.example.sfigures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class priamougol : AppCompatActivity() {
    var priamougol_shirina: EditText? = null
    var priamougol_dlina: EditText? = null
    var stroka: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_priamougol)
        priamougol_shirina = findViewById(R.id.priamougol_shirina)
        priamougol_dlina = findViewById(R.id.priamougol_dlina)
        stroka = ""
    }

    fun back(view: View) {
        startActivity(Intent(this, Main::class.java))
    }

    fun dalee(view: View) {
        try {
            if ((priamougol_dlina?.text?.length != 0) and (priamougol_shirina?.text?.length != 0)) {
                var num: Float = priamougol_dlina?.text.toString().toFloat()
                var num1: Float = priamougol_shirina?.text.toString().toFloat()
                stroka = stroka + "a=" + num1 + " b=" + num +" =>\nS=${num * num1}\n"
                if (stroka != "") {
                    Toast.makeText(this, ""+stroka, Toast.LENGTH_SHORT).show()
                    stroka =""
                }
            } else {
                Toast.makeText(this, "Введите данные (нужно два числа)", Toast.LENGTH_LONG).show()
            }
        }
        catch (e: java.lang.Exception) {
            Toast.makeText(this, "Введины невозможные числа", Toast.LENGTH_SHORT).show()
            if (stroka != "") {
                stroka =""
            }
        }

    }
}
