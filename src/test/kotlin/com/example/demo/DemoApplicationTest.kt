package com.example.demo

import com.example.demo.Entity
import com.example.demo.EntityRepository
import kotlinx.coroutines.reactive.awaitSingle
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTest {

    @Autowired
    private lateinit var entityRepository: EntityRepository

    @Test
    fun `should save`() {
        runBlocking {
            entityRepository.save(Entity()).awaitSingle()
        }
    }

}
