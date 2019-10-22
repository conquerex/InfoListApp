package com.sample.infolistapp.mainadapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sample.infolistapp.model.Item

class MainListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var itemList = ArrayList<Item>()

    companion object {
        const val CELL_TYPE_COMPANY = 1
        const val CELL_TYPE_HORIZONTAL_THEME = 2
        const val CELL_TYPE_JOB_POSTING = 3
        const val CELL_TYPE_REVIEW = 4
        const val CELL_TYPE_INTERVIEW = 5
        const val CELL_TYPE_SALARY = 6
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            CELL_TYPE_HORIZONTAL_THEME -> MainThemeViewHolder(parent)
            CELL_TYPE_JOB_POSTING -> MainPostingViewHolder(parent)
            CELL_TYPE_REVIEW -> MainReviewViewHolder(parent)
            CELL_TYPE_INTERVIEW -> MainInterviewViewHolder(parent)
            CELL_TYPE_SALARY -> MainSalaryViewHolder(parent)
            else -> MainCompanyViewHolder(parent)
        }
    }

    override fun getItemViewType(position: Int): Int {
        val type = itemList[position].cell_type
        return when {
            type.contains("CELL_TYPE_HORIZONTAL_THEME") -> 2
            type.contains("CELL_TYPE_JOB_POSTING") -> 3
            type.contains("CELL_TYPE_REVIEW") -> 4
            type.contains("CELL_TYPE_INTERVIEW") -> 5
            type.contains("CELL_TYPE_SALARY") -> 6
            else -> 1
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val type = itemList[position].cell_type
        when {
            type.contains("CELL_TYPE_COMPANY") -> (holder as MainCompanyViewHolder).bind(itemList[position])
            type.contains("CELL_TYPE_HORIZONTAL_THEME") -> (holder as MainThemeViewHolder).bind(itemList[position])
            type.contains("CELL_TYPE_JOB_POSTING") -> (holder as MainPostingViewHolder).bind(itemList[position])
            type.contains("CELL_TYPE_REVIEW") -> (holder as MainReviewViewHolder).bind(itemList[position])
            type.contains("CELL_TYPE_INTERVIEW") -> (holder as MainInterviewViewHolder).bind(itemList[position])
            type.contains("CELL_TYPE_SALARY") -> (holder as MainSalaryViewHolder).bind(itemList[position])
        }
    }

    override fun getItemId(position: Int): Long {
        return itemList[position].company_id.toLong()
    }

    fun addAll(items: ArrayList<Item>) {
        itemList.addAll(items)
        notifyDataSetChanged()
    }
}