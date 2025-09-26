package com.example.tictac

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class gameActivity : AppCompatActivity() {
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button

    var currentplayer: Int =1

    var scoreplayer1: Int = 0
    var scoreplayer2: Int =0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        initUi()

    }

    private fun initUi() {
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)

    }
    fun play(btn:View){
        val myBtn: Button = btn as Button
        if(myBtn.text.toString().isEmpty()){
            if(currentplayer == 1 ){
                myBtn.text = "⭐"
                currentplayer = 2
            }else{
                myBtn.text = "O"
                currentplayer = 1
            }
        }
    }
}


