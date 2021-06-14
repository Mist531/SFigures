package com.example.sfigures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class kvadrat : AppCompatActivity() {
    var kvadrat_storonakv: EditText? = null
    var kvadrat_diagonal: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kvadrat)
        kvadrat_storonakv = findViewById(R.id.kvadrat_storonakv)
        kvadrat_diagonal = findViewById(R.id.kvadrat_diagonal)
    }

    fun back(view: View) {
        startActivity(Intent(this, Main::class.java))
    }
    fun dalee(view: View) {
        if(kvadrat_storonakv?.text?.length != 0){
            var num: Float = try {
                kvadrat_storonakv?.text.toString().toFloat()
            } catch (e: Exception) {
                Toast.makeText(this, "Введите число (Поменяйте , на .)", Toast.LENGTH_SHORT).show()
                return
            }
            var a: Float = (num*num).toFloat()
            Toast.makeText(this, "S="+a, Toast.LENGTH_SHORT).show()
        }
        else{
            if(kvadrat_diagonal?.text?.length != 0){
                var num: Float = try {
                    kvadrat_diagonal?.text.toString().toFloat()
                } catch (e: Exception) {
                    Toast.makeText(this, "Введите число (Поменяйте , на .)", Toast.LENGTH_SHORT).show()
                    return
                }
                var a: Float = (num*num*0.5).toFloat()
                Toast.makeText(this, "S="+a, Toast.LENGTH_SHORT).show()
            }
            else{
                    Toast.makeText(this,"Введите данные", Toast.LENGTH_LONG).show()
                }
            }
        }
    }