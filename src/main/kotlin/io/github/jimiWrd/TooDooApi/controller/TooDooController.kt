package io.github.jimiWrd.TooDooApi.controller

import io.github.jimiWrd.TooDooApi.dto.TooDooRequestDto
import io.github.jimiWrd.TooDooApi.dto.TooDooResponseDto
import io.github.jimiWrd.TooDooApi.service.TooDooService
import jakarta.persistence.Id
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.query.Param
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/toodoo")
class TooDooController @Autowired constructor(private val tooDooService: TooDooService) {

    @PostMapping("/create", consumes = ["application/json"])
    fun createTooDoo(@RequestBody tooDooRequestDto: TooDooRequestDto): ResponseEntity<TooDooResponseDto> {
        val response = tooDooService.createNewTooDooTask(tooDooRequestDto)
        return ResponseEntity.ok(response)
    }

    @GetMapping("/getAll")
    fun getAllTooDoo(): ResponseEntity<List<TooDooResponseDto>> {
        return try {
            val response = tooDooService.getAllTooDooTasks()
            ResponseEntity.ok(response)
        } catch (e: Exception) {
            ResponseEntity.badRequest().build()
        }
    }

    @GetMapping("/get/{id}")
    fun getTooDoo(@PathVariable("id") id: Long): ResponseEntity<TooDooResponseDto> {
        val response = tooDooService.getTooDoo(id)
        return ResponseEntity.ok(response)
    }

}