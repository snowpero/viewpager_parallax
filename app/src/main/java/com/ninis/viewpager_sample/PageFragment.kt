package com.ninis.viewpager_sample

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.i_viewpager_item_row.view.*

class PageFragment(val position: Int): Fragment() {
    companion object {
        fun newInstance(position: Int) : PageFragment {
            val args = Bundle()
            val fragment = PageFragment(position)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.i_viewpager_item_row, container, false)
        view.iv_item_image.setBackgroundColor(
            when(position) {
                0 -> Color.BLACK
                1 -> Color.GRAY
                2 -> Color.RED
                3 -> Color.YELLOW
                4 -> Color.BLUE
                else -> Color.CYAN
            }
        )
        view.iv_item_image.setImageResource(
            when(position) {
                0 -> R.drawable.aa
                1 -> R.drawable.bb
                2 -> R.drawable.cc
                3 -> R.drawable.dd
                4 -> R.drawable.ee
                else -> R.drawable.ff
            }
        )

        view.tv_page_num.text = "Page $position"

        return view
    }
}