package com.example.q_noy.myapplication

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomListview(private val context: Activity, private val fruitname: Array<String>, private val desc: Array<String>, private val imgid:Array<Int>) : ArrayAdapter<String>(context, R.layout.listview_layout, fruitname) {

    override fun getView(position:Int, convertView: View?, parent: ViewGroup):View {

        var r = convertView
        var viewHolder: ViewHolder

        if (r==null){

            val layoutInflater = context.layoutInflater

            r = layoutInflater.inflate(R.layout.listview_layout, null, true)
            viewHolder = ViewHolder(r!!)
            r.tag = viewHolder
        } else {
            viewHolder = r.tag as ViewHolder
        }
        viewHolder.ivw.setImageResource(imgid[position])
        viewHolder.tvw1.text = fruitname[position]
        viewHolder.tvw2.text = desc[position]

        return r
    }

    internal inner class ViewHolder(v: View){

        var tvw1:TextView
        var tvw2:TextView
        var ivw:ImageView

        init {

            tvw1 = v.findViewById(R.id.tvfruitname)
            tvw2 = v.findViewById(R.id.tvdescription)
            ivw = v.findViewById(R.id.imageView)
        }
    }
}