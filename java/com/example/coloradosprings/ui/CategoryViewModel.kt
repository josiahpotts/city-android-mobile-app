package com.example.coloradosprings.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.example.coloradosprings.data.CategoryUiState
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CategoryViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(CategoryUiState())
    val uiState: StateFlow<CategoryUiState> = _uiState.asStateFlow()

    fun setCategory(categoryChoice: String) {
        _uiState.update { currentState ->
            currentState.copy(
                category = categoryChoice
            )
        }
    }

    fun setItem(nameChoice: String) {
        _uiState.update { currentState ->
            currentState.copy(
                name = nameChoice
            )
        }
    }

    fun resetSelection() {
        _uiState.value = CategoryUiState()
    }
}