package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.translation.Translator
import android.widget.Button
import android.widget.TextView
import androidx.core.view.marginBottom

class MainActivity : AppCompatActivity() {
    lateinit var  button: Button
    lateinit var button2 : Button
    lateinit var textView: TextView
    var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        textView = findViewById(R.id.textView)
        textView.setText("$num")
        button.setOnClickListener (){
               subtract() }
        button2.setOnClickListener (){
               add() }

    }

    fun add(){
        num++
        textView.setText("$num")
        coloring()
        yTranslation()}
    fun subtract(){
        num--
        textView.setText("$num")
        coloring()
        yTranslation()}

    fun coloring(){
        val green = Color.argb(255, 36, 143, 36)
        val red = Color.argb(255, 179, 0, 0)
        val black = Color.argb(255, 0, 0, 0)
        when {num>0 ->  textView.setTextColor(green)
              num<0 -> textView.setTextColor(red)
              num==0 -> textView.setTextColor(black)}
    }
    fun yTranslation(){
        textView.setY(750f)
        when {num>0 ->  textView.setY(600f)
              num<0 -> textView.setY(900f) }

    }

}

