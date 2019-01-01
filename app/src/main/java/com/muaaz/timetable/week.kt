package com.muaaz.timetable

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_week.*

class week : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week)

        ivmon.setOnClickListener(){

            val intent1 = Intent (this, montt::class.java)
            startActivity(intent1)
        }

        ivtue.setOnClickListener(){

            val intent2 = Intent (this, tuett::class.java)
            startActivity(intent2)
        }

        ivwed.setOnClickListener(){

            val intent3 = Intent (this, wedtt::class.java)
            startActivity(intent3)
        }

        ivthu.setOnClickListener(){

            val intent4 = Intent (this, thutt::class.java)
            startActivity(intent4)
        }

        ivfri.setOnClickListener(){

            val intent5 = Intent (this, fritt::class.java)
            startActivity(intent5)
        }

        ivsat.setOnClickListener(){

            val intent6 = Intent (this, sattt::class.java)
            startActivity(intent6)
        }
    }
}