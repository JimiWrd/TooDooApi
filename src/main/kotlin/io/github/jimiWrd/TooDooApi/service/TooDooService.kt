package io.github.jimiWrd.TooDooApi.service

import io.github.jimiWrd.TooDooApi.dto.TooDooRequestDto
import io.github.jimiWrd.TooDooApi.dto.TooDooResponseDto

interface TooDooService {
    fun createNewTooDooTask(tooDooRequestDto: TooDooRequestDto): TooDooResponseDto
}