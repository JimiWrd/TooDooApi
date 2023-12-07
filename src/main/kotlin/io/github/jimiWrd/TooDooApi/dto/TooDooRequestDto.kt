package io.github.jimiWrd.TooDooApi.dto

data class TooDooRequestDto (
    val title: String,
    val description: String,
    val priority: Int,
    val dueDate: String
)