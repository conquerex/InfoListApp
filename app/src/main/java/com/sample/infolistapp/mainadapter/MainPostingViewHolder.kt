package com.sample.infolistapp.mainadapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.infolistapp.R
import com.sample.infolistapp.detail.DetailActivity
import com.sample.infolistapp.model.Item
import kotlinx.android.synthetic.main.item_main_posting.view.*

class MainPostingViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_posting, parent, false)) {

    fun bind(item: Item) {
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, DetailActivity::class.java)
            intent.putExtra("from", "MainPostingViewHolder")
            itemView.context.startActivity(intent)
        }

        Glide.with(itemView).load(item.logo).error(R.drawable.city_sample).into(itemView.imagePostingLogo)
        itemView.textPostingName.text = item.name

        itemView.textPostingTitle.text = item.title
        itemView.textPostingMessage.text = item.deadline.message
        itemView.textPostingCache.text = item.review_avg_cache.toString()
    }

}