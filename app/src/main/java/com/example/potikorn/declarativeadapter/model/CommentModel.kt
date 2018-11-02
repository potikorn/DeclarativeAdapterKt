package com.example.potikorn.declarativeadapter.model

data class CommentListModel(
    val commentList: MutableList<CommentModel>? = null
)

data class CommentModel(
    val msg: String? = null,
    val username: String? = null
)