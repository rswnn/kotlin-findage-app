package com.riswan.startup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnFindAge.setOnClickListener {
//            // cari ketika button di click
//            val yearOfBirth:Int = txtYearOfBirth.text.toString()!!.toInt()
//            var currentYear = Calendar.getInstance().get(Calendar.YEAR)
//            val myAge = currentYear - yearOfBirth
//
//            tvShowAge.text = "Your age is $myAge years"
//        }

    }
    fun buFindAgeEvent(view: View) {
            val userDOB:String =etDOB.text.toString()
//            val yearOfBirth:Int = txtYearOfBirth.text.toString()!!.toInt()

            if (userDOB.toInt() == 0) {
                tvShowAge.text = "Invalid Input"
                return
            }
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = currentYear - userDOB.toLong()
            val avg = myAge / userDOB.toInt()

            tvShowAge.text = "Your age is $myAge years"
    }
}
