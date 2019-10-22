package com.sample.infolistapp

import android.util.Log
import com.sample.infolistapp.api.ApiRequest
import com.sample.infolistapp.base.MainContract
import com.sample.infolistapp.model.Jobinfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(val view: MainContract.View) : MainContract.Presenter {

    private val TAG = "MainPresenter"

    var apiRequest = NetworkSetting.getClient().create(ApiRequest::class.java)

    override fun getInfo() {
        apiRequest.getInfo().enqueue(object : Callback<Jobinfo> {
            override fun onFailure(call: Call<Jobinfo>, t: Throwable) {
                Log.d(TAG, "* * * onFailure")
                Log.d(TAG, "* * * ${t.message}")
            }

            override fun onResponse(call: Call<Jobinfo>, response: Response<Jobinfo>) {
                response.body()?.let {
                    Log.d(TAG, "* * * onResponse")
                    response.body()?.let {
                        view.showItem(it)
                    }
                }
            }
        })
    }

}