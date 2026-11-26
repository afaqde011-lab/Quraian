package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.data.LocalRepository

@Composable
fun RecitersScreen() {
    val items = LocalRepository.reciters
    LazyColumn(Modifier.padding(16.dp)) {
        item { Text("Reciters", style = MaterialTheme.typography.headlineMedium) }
        items(items) { item ->
            Card(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable { Unit },
            ) {
                Column(Modifier.padding(16.dp)) {
                    Text(item.name, style = MaterialTheme.typography.titleMedium)
                    Text(item.style, style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}
