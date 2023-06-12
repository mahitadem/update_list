package com.jiad.updatedindex

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var now:Context,var resources:Int,var items:List<model>):ArrayAdapter<model>(now,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater:LayoutInflater=LayoutInflater.from(now)
        val view:View=layoutInflater.inflate(resources,null)

        val imageview:ImageView=view.findViewById(R.id.image)
        val tittle:TextView=view.findViewById(R.id.Tittle)
        val descrip:TextView=view.findViewById(R.id.Tittle2)

        var mitems:model=items[position]

        imageview.setImageDrawable(now.resources.getDrawable(mitems.img))
        tittle.text=mitems.tittle
        descrip.text=mitems.Description

        return view

    }


}