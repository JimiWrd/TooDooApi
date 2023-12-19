package io.github.jimiWrd.TooDooApi.dto

import java.time.LocalDate

data class TooDooRequestDto (
    val title: String,
    val description: String,
    val priority: Int,
    val dueDate: LocalDate
)