package ru.netology.coroutines.dto

data class PostsWithComments(
    val post: Post,
    val comments: List<Comment>,
    val authors: Author,
)