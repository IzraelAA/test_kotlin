package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var input1 :Int? =0
    private var input2 :Int? =0
    private var input3 :Int? =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener {
            checked()

            tv_result.text = (input1!! + input2!! + input3!!).toString()
            clear()
        }
        less.setOnClickListener {
            clear()
            checked()
            if(!checkBox1.isChecked){
                input2 = input2!! * -1
            }
            tv_result.text = (input1!!-input2!!-input3!!).toString()
            d("msg", "onCreate: " +tv_result.text)
            clear()
        }
        multiplication.setOnClickListener {
            forMultiplication()
            checked()
            tv_result.text = (input1!!*input2!!*input3!!).toString()
            d("msg", "onCreate: " +tv_result.text)
            clear()
        }
        division.setOnClickListener {
            forMultiplication()
            checked()
            tv_result.text = (input1!!/input2!!/input3!!).toDouble().toString()
            d("msg", "onCreate: " +tv_result.text)
            clear()
        }

    }
    fun forMultiplication(){

        input1=1
        input2=1
        input3=1
    }
    fun checked(){
        if (checkBox1.isChecked && number_one.text.toString() != ""){
            input1 = number_one.text.toString().toInt()

        }
        if(checkBox2.isChecked && number_two.text.toString() != ""){
            input2 = number_two.text.toString().toInt()
        }
        if(checkBox3.isChecked && number_three.text.toString() != ""){
            input3 = number_three.text.toString().toInt()
        }

        d("msg", "1 onCreate: " +input1.toString())
        d("msg", "2 onCreate: " +input2.toString())
        d("msg", "3 onCreate: " +input2.toString())
    }
    fun clear(){
        input1=0
        input1=0
        input1=0
    }
}