package com.sample.infolistapp.mainadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.infolistapp.R
import com.sample.infolistapp.model.Item
import kotlinx.android.synthetic.main.item_main_company.view.*

class MainCompanyViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_company, parent, false)) {

    fun bind(item: Item) {
        Glide.with(itemView).load(item.logo_path).error(R.drawable.city_sample).into(itemView.imageCompanyLogo)
        itemView.textCompanyName.text = item.name
        itemView.textCompanyIndustry.text = item.industry_name
        itemView.textCompanyRate.text = item.rate_total_avg.toString()

        itemView.textCompanySummary.text = item.review_summary
        itemView.textCompanySalary.text = item.salary_avg.toString()
        itemView.textCompanyInterviewContent.text = item.interview_question
    }

}