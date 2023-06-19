package com.example.recipe_api.services

import com.example.recipe_api.models.Person
import com.example.recipe_api.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (private val userRepository: UserRepository) {
    fun save(person: Person): Person {
        return this.userRepository.save(person)
    }

    fun findByEmail(email: String): Person? {
        return this.userRepository.findByEmail(email)
    }
}