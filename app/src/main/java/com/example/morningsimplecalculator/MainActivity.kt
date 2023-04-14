package com.example.morningsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mAnswer:TextView
    lateinit var mFnum: EditText
    lateinit var mSnum: EditText
    lateinit var mAdd: Button
    lateinit var mSub: Button
    lateinit var mDiv: Button
    lateinit var mMul: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer=findViewById(R.id.mTvAnswer)
        mFnum=findViewById(R.id.mEdtFnum)
        mSnum=findViewById(R.id.mEdtSnum)
        mAdd=findViewById(R.id.mBtnAdd)
        mSub=findViewById(R.id.mBtnSub)
        mMul=findViewById(R.id.mBtnMul)
        mDiv=findViewById(R.id.mBtnDiv)
        // set on-click listeners to all the buttons
        mAdd.setOnClickListener {
            //receive the first and second numbers to compute
            var firstNumber=mFnum.text.toString().trim()
            var secondNumber=mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Error.Please enter valid numbers!"
            }else{
                //proceed to compute the values
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }

        }
        mSub.setOnClickListener{
            //receive the first and second numbers to compute
            var firstNumber=mFnum.text.toString().trim()
            var secondNumber=mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Error.Please enter valid numbers!"
            }else{
                //proceed to compute the values
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            //receive the first and second numbers to compute
            var firstNumber=mFnum.text.toString().trim()
            var secondNumber=mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Error.Please enter valid numbers!"
            }else{
                //proceed to compute the values
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            //receive the first and second numbers to compute
            var firstNumber=mFnum.text.toString().trim()
            var secondNumber=mSnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Error.Please enter valid numbers!"
            }else{
                //proceed to compute the values
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }


    }
}