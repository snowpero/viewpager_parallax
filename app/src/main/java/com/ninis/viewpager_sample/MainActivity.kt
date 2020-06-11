package com.ninis.viewpager_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp_main_banner.adapter = PageAdapter(supportFragmentManager)
        vp_main_banner.setPageTransformer(false, ParallaxPageTransformer())
    }
}