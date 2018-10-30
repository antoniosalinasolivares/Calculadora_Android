package com.proteco.yonosoytony.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var state = 0
        var num1 = 0
        var num2 = 0
        btn_cero.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "0"
        }
        btn_uno.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "1"
        }
        btn_dos.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "2"
        }
        btn_tres.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "3"
        }
        btn_cuatro.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "4"
        }
        btn_cinco.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "5"
        }
        btn_seis.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "6"
        }
        btn_siete.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "7"
        }
        btn_ocho.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "8"
        }
        btn_nueve.setOnClickListener {
            tv_screen.text = tv_screen.text.toString() + "9"
        }
        btn_mas.setOnClickListener {
            state = 1
            if (tv_screen.text.toString().isNotEmpty()) {
                num1 = Integer.parseInt(tv_screen.text.toString())
                tv_screen.text = ""
            }
        }
        btn_menos.setOnClickListener {
            state = 2
            if (tv_screen.text.toString().isNotEmpty()) {
                num1 = Integer.parseInt(tv_screen.text.toString())
                tv_screen.text = ""
            }
        }
        btn_multiplicacion.setOnClickListener {
            state = 3
            if (tv_screen.text.toString().isNotEmpty()) {
                num1 = Integer.parseInt(tv_screen.text.toString())
                tv_screen.text = ""
            }
        }
        btn_division.setOnClickListener {
            state = 4
            if (tv_screen.text.toString().isNotEmpty()) {
                num1 = Integer.parseInt(tv_screen.text.toString())
                tv_screen.text = ""
            }
        }
        btn_igual.setOnClickListener {
            if (tv_screen.text.toString().isNotEmpty()) {
                num2 = Integer.parseInt(tv_screen.text.toString())
            }
            when (state){
                1-> tv_screen.text = (num1+num2).toString()
                2-> tv_screen.text = (num1-num2).toString()
                3-> tv_screen.text = (num1*num2).toString()
                4-> tv_screen.text = (num1/num2).toString()
                else-> Toast(this).show()
            }
            state = 0
            num1 = 0
            num2 = 0
        }
        btn_reset.setOnClickListener {
            state = 0
            num1 = 0
            num2 = 0
            tv_screen.text=""
        }
    }


}
