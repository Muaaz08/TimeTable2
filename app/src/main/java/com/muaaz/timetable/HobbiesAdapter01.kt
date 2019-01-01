package com.muaaz.timetable

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter01(val context: Context, val hobbies01 : List<Hobby01>) : RecyclerView.Adapter<HobbiesAdapter01.MyViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,  parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies01.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby01 = hobbies01[position]
        holder.setData(hobby01 ,position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun setData(hobby01: Hobby01?, pos: Int){
            itemView.txvTitle.text = hobby01!!.title


        }
    }
}