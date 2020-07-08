package com.example.exercise1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPay.setOnClickListener {
            var msg : String = " Coffee "
            if (radCream.isChecked){
                msg += "& Cream"
            }
            if (radSugar.isChecked){
                msg += " & Sugaz"
            }
            Toast.makeText(getApplicationContext(),
                msg, Toast.LENGTH_SHORT).show()
            var radioId: Int = radioGroupCoffeeType.getCheckedRadioButtonId()
            if (radColombian.getId() == radioId){
                msg = "Colombian" + msg
            }
            if (radExpresso.isChecked){
                msg = "Expresso" + msg
            }
            if (radDecaf.isChecked){
                msg = "Decaf" + msg
            }
            Toast.makeText(getApplicationContext(), msg, 1).show()
        }


    }

}
