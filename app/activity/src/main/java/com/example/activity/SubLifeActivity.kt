package com.example.activity

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_sub_life.*

class SubLifeActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_life)

        detail_btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                count++
                detail_count.setText(count.toString())
            }
        })
    }
}