package com.example.demo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Entity(
        @Id
        val id: String? = null,
        val foos: Set<Foo> = emptySet()
)

enum class Foo
