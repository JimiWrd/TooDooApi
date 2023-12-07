package io.github.jimiWrd.TooDooApi.service

import io.github.jimiWrd.TooDooApi.dto.TooDooRequestDto

interface TooDooService {
    fun createNewTooDooTask(tooDooRequestDto: TooDooRequestDto): String
}