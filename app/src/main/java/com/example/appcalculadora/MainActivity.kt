package com.example.appcalculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BTN_Resultado.setOnClickListener(){

 BTN_IMC.text=calcularImc(edt_Peso.text.toString().toDouble(),edt_Altura.text.toString().toDouble()).toString()

        }


    }

    private fun calcularImc(peso: Double=edt_Peso.text.toString().toDouble(), altura: Double=edt_Altura.text.toString().toDouble()): String {

        return String.format("%.2f",peso/(altura*altura))

    }
}