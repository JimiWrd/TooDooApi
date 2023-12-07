package io.github.jimiWrd.TooDooApi.model

import jakarta.annotation.Nonnull
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class TooDooTask(
    @Id
    val id: Int,
    @Nonnull
    val title: String,
    val description: String,
    val status: String,
    val priority: Int,
    val dueDate: LocalDate,
    val createdAt: LocalDate,
    val updatedAt: LocalDate
)
