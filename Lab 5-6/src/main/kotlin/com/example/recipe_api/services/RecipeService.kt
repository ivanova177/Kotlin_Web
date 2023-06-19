package com.example.recipe_api.services

import com.example.recipe_api.models.Recipe
import com.example.recipe_api.repositories.RecipeRepository
import org.springframework.stereotype.Service

@Service
class RecipeService(private val recipeRepository: RecipeRepository) {
    fun findByTitle(title:String): List<Recipe>? = recipeRepository.findByTitle(title)
    fun findByAuthor(author:String): List<Recipe>? = recipeRepository.findByAuthor(author)
    fun findByDescription(description: String): List<Recipe>? = recipeRepository.findByDescription(description)
    fun findByIngredients(ingredients: String): List<Recipe>? = recipeRepository.findByIngredients(ingredients)
    fun findByInstructions(instructions: String): List<Recipe>? = recipeRepository.findByInstructions(instructions)
    fun findByCookTime(cookTime: String): List<Recipe>? = recipeRepository.findByCookTime(cookTime)
}