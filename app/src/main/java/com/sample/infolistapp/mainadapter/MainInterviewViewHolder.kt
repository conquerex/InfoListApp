package com.sample.infolistapp.mainadapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.infolistapp.R
import com.sample.infolistapp.detail.DetailActivity
import com.sample.infolistapp.model.Item
import kotlinx.android.synthetic.main.item_main_interview.view.*

class MainInterviewViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_interview, parent, false)) {

    fun bind(item: Item) {
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, DetailActivity::class.java)
            intent.putExtra("from", "MainInterviewViewHolder")
            itemView.context.startActivity(intent)
        }

        Glide.with(itemView).load(item.logo_path).error(R.drawable.city_sample).into(itemView.imageInterviewLogo)
        itemView.textInterviewName.text = item.name
        itemView.textInterviewIndustry.text = item.industry_name
        itemView.textInterviewRate.text = item.rate_total_avg.toString()

        itemView.textInterviewInterviewContent.text = item.interview_question
    }

}