package com.sample.infolistapp.mainadapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sample.infolistapp.R
import com.sample.infolistapp.detail.DetailActivity
import com.sample.infolistapp.model.Item
import kotlinx.android.synthetic.main.item_main_salary.view.*
import java.text.DecimalFormat

class MainSalaryViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_salary, parent, false)) {

    fun bind(item: Item) {
        itemView.setOnClickListener {
            val intent = Intent(itemView.context, DetailActivity::class.java)
            intent.putExtra("from", "MainSalaryViewHolder")
            itemView.context.startActivity(intent)
        }

        val decimalFormat = DecimalFormat("#,###")
        Glide.with(itemView).load(item.logo_path).error(R.drawable.city_sample).into(itemView.imageSalaryLogo)
        itemView.textSalaryName.text = item.name
        itemView.textSalaryIndustry.text = item.industry_name
        itemView.textSalaryRate.text = item.rate_total_avg.toString()

        itemView.textSalarySummary.text = item.review_summary
        itemView.textSalaryLowestContent.text = decimalFormat.format(item.salary_lowest) + "만원"
        itemView.textSalaryHighestContent.text = decimalFormat.format(item.salary_highest) + "만원"
    }

}