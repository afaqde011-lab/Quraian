package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.data.LocalRepository
import com.mchutov.quranify.ui.components.VideoBackground

@Composable
fun HomeScreen(onPlay: (Int) -> Unit, playing: Int) {
    var bg by remember { mutableIntStateOf(0) }
    val video = LocalRepository.backgroundVideos[bg]

    Box(Modifier.fillMaxSize()) {
        VideoBackground(video.asset, Modifier.fillMaxSize())

        Box(
            Modifier
                .fillMaxSize()
                .background(Color(0xB3061529)),
        ) {
            LazyColumn(Modifier.padding(16.dp)) {
                item {
                    Text("Quranify", style = MaterialTheme.typography.headlineLarge, color = Color.White)
                    Text("Continue reciting", style = MaterialTheme.typography.bodyLarge, color = Color.White)
                    Row(modifier = Modifier.padding(top = 12.dp)) {
                        LocalRepository.backgroundVideos.forEachIndexed { index, item ->
                            FilterChip(
                                selected = bg == index,
                                onClick = { bg = index },
                                label = { Text(item.label) },
                                modifier = Modifier.padding(end = 6.dp),
                            )
                        }
                    }
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
    }
}
