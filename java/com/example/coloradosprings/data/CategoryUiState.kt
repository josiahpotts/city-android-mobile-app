package com.example.coloradosprings.data

import com.example.coloradosprings.model.Item

data class CategoryUiState(
    val category: String = "",
    val items: List<Item> = listOf(),
    val name: String = "",
    val imageResourceId: Int = 0,
    val address: String = "",
    val description: String = ""
)
