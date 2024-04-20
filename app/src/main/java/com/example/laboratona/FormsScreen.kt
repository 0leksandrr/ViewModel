package com.example.laboratona
import androidx.compose.material3.*
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun FormScreen(viewModel: FormViewModel) {
    val name = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }

    Column {
        TextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text("Ім'я") }
        )
        TextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email") }
        )
        Button(onClick = { viewModel.addItem(name.value, email.value) }) {
            Text("Додати")
        }
    }
}
