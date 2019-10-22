package com.sample.infolistapp

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sample.infolistapp.mainadapter.MainListAdapter
import com.sample.infolistapp.base.BaseDataBindingActivity
import com.sample.infolistapp.base.MainContract
import com.sample.infolistapp.databinding.ActivityMainBinding
import com.sample.infolistapp.model.Jobinfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseDataBindingActivity<ActivityMainBinding>(R.layout.activity_main),
    MainContract.View {

    val presenter: MainContract.Presenter = MainPresenter(this@MainActivity)
    val listAdapter = MainListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listAdapter.setHasStableIds(true)
        listMain.adapter = listAdapter
        listMain.layoutManager = LinearLayoutManager(this)
        listMain.setHasFixedSize(false)

        presenter.getInfo()
    }

    override fun showItem(info: Jobinfo) {
        listAdapter.addAll(info.items)
    }
}
