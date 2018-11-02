package com.example.potikorn.declarativeadapter.multipletype.cellview

import android.content.Context
import android.support.v4.content.ContextCompat
import com.example.potikorn.declarativeadapter.R
import com.example.potikorn.declarativeadapter.model.ProductModel
import kotlinx.android.synthetic.main.item_product_detail.view.*
import ro.andreidobrescu.declarativeadapterkt.CellView

class ProductCellView(context: Context) : CellView<ProductModel>(context) {

    override fun layout(): Int = R.layout.item_product_detail

    override fun setData(product: ProductModel?) {
        ivProductImage.background = ContextCompat.getDrawable(context, android.R.color.darker_gray)
        tvProductName.text = product?.name
        tvProductDetail.text = product?.detail
    }
}