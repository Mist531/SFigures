package com.example.sfigures

import android.content.Intent
import kotlin.math.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class oval : AppCompatActivity() {
    val p = 3.14
    var krug_radius: EditText? = null
    var krug_diametr: EditText? = null
    var krug_dlinaokr: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oval)
        krug_radius = findViewById(R.id.krug_radius)
        krug_diametr = findViewById(R.id.krug_diametr)
        krug_dlinaokr = findViewById(R.id.krug_dlinaokr)
    }

    fun back(view: View) {
        startActivity(Intent(this, Main::class.java))
    }
    fun dalee(view: View) {
        if(krug_radius?.text?.length != 0){
            var num: Float = try {
                krug_radius?.text.toString().toFloat()
            } catch (e: Exception) {
                Toast.makeText(this, "Введите число (Поменяйте , на .)", Toast.LENGTH_SHORT).show()
                return
            }
            var a: Float = (num*num*p).toFloat()
            Toast.makeText(this, "S="+a, Toast.LENGTH_SHORT).show()
        }
        else{
            if(krug_diametr?.text?.length != 0){
                var num: Float = try {
                    krug_diametr?.text.toString().toFloat()
                } catch (e: Exception) {
                    Toast.makeText(this, "Введите число (Поменяйте , на .)", Toast.LENGTH_SHORT).show()
                    return
                }
                var a: Float = (((num*num)/4)*p).toFloat()
                Toast.makeText(this, "S="+a, Toast.LENGTH_SHORT).show()
            }
            else{
                if(krug_dlinaokr?.text?.length != 0){
                    var num: Float = try {
                        krug_dlinaokr?.text.toString().toFloat()
                    } catch (e: Exception) {
                        Toast.makeText(this, "Введите число (Поменяйте , на .)", Toast.LENGTH_SHORT).show()
                        return
                    }
                    var a: Float = ((num*num)/(4*p)).toFloat()
                    Toast.makeText(this, "S="+a, Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Введите данные", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}