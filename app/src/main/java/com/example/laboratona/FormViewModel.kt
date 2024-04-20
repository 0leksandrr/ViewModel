package com.example.laboratona

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.MutableStateFlow

class FormViewModel : ViewModel() {
    private val _items = MutableStateFlow<List<Item>>(emptyList())
    val items: StateFlow<List<Item>> = _items

    fun addItem(name: String, email: String) {
        val newItem = Item(name, email)
        _items.value += newItem
    }
}

