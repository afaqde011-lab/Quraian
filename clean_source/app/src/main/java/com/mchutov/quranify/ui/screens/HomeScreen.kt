package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.audio.SoundPlayer
import com.mchutov.quranify.data.LocalRepository
import com.mchutov.quranify.ui.components.ScreenShell

@Composable
fun HomeScreen(onPlay: (Int) -> Unit, playing: Int) {
    val context = LocalContext.current
    var bg by remember { mutableIntStateOf(0) }
    var sound by remember { mutableIntStateOf(-1) }

    DisposableEffect(Unit) {
        onDispose { SoundPlayer.stop() }
    }

    ScreenShell(
        title = "Quranify",
        videoAsset = LocalRepository.backgroundVideos[bg].asset,
    ) {
        Text("Continue reciting", color = Color.White, modifier = Modifier.padding(bottom = 4.dp))

        Text("Background", color = Color.White, modifier = Modifier.padding(top = 10.dp))
        Row(modifier = Modifier.padding(top = 4.dp)) {
            LocalRepository.backgroundVideos.forEachIndexed { index, item ->
                FilterChip(
                    selected = bg == index,
                    onClick = { bg = index },
                    label = { Text(item.label) },
                    modifier = Modifier.padding(end = 6.dp),
                )
            }
        }

        Text("Sound effects", color = Color.White, modifier = Modifier.padding(top = 10.dp))
        Row(modifier = Modifier.padding(top = 4.dp)) {
            LocalRepository.soundEffects.forEachIndexed { index, item ->
                FilterChip(
                    selected = sound == index,
                    onClick = {
                        if (sound == index) {
                            SoundPlayer.stop()
                            sound = -1
                        } else {
                            SoundPlayer.play(context, item.asset)
                            sound = index
                        }
                    },
                    label = { Text(item.label) },
                    modifier = Modifier.padding(end = 6.dp),
                )
            }
        }

        LazyColumn(Modifier.padding(top = 12.dp)) {
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
