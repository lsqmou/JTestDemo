package com.lmoumou.jtestdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lmoumou.test_library.Test
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextView.text = Test.test("你好")
    }
}
