package com.mtrcmp.fuelcalcylator

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    private var resultIntent: Intent = Intent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun onClickSubmit(v: View) {
        var editPrice = price.text.toString()
        var editKm = kilometers.text.toString()
        var editLiters = liters.text.toString()
        var error = false

        if (editPrice.isEmpty()) {
            price.error = "Preço é obrigatório"
            error = true
        }

        if (editKm.isEmpty()) {
            kilometers.error ="KM rodados é obrigatório"
            error = true
        }

        if (editLiters.isEmpty()) {
            liters.error ="Litros abastecidos é obrigatório"
            error = true
        }

        if (!error) {
            //carro = CarSupply(editPrice.toDouble(),editKm.toDouble(),editLiters.toDouble())
            resultIntent.putExtra("km", editKm.toDouble())
            resultIntent.putExtra("liters", editLiters.toDouble())
            resultIntent.putExtra("price", editPrice.toDouble())
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}
