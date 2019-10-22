package com.sample.infolistapp.mainadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.infolistapp.R
import com.sample.infolistapp.model.Item
import kotlinx.android.synthetic.main.item_main_salary.view.*

class MainSalaryViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_salary, parent, false)) {

    fun bind(item: Item) {
        Glide.with(itemView).load(item.logo_path).error(R.drawable.city_sample).into(itemView.imageSalaryLogo)
        itemView.textSalaryName.text = item.name
        itemView.textSalaryIndustry.text = item.industry_name
        itemView.textSalaryRate.text = item.rate_total_avg.toString()

        itemView.textSalarySummary.text = item.review_summary
        itemView.textSalaryLowestContent.text = item.salary_lowest.toString()
        itemView.textSalaryHighestContent.text = item.salary_highest.toString()
    }

}