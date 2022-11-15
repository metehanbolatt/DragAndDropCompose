package com.metehanbolat.draganddropcompose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var isCurrentlyDragging by mutableStateOf(false)
        private set

    var items by mutableStateOf(emptyList<PersonUIItem>())
        private set

    var addedPersons = mutableStateListOf<PersonUIItem>()
        private set

    init {
        items = listOf(
            PersonUIItem("Metehan", "1", Color.Gray),
            PersonUIItem("Pınar", "2", Color.Blue),
            PersonUIItem("Kedi", "3", Color.Green),
        )
    }

    fun startDragging() {
        isCurrentlyDragging = true
    }

    fun stopDragging() {
        isCurrentlyDragging = false
    }

    fun addPerson(personUIItem: PersonUIItem) {
        addedPersons.add(personUIItem)
    }
}