package com.example.recipe_api.repositories

import com.example.recipe_api.models.Recipe
import org.springframework.context.annotation.Description
import org.springframework.data.jpa.repository.JpaRepository

interface RecipeRepository: JpaRepository<Recipe, Int> {
    fun findByTitle(title:String): List<Recipe>?
    fun findByAuthor(author:String): List<Recipe>?
    fun findByDescription(description: String): List<Recipe>?
    fun findByIngredients(ingredients: String): List<Recipe>?
    fun findByInstructions(instructions: String): List<Recipe>?
    fun findByCookTime(cookTime: String): List<Recipe>?
}