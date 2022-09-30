package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Countries>
    lateinit var imageId:Array<Int>
    lateinit var countriesNames:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId= arrayOf(
           R.drawable.egypt,
           R.drawable.bahrain,
           R.drawable.jordan,
           R.drawable.kuwait,
           R.drawable.soudia,
           R.drawable.emarat,
           R.drawable.brazil,
           R.drawable.austrailia,
           R.drawable.mexico,

        )
        countriesNames= arrayOf("Egypt","Bahrain","Jordan","Kuwait","Saudi Arabia","United Arab Emirates","Iraq","Brazil","Australia","Mexico")
        newRecyclerView=findViewById(R.id.recycler_view)
        newRecyclerView.layoutManager=LinearLayoutManager(this)
       newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<Countries>(


        )
        getCountry()

       // var myAdapter=ArrayAdapter<String>(this,R.layout.activity_main,countriesNames)


    }
    private fun  getCountry(){
        for (i in imageId.indices){
            val countries=Countries(imageId[i],countriesNames[i])
            newArrayList.add(countries)
        }
        newRecyclerView.adapter=MyAdapter(newArrayList)
    }
}