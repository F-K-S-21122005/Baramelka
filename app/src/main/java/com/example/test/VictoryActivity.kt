package com.example.test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

var vic:TextView?=null

class VictoryActivity : AppCompatActivity() {

    companion object{
        const val TOTAL_COUNT = "total count"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victory)

        vic = findViewById<TextView>(R.id.FinallyScore)
        ChangeText()
    }
    fun ChangeText(){
        val point = intent.getStringExtra(TOTAL_COUNT).toString()
        val cont = point.toInt()

        if (cont < 8) {
            vic!!.text = "Ваш результат ${point} из 17 \n" + "Стоит потренироватся еще!!"
        }
        else {
            vic!!.text = "Ваш результат ${point} из 17 \n" + "Молодец так держать!!"
        }
    }

}