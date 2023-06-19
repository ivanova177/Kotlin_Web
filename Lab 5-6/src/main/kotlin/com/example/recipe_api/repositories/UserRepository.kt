package com.example.recipe_api.repositories

import com.example.recipe_api.models.Person
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<Person, Int> {
    fun findByEmail(email:String): Person?
}