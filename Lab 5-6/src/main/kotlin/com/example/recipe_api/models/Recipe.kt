package com.example.recipe_api.models

import jakarta.persistence.*


@Entity
@Table(name = "recipe")
data class Recipe (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val title: String,
    val author: String,
    val description: String,
    val ingredients: List<String>,
    val instructions: List<String>,
    val cookTime: Int,
)