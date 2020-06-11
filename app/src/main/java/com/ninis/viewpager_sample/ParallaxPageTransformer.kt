package com.ninis.viewpager_sample

import android.view.View
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.i_viewpager_item_row.view.*

class ParallaxPageTransformer: ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        val pageWidth = page.width

        page.iv_item_image.translationX = -position * (pageWidth / 2)
    }
}