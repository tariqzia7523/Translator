package com.free.translator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapterLanguageList(var context: Context, var data: ArrayList<LanguageModel>, var flag : Int) : RecyclerView.Adapter<MyAdapterLanguageList.MyViewHolder>() {
    var TAG = "***Adapter"


    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var flagImage : ImageView
        var checkImage : ImageView
        var langName : TextView
        init {
            //                sideImage=view.findViewById(R.id.side_image);
            flagImage = view.findViewById(R.id.flag_image)
            checkImage = view.findViewById(R.id.selected_image)
            langName = view.findViewById(R.id.language_name)
//            checkBox.setButtonDrawable(R.drawable.cirlce_bg_white);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.language_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.flagImage.setImageResource(data[position].image)
        holder.langName.text = data[position].name
        holder.itemView.setOnClickListener {
            when(context){
                is LanguagePickerActivity ->{
                    (context as LanguagePickerActivity).setlanguage(data[position])
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    fun setFilter(newList: ArrayList<LanguageModel>) {
        data = ArrayList()
        data.addAll(newList)
        notifyDataSetChanged()
    }



}