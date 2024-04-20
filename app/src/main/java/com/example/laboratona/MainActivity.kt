package com.example.laboratona

import androidx.compose.material3.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelProvider
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppContent(viewModel = ViewModelProvider(this).get(FormViewModel::class.java))
        }
    }
}

@Composable
fun AppContent(viewModel: FormViewModel) {
    val itemsState = viewModel.items.collectAsState()

    Surface(color = MaterialTheme.colorScheme.background) {
        Column {
            FormScreen(viewModel = viewModel)
            ItemsList(items = itemsState.value)
        }
    }
}

