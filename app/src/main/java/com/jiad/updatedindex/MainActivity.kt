package com.jiad.updatedindex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mylistview=findViewById<ListView>(R.id.mylist)
        var list= mutableListOf<model>()

        list.add(model("anime","This is animation 1",R.drawable.anime1))
        list.add(model("anime","This is animation 2",R.drawable.anime2))
        list.add(model("anime","This is animation 3",R.drawable.anime3))
        list.add(model("anime","This is animation 4",R.drawable.anime4))
        list.add(model("anime","This is animation 5",R.drawable.anime5))
        list.add(model("anime","This is animation 7",R.drawable.anime7))

        mylistview.adapter=MyAdapter(this,R.layout.row,list)

    }
}