package io.github.jimiWrd.TooDooApi.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class TooDooTask(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var title: String,
    var description: String,
    var status: String?,
    var priority: Int?,
    var dueDate: LocalDate?,
    var createdAt: LocalDate?,
)
