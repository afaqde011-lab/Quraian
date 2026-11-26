package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.audio.SoundPlayer
import com.mchutov.quranify.data.LocalRepository
import com.mchutov.quranify.ui.components.ScreenShell

@Composable
fun SettingsScreen() {
    val context = LocalContext.current
    var playing by remember { mutableIntStateOf(-1) }

    DisposableEffect(Unit) {
        onDispose { SoundPlayer.stop() }
    }

    ScreenShell(title = "Settings") {
        Text("Sound effects", style = MaterialTheme.typography.titleMedium, color = androidx.compose.ui.graphics.Color.White)
        Row(modifier = Modifier.padding(top = 6.dp)) {
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

        Text("General", style = MaterialTheme.typography.titleMedium, color = androidx.compose.ui.graphics.Color.White, modifier = Modifier.padding(top = 16.dp))
        listOf("Edit details", "Notifications", "Downloads", "Sleep timer", "About").forEach { label ->
            Card(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
            ) {
                Text(label, style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(16.dp))
            }
        }
    }
}
