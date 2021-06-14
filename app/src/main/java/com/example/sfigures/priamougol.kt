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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_priamougol)
        priamougol_shirina= findViewById(R.id.priamougol_shirina)
        priamougol_dlina = findViewById(R.id.priamougol_dlina)
    }

    fun back(view: View) {
        startActivity(Intent(this, Main::class.java))
    }
    fun dalee(view: View) {
        if((priamougol_dlina?.text?.length != 0) and (priamougol_shirina?.text?.length != 0)){
            var num: Float = try {
                priamougol_dlina?.text.toString().toFloat()
            } catch (e: Exception) {
                Toast.makeText(this, "Введите число (Поменяйте , на .)", Toast.LENGTH_SHORT).show()
                return
            }
            var num1: Float = try {
                priamougol_shirina?.text.toString().toFloat()
            } catch (e: Exception) {
                Toast.makeText(this, "Введите число (Поменяйте , на .)", Toast.LENGTH_SHORT).show()
                return
            }
            var a: Float = (num*num1).toFloat()
            Toast.makeText(this, "S="+a, Toast.LENGTH_SHORT).show()
        }
        else{
            if((priamougol_dlina?.text?.length != 0) and (priamougol_shirina?.text?.length == 0)) {
                Toast.makeText(this, "Данных не хватает (Поменяйте , на .)", Toast.LENGTH_LONG).show()
            }
            else{
                if((priamougol_dlina?.text?.length == 0) and (priamougol_shirina?.text?.length != 0)) {
                    Toast.makeText(this, "Данных не хватает (Поменяйте , на .)", Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this, "Введите данные", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    }
