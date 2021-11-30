package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            if (validation()) {
                startActivity(Intent(this, MainActivity2::class.java))
            }
        }

        check()
    }

    fun validation(): Boolean {
        var value = true
        if (tttt1.text.isEmpty() || !hhhh1.isChecked) {
            color(1)
            value = false
        }
        if (tttt2.text.isEmpty() || !hhhh2.isChecked) {
            color(2)
            value = false
        }
        if (tttt3.text.isEmpty() || !hhhh3.isChecked) {
            color(3)
            value = false
        }
        if (tttt4.text.isEmpty() || !hhhh4.isChecked) {
            color(4)
            value = false
        }
        return value
    }

    fun color(string: Int) {
        Toast.makeText(this, "Заполните поля", Toast.LENGTH_LONG).show()
        if (string > 0) {
            Toast.makeText(this, "Красный", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Серый", Toast.LENGTH_LONG).show()
        }
    }

    fun check(){
        hhhh1.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                tttt1.visibility = View.VISIBLE
            }else{
                tttt1.visibility = View.GONE
            }
        }

        hhhh2.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                tttt2.visibility = View.VISIBLE
            }else{
                tttt2.visibility = View.GONE
            }
        }

        hhhh3.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                tttt3.visibility = View.VISIBLE
            }else{
                tttt3.visibility = View.GONE
            }
        }

        hhhh4.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                tttt4.visibility = View.VISIBLE
            }else{
                tttt4.visibility = View.GONE
            }
        }
    }
}