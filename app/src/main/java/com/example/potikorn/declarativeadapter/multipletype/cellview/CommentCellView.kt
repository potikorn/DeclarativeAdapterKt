package com.example.potikorn.declarativeadapter.multipletype.cellview

import android.content.Context
import android.widget.Toast
import com.example.potikorn.declarativeadapter.R
import com.example.potikorn.declarativeadapter.model.CommentModel
import kotlinx.android.synthetic.main.item_comment.view.*
import ro.andreidobrescu.declarativeadapterkt.CellView

class CommentCellView(context: Context) : CellView<CommentModel>(context) {

    override fun layout(): Int = R.layout.item_comment

    override fun setData(comment: CommentModel?) {
        tvCommentUserName.text = comment?.username
        tvCommentText.text = comment?.msg
        setOnClickListener { Toast.makeText(context, comment?.msg, Toast.LENGTH_SHORT).show() }
    }
}