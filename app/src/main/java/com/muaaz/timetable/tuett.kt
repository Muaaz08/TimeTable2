package com.muaaz.timetable

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.muaaz.timetable.R.id.recyclerView01
import kotlinx.android.synthetic.main.tt_tue.*

class tuett : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tt_tue)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView01.layoutManager = layoutManager

        val adapter01 = HobbiesAdapter01(this, Supplier.hobbies01)
        recyclerView01.adapter = adapter01
    }
}