package com.mtrcmp.fuelcalcylator

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private  var arrayCarSupply = ArrayList<CarSupply>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(my_toolbar)
        listView = findViewById(R.id.listaAbastecida)

        buttonIncluir.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {

            var carSupply = CarSupply(
                data!!.getDoubleExtra("price", 0.0),
                data.getDoubleExtra("km", 0.0),
                data.getDoubleExtra("liters", 0.0)
            )

            arrayCarSupply.add(carSupply)
            val adapter = ListAdapterCarSupply(this, arrayCarSupply)
            listView.setAdapter(adapter)


        }

    }
}
