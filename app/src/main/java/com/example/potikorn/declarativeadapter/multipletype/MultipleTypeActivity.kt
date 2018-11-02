package com.example.potikorn.declarativeadapter.multipletype

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.potikorn.declarativeadapter.R
import com.example.potikorn.declarativeadapter.model.CommentModel
import com.example.potikorn.declarativeadapter.model.ProductModel
import com.example.potikorn.declarativeadapter.multipletype.cellview.CommentCellView
import com.example.potikorn.declarativeadapter.multipletype.cellview.ProductCellView
import kotlinx.android.synthetic.main.activity_multiple_type.*
import ro.andreidobrescu.declarativeadapterkt.DeclarativeAdapter

class MultipleTypeActivity : AppCompatActivity() {

    private val multipleTypeAdapter: DeclarativeAdapter by lazy { DeclarativeAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiple_type)
        initView()
        mockItems()
    }

    private fun initView() {
        multipleTypeAdapter.apply {
            whenInstanceOf(ProductModel::class,
                use = { ProductCellView(it) })
            whenInstanceOf(CommentModel::class,
                use = { CommentCellView(it) })
        }
        rvMultipleType.apply {
            layoutManager = LinearLayoutManager(this@MultipleTypeActivity)
            adapter = multipleTypeAdapter
        }
    }

    private fun mockItems() {
        val productDetailView = ProductModel(
            name = "Product One",
            detail = "Product Detail is not important in some time."
        )
        val mockComments = mutableListOf(
            CommentModel(
                "mock comment one",
                "user one"
            ),
            CommentModel(
                "mock comment two",
                "user two"
            )
        )
        val mainView = mutableListOf<Any>()
        mainView.apply {
            add(productDetailView)
            addAll(mockComments)
        }
        multipleTypeAdapter.setItems(mainView)
    }
}