package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.data.LocalRepository

@Composable
fun SearchScreen() {
    var query by remember { mutableStateOf("") }
    Column(Modifier.padding(16.dp)) {
        Text("Search", style = MaterialTheme.typography.headlineMedium)
        OutlinedTextField(value = query, onValueChange = { query = it }, label = { Text("Surah or reciter") })
        val results = LocalRepository.surahs.filter { it.name.contains(query, true) }
        results.forEach { Text("${it.number}. ${it.name}") }
    }
}
