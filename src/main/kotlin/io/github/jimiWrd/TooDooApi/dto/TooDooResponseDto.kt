package io.github.jimiWrd.TooDooApi.dto

import java.time.LocalDate

data class TooDooResponseDto (
    var id: Long,
    var title: String,
    var description: String,
    var priority: Int,
    var dueDate: LocalDate
)