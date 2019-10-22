package com.sample.infolistapp.mainadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.infolistapp.R
import com.sample.infolistapp.model.Item
import kotlinx.android.synthetic.main.item_main_review.view.*

class MainReviewViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_review, parent, false)) {

    fun bind(item: Item) {
        Glide.with(itemView).load(item.logo_path).error(R.drawable.city_sample).into(itemView.imageReviewLogo)
        itemView.textReviewName.text = item.name
        itemView.textReviewIndustry.text = item.industry_name
        itemView.textReviewRate.text = item.rate_total_avg.toString()

        itemView.textReviewSummary.text = item.review_summary
        itemView.textReviewProsContent.text = item.pros
        itemView.textReviewConsContent.text = item.cons
    }

}