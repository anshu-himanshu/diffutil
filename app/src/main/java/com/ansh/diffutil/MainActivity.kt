package com.ansh.diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val recyclerView = findViewById<RecyclerView>(R.id.rvProgrammingList)
        val adapter = ProgrammingAdapter()


        val p1 = ProgrammingItem(1,"J","Java")
        val p2 =ProgrammingItem(2,"K","Kotlin")
        val p3 = ProgrammingItem(3,"A","Android")

        adapter.submitList(listOf(p1,p2,p3))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

    }
}