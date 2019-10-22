package com.sample.infolistapp.api

import com.sample.infolistapp.model.Jobinfo
import retrofit2.Call
import retrofit2.http.GET

interface ApiRequest {

    @GET(".")
    fun getInfo(): Call<Jobinfo>
}