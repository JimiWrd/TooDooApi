package io.github.jimiWrd.TooDooApi.service.impl

import io.github.jimiWrd.TooDooApi.dto.TooDooRequestDto
import io.github.jimiWrd.TooDooApi.repository.TooDooRepository
import io.github.jimiWrd.TooDooApi.service.TooDooService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TooDooServiceImpl @Autowired constructor(private val tooDooRepository: TooDooRepository) : TooDooService {
    override fun createNewTooDooTask(tooDooRequestDto: TooDooRequestDto): String {
        TODO("Not yet implemented")
    }
}