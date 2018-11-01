package com.example.potikorn.declarativeadapter.cellview

import android.content.Context
import com.example.potikorn.declarativeadapter.R
import kotlinx.android.synthetic.main.simple_menu.view.*
import ro.andreidobrescu.declarativeadapterkt.CellView

class MainListMenuAdapter(
    context: Context,
    private val onActionListener: (String) -> Unit
) : CellView<String>(context) {

    override fun layout(): Int = R.layout.simple_menu

    override fun setData(menuString: String) {
        tvMenu.text = menuString
        setOnClickListener { onActionListener.invoke(menuString) }
    }
}