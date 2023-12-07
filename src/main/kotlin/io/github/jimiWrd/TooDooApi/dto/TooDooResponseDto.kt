package io.github.jimiWrd.TooDooApi.dto

data class TooDooResponseDto (
    val id: Long,
    val title: String,
    val description: String,
    val priority: Int,
    val dueDate: String
)