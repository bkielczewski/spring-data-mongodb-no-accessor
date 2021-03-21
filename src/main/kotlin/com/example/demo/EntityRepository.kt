package com.example.demo

import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface EntityRepository : ReactiveMongoRepository<Entity, String>
