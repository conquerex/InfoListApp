package com.sample.infolistapp.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sample.infolistapp.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val from = intent.getStringExtra("from")
        textDetail.text = from + "\n위 아이템에서 선택되어 진입한 상세화면\n상세 디자인이 없어서 현재와 같이 나타남"
    }
}
