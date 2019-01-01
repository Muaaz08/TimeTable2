package com.muaaz.timetable

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter05(val context: Context, val hobbies05 : List<Hobby05>) : RecyclerView.Adapter<HobbiesAdapter05.MyViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,  parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies05.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies05[position]
        holder.setData(hobby ,position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun setData(hobby: Hobby05?, pos: Int){
            itemView.txvTitle.text = hobby!!.title


        }
    }
}