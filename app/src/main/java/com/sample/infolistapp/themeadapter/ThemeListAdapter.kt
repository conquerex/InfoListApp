package com.sample.infolistapp.themeadapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sample.infolistapp.model.Theme

class ThemeListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var itemList = ArrayList<Theme>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ThemeViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ThemeViewHolder).bind(itemList[position])
    }

    override fun getItemId(position: Int): Long {
        return itemList[position].id.toLong()
    }

    fun addAll(items: ArrayList<Theme>) {
        itemList.addAll(items)
        notifyDataSetChanged()
    }
}