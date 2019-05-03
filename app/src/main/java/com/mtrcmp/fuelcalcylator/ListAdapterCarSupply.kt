package com.mtrcmp.fuelcalcylator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.supply_list.view.*

import java.util.ArrayList

class ListAdapterCarSupply(context: Context, list: ArrayList<CarSupply>) :
    ArrayAdapter<CarSupply>(context, 0, list){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val carSupplyObject = this.getItem(position)
        val convertView =  LayoutInflater.from(this.context).inflate(R.layout.supply_list, null);

        convertView.kmperlitter.text = carSupplyObject.kmperliter().toString()

        return convertView

    }
}
