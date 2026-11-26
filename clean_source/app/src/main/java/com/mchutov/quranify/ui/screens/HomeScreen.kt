package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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
    var query by remember { mutableStateOf("") }
    var tab by remember { mutableIntStateOf(0) }

    DisposableEffect(Unit) {
        onDispose { SoundPlayer.stop() }
    }

    ScreenShell(
        title = "Quranify",
        videoAsset = LocalRepository.backgroundVideos[bg].asset,
        showVideo = true,
    ) {
        Card(Modifier.fillMaxWidth()) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .background(
                        Brush.horizontalGradient(
                            listOf(Color(0xFFE91E8C), Color(0xFF5B2A86)),
                        ),
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Text("Focus & Work", color = Color.White, style = MaterialTheme.typography.headlineSmall)
            }
            Row(
                Modifier.fillMaxWidth().padding(12.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(Modifier.weight(1f)) {
                    Text("Editors pick", style = MaterialTheme.typography.titleMedium)
                    Text("Ambient recitation for deep focus", style = MaterialTheme.typography.bodySmall)
                }
                Button(onClick = { onPlay(1) }) {
                    Icon(Icons.Default.PlayArrow, contentDescription = "Play")
                    Text("Play")
                }
            }
        }

        Text("100 points added", color = Color(0xFFD4AF37), modifier = Modifier.padding(top = 10.dp))
        Row(Modifier.padding(top = 6.dp)) {
            listOf("By surah", "By reciter", "My favorites").forEachIndexed { index, label ->
                FilterChip(
                    selected = tab == index,
                    onClick = { tab = index },
                    label = { Text(label) },
                    modifier = Modifier.padding(end = 6.dp),
                )
            }
        }
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Surah name") },
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
        )

        Text("Ambient video", color = Color.White, modifier = Modifier.padding(top = 10.dp))
        Row {
            LocalRepository.backgroundVideos.forEachIndexed { index, item ->
                FilterChip(
                    selected = bg == index,
                    onClick = { bg = index },
                    label = { Text(item.label) },
                    modifier = Modifier.padding(end = 6.dp),
                )
            }
        }
        Text("Sounds", color = Color.White, modifier = Modifier.padding(top = 10.dp))
        Row {
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

        LazyColumn(Modifier.padding(top = 10.dp)) {
            items(LocalRepository.surahs.filter { it.name.contains(query, true) }) { surah ->
                Card(
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                        .clickable { onPlay(surah.number) },
                ) {
                    Row(Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
                        Text("${surah.number}", color = Color(0xFFD4AF37))
                        Column(Modifier.weight(1f).padding(start = 10.dp)) {
                            Text(surah.name, style = MaterialTheme.typography.titleMedium)
                            Text(surah.arabicName, style = MaterialTheme.typography.bodySmall)
                        }
                        if (playing == surah.number) {
                            Text("Playing", color = Color(0xFF2E7CF6))
                        }
                        IconButton(onClick = { }) {
                            Icon(Icons.Default.StarBorder, contentDescription = "Favorite")
                        }
                    }
                }
            }
        }
    }
}
