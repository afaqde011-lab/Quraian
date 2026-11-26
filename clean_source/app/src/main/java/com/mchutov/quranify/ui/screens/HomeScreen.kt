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
fun HomeScreen(onPlay: (Int) -> Unit, playing: Int) {
    LazyColumn(Modifier.padding(16.dp)) {
        item {
            Text("Quranify", style = MaterialTheme.typography.headlineLarge)
            Text("Continue reciting", style = MaterialTheme.typography.bodyLarge)
        }
        items(LocalRepository.surahs) { surah ->
            Card(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable { onPlay(surah.number) },
            ) {
                Column(Modifier.padding(16.dp)) {
                    Text("${surah.number}. ${surah.name}", style = MaterialTheme.typography.titleMedium)
                    Text(surah.arabicName, style = MaterialTheme.typography.bodyLarge)
                    if (playing == surah.number) {
                        Text("Now playing", color = MaterialTheme.colorScheme.primary)
                    }
                }
            }
        }
    }
}
