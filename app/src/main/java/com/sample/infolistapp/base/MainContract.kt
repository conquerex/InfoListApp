package com.sample.infolistapp.base

import com.sample.infolistapp.model.Jobinfo

interface MainContract {

    interface View {
        fun showItem(info : Jobinfo)
    }

    interface Presenter {
        fun getInfo()
    }

}