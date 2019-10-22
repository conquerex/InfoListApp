package com.sample.infolistapp.model

data class Jobinfo(
    val items: ArrayList<Item>,
    val minimum_interviews: Int,
    val minimum_reviews: Int,
    val minimum_salaries: Int,
    val page: Int,
    val page_size: Int,
    val total_count: Int,
    val total_page: Int
)
