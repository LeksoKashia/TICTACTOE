package com.example.tictactoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.security.KeyStore

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private  lateinit var button1: Button
    private  lateinit var button2: Button
    private  lateinit var button3: Button
    private  lateinit var button4: Button
    private  lateinit var button5: Button
    private  lateinit var button6: Button
    private  lateinit var button7: Button
    private  lateinit var button8: Button
    private  lateinit var button9: Button
    private lateinit var P1: TextView
    private lateinit var P2: TextView
    private lateinit var RefreshButton: Button
    private lateinit var ResetButton: Button
    private var P1Points = 0
    private var P2Points = 0

    private var activePlayer=1
    private var firstPlayer=ArrayList<Int>()
    private var secondPlayer=ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        refreshGameTap()
        resetGameTap()


    }

    override fun onClick(ClickedVIew: View?) {
        RefreshButton = findViewById(R.id.RefreshButton)
        RefreshButton.setOnClickListener{ refreshGameTap()}
        ResetButton = findViewById(R.id.ResetButton)
        ResetButton.setOnClickListener{resetGameTap()}
        P1 = findViewById(R.id.P1)
        P2 = findViewById(R.id.P2)
        P1.text = P1Points.toString()
        P2.text = P2Points.toString()


        if(ClickedVIew is Button){
            var buttonNumber=0
            when(ClickedVIew.id){
                R.id. button1 -> buttonNumber=1
                R.id. button2 -> buttonNumber=2
                R.id. button3 -> buttonNumber=3
                R.id. button4 -> buttonNumber=4
                R.id. button5 -> buttonNumber=5
                R.id. button6 -> buttonNumber=6
                R.id. button7 -> buttonNumber=7
                R.id. button8 -> buttonNumber=8
                R.id. button9 -> buttonNumber=9

            }
            if (buttonNumber != 0){
                playGame(ClickedVIew , buttonNumber)


            }

        }

    }

    private fun playGame(clickedVIew: Button, buttonNumber: Int) {
        if(activePlayer == 1){
            clickedVIew.text="X"
            clickedVIew.setBackgroundColor(Color.GREEN)
            activePlayer=2
            firstPlayer.add(buttonNumber)

        }else{
            clickedVIew.text="0"
            clickedVIew.setBackgroundColor((Color.CYAN))
            activePlayer=1
            secondPlayer.add(buttonNumber)

        }
        clickedVIew.isEnabled = false
        var winnerPlayer = 0

        if(firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)   ){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)   ){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)   ){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)   ){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)   ){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)   ){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)   ){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)   ){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)   ){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)   ){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)   ){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)   ){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)   ){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)   ){
            winnerPlayer = 2

        }
        if(firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)   ){
            winnerPlayer = 1

        }
        if(secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)   ){
            winnerPlayer = 2

        }
        if (winnerPlayer == 1){
            Toast.makeText(this, "first player won the game", Toast.LENGTH_SHORT).show()
            button1.isEnabled = false
            button2.isEnabled = false
            button3.isEnabled = false
            button4.isEnabled = false
            button5.isEnabled = false
            button6.isEnabled = false
            button7.isEnabled = false
            button8.isEnabled = false
            button9.isEnabled = false
        }
          if(winnerPlayer == 2) {
            Toast.makeText(this, "second player won the game", Toast.LENGTH_SHORT).show()
              button1.isEnabled = false
              button2.isEnabled = false
              button3.isEnabled = false
              button4.isEnabled = false
              button5.isEnabled = false
              button6.isEnabled = false
              button7.isEnabled = false
              button8.isEnabled = false
              button9.isEnabled = false
        }


        if (winnerPlayer == 1 ){
            P1Points++
        }
        if( winnerPlayer == 2){
            P2Points++

        }
        if(winnerPlayer != 0){
            P1.text = P1Points.toString()
            P2.text = P2Points.toString()
        }








    }

    fun refreshGameTap(){
        activePlayer = 1
        firstPlayer.clear()
        secondPlayer.clear()
        button1.isEnabled =true
        button2.isEnabled =true
        button3.isEnabled =true
        button4.isEnabled =true
        button5.isEnabled =true
        button6.isEnabled =true
        button7.isEnabled =true
        button8.isEnabled =true
        button9.isEnabled =true
        button1.text=""
        button2.text=""
        button3.text=""
        button4.text=""
        button5.text=""
        button6.text=""
        button7.text=""
        button8.text=""
        button9.text=""
        button1.setBackgroundColor(Color.YELLOW)
        button2.setBackgroundColor(Color.YELLOW)
        button3.setBackgroundColor(Color.YELLOW)
        button4.setBackgroundColor(Color.YELLOW)
        button5.setBackgroundColor(Color.YELLOW)
        button6.setBackgroundColor(Color.YELLOW)
        button7.setBackgroundColor(Color.YELLOW)
        button8.setBackgroundColor(Color.YELLOW)
        button9.setBackgroundColor(Color.YELLOW)








    }
    fun resetGameTap(){
        activePlayer = 1
        P1Points=0
        P2Points=0
        firstPlayer.clear()
        secondPlayer.clear()
        button1.isEnabled =true
        button2.isEnabled =true
        button3.isEnabled =true
        button4.isEnabled =true
        button5.isEnabled =true
        button6.isEnabled =true
        button7.isEnabled =true
        button8.isEnabled =true
        button9.isEnabled =true
        button1.text=""
        button2.text=""
        button3.text=""
        button4.text=""
        button5.text=""
        button6.text=""
        button7.text=""
        button8.text=""
        button9.text=""
        button1.setBackgroundColor(Color.YELLOW)
        button2.setBackgroundColor(Color.YELLOW)
        button3.setBackgroundColor(Color.YELLOW)
        button4.setBackgroundColor(Color.YELLOW)
        button5.setBackgroundColor(Color.YELLOW)
        button6.setBackgroundColor(Color.YELLOW)
        button7.setBackgroundColor(Color.YELLOW)
        button8.setBackgroundColor(Color.YELLOW)
        button9.setBackgroundColor(Color.YELLOW)

    }




    private fun init(){

            button1 =findViewById(R.id.button1)
            button2 =findViewById(R.id.button2)
            button3 =findViewById(R.id.button3)
            button4 =findViewById(R.id.button4)
            button5 =findViewById(R.id.button5)
            button6 =findViewById(R.id.button6)
            button7 =findViewById(R.id.button7)
            button8 =findViewById(R.id.button8)
            button9 =findViewById(R.id.button9)

            button1.setOnClickListener(this)
            button2.setOnClickListener(this)
            button3.setOnClickListener(this)
            button4.setOnClickListener(this)
            button5.setOnClickListener(this)
            button6.setOnClickListener(this)
            button7.setOnClickListener(this)
            button8.setOnClickListener(this)
            button9.setOnClickListener(this)



    }
}