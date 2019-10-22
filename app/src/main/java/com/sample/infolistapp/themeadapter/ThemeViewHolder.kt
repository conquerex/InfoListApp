package com.sample.infolistapp.themeadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.infolistapp.R
import com.sample.infolistapp.model.Theme
import kotlinx.android.synthetic.main.item_theme.view.*

class ThemeViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_theme, parent, false)) {

    fun bind(item: Theme) {
        Glide.with(itemView).load(item.cover_image).error(R.drawable.puzzle_sample).into(itemView.imageThemeCover)
        itemView.textThemeTitle.text = item.title
        itemView.imageThemeCover.scaleType = ImageView.ScaleType.CENTER_CROP
    }

}