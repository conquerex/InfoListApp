package com.sample.infolistapp.mainadapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sample.infolistapp.R
import com.sample.infolistapp.detail.DetailActivity
import com.sample.infolistapp.model.Item
import com.sample.infolistapp.themeadapter.ThemeListAdapter
import kotlinx.android.synthetic.main.item_main_theme.view.*

class MainThemeViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_theme, parent, false)) {

    fun bind(item: Item) {
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, DetailActivity::class.java)
            intent.putExtra("from", "MainThemeViewHolder")
            itemView.context.startActivity(intent)
        }

        val listAdapter = ThemeListAdapter()
        listAdapter.setHasStableIds(true)
        itemView.listMainTheme.adapter = listAdapter
        itemView.listMainTheme.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        itemView.listMainTheme.setHasFixedSize(false)
        listAdapter.addAll(item.themes)
    }

}