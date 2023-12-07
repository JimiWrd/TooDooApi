package io.github.jimiWrd.TooDooApi.controller

import io.github.jimiWrd.TooDooApi.dto.TooDooRequestDto
import io.github.jimiWrd.TooDooApi.service.TooDooService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TooDooController @Autowired constructor(private val tooDooService: TooDooService) {

    @PostMapping("/create")
    fun createTooDoo(@RequestBody tooDooRequestDto: TooDooRequestDto): ResponseEntity<String> {
        val response = tooDooService.createNewTooDooTask(tooDooRequestDto)
        return ResponseEntity.ok(response)
    }
}