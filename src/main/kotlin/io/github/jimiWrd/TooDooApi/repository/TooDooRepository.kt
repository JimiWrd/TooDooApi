package io.github.jimiWrd.TooDooApi.repository

import io.github.jimiWrd.TooDooApi.model.TooDooTask
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface TooDooRepository: JpaRepository<TooDooTask, Long> {
    override fun findById(id: Long): Optional<TooDooTask>
}