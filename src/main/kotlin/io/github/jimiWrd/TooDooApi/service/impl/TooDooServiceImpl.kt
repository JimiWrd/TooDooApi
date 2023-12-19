package io.github.jimiWrd.TooDooApi.service.impl

import io.github.jimiWrd.TooDooApi.config.TooDooMapper
import io.github.jimiWrd.TooDooApi.constants.Status
import io.github.jimiWrd.TooDooApi.dto.TooDooRequestDto
import io.github.jimiWrd.TooDooApi.dto.TooDooResponseDto
import io.github.jimiWrd.TooDooApi.repository.TooDooRepository
import io.github.jimiWrd.TooDooApi.service.TooDooService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.util.*

@Service
class TooDooServiceImpl @Autowired constructor(private val tooDooRepository: TooDooRepository, private val tooDooMapper: TooDooMapper) : TooDooService {
    override fun createNewTooDooTask(tooDooRequestDto: TooDooRequestDto): TooDooResponseDto {
        val tooDooTask = tooDooMapper.toTooDooTask(tooDooRequestDto)
        tooDooTask.createdAt = LocalDate.now()
        tooDooTask.status = Status.IN_PROGRESS.toString()
        println(tooDooTask.description)
        val response = tooDooRepository.save(tooDooTask)
        val responseDto = tooDooMapper.toTooDooResponseDto(response)

        return responseDto
    }

    override fun getAllTooDooTasks(): List<TooDooResponseDto> {
        val response = tooDooRepository.findAll()
        val responseDto = response.map { tooDooMapper.toTooDooResponseDto(it) }

        return responseDto
    }

    override fun getTooDoo(id: Long): TooDooResponseDto {
        val response = tooDooRepository.findById(id).orElseThrow { NoSuchElementException("No TooDooTask found with id: $id") }
        val responseDto = tooDooMapper.toTooDooResponseDto(response)

        return responseDto
    }
}