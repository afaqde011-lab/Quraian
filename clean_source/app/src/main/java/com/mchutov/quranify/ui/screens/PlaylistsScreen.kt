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
import com.mchutov.quranify.ui.components.ScreenShell

@Composable
fun PlaylistsScreen() {
    ScreenShell(title = "Playlists") {
        LazyColumn(Modifier.padding(top = 8.dp)) {
            items(LocalRepository.playlists) { playlist ->
                Card(
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                        .clickable { },
                ) {
                    Column(Modifier.padding(16.dp)) {
                        Text(playlist.name, style = MaterialTheme.typography.titleMedium)
                        Text("${playlist.count} items", style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}
