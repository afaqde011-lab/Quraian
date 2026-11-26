package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
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
import com.mchutov.quranify.ui.components.ScreenShell

@Composable
fun SearchScreen() {
    var query by remember { mutableStateOf("") }
    ScreenShell(title = "Search") {
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Surah or reciter") },
            modifier = Modifier.fillMaxWidth(),
        )
        val results = LocalRepository.surahs.filter { it.name.contains(query, true) }
        Column(Modifier.padding(top = 8.dp)) {
            results.forEach { surah ->
                Card(
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                ) {
                    Column(Modifier.padding(16.dp)) {
                        Text("${surah.number}. ${surah.name}", style = MaterialTheme.typography.titleMedium)
                        Text(surah.arabicName, style = MaterialTheme.typography.bodyLarge)
                    }
                }
            }
        }
    }
}
