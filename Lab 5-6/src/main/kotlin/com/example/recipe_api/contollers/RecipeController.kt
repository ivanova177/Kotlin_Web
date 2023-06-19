package com.example.recipe_api.contollers

import com.example.recipe_api.models.Recipe
import com.example.recipe_api.services.RecipeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("recipe")
class RecipeController(private val recipeService: RecipeService) {

    @GetMapping("title")
    fun searchByTitle(@RequestParam title: String): ResponseEntity<List<Recipe>> {
        return ResponseEntity.ok(this.recipeService.findByTitle(title))
    }

    @GetMapping("author")
    fun searchByAuthor(@RequestParam author: String): ResponseEntity<List<Recipe>> {
        return ResponseEntity.ok(this.recipeService.findByAuthor(author))
    }

    @GetMapping("description")
    fun searchByDescription(@RequestParam description: String): ResponseEntity<List<Recipe>> {
        return ResponseEntity.ok(this.recipeService.findByDescription(description))
    }
    @GetMapping("ingredients")
    fun searchByIngredients(@RequestParam ingredients: String): ResponseEntity<List<Recipe>> {
        return ResponseEntity.ok(this.recipeService.findByIngredients(ingredients))
    }
    @GetMapping("instructions")
    fun searchByInstructions(@RequestParam instructions: String): ResponseEntity<List<Recipe>> {
        return ResponseEntity.ok(this.recipeService.findByInstructions(instructions))
    }
    @GetMapping("cookTime")
    fun searchByCookTime(@RequestParam cookTime: String): ResponseEntity<List<Recipe>> {
        return ResponseEntity.ok(this.recipeService.findByCookTime(cookTime))
    }
}