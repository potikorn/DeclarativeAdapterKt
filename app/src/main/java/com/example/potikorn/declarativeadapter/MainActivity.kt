package com.example.potikorn.declarativeadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.potikorn.declarativeadapter.cellview.MainListMenuAdapter
import kotlinx.android.synthetic.main.activity_main.*
import ro.andreidobrescu.declarativeadapterkt.DeclarativeAdapter

class MainActivity : AppCompatActivity() {

    private val menuAdapter: DeclarativeAdapter by lazy { DeclarativeAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMenuList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = menuAdapter.apply {
                whenInstanceOf(String::class,
                    use = { context -> MainListMenuAdapter(context) { actionItemInvoke(it) } })
            }
        }
        menuAdapter.setItems(mockMenu())
    }

    private fun actionItemInvoke(it: String) {
        Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
    }

    private fun mockMenu(): List<String> {
        return mutableListOf(
            "Menu 1",
            "Menu 2",
            "Menu 3",
            "Menu 4"
        )
    }
}
