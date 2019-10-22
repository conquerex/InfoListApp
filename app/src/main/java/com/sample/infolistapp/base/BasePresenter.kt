package com.sample.infolistapp.base

interface BasePresenter<T> {
    fun bindView(view: T)
    fun unbindView()

}