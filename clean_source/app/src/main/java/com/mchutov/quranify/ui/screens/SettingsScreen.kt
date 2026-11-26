package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.audio.SoundPlayer
import com.mchutov.quranify.data.LocalRepository

@Composable
fun SettingsScreen() {
    val context = LocalContext.current
    var playing by remember { mutableIntStateOf(-1) }

    DisposableEffect(Unit) {
        onDispose { SoundPlayer.stop() }
    }

    Column(Modifier.padding(16.dp)) {
        Text("Settings", style = MaterialTheme.typography.headlineMedium)

        Text("Sound effects", style = MaterialTheme.typography.titleMedium, modifier = Modifier.padding(top = 12.dp))
        Row {
            LocalRepository.soundEffects.forEachIndexed { index, effect ->
                FilterChip(
                    selected = playing == index,
                    onClick = {
                        if (playing == index) {
                            SoundPlayer.stop()
                            playing = -1
                        } else {
                            SoundPlayer.play(context, effect.asset)
                            playing = index
                        }
                    },
                    label = { Text(effect.label) },
                    modifier = Modifier.padding(end = 6.dp),
                )
            }
        }
        Button(
            onClick = {
                SoundPlayer.stop()
                playing = -1
            },
            modifier = Modifier.padding(top = 8.dp),
        ) {
            Text("Stop sound")
        }

        Text("General", style = MaterialTheme.typography.titleMedium, modifier = Modifier.padding(top = 16.dp))
        listOf("Edit details", "Notifications", "Downloads", "Sleep timer", "About").forEach {
            Text(it, style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}
