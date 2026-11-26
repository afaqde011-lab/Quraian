package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.data.Surah
import com.mchutov.quranify.ui.components.VideoBackground

/**
 * Full-screen immersive player matching the original app video:
 * nature video background, dark overlay, surah/reciter text and transport controls.
 */
@Composable
fun PlayerScreen(surah: Surah?, onClose: () -> Unit) {
    Box(Modifier.fillMaxSize()) {
        VideoBackground("rain_video.mp4", Modifier.fillMaxSize())
        Box(Modifier.fillMaxSize().background(Color(0x66000000)))

        Column(
            Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onClose) {
                    Icon(Icons.Default.Close, contentDescription = "Close", tint = Color.White)
                }
                Spacer(Modifier.weight(1f))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .background(Color(0x55FFFFFF), androidx.compose.foundation.shape.RoundedCornerShape(16.dp))
                        .clickable { }
                        .padding(horizontal = 12.dp, vertical = 6.dp),
                ) {
                    Icon(
                        Icons.Default.VolumeUp,
                        contentDescription = "Sound",
                        tint = Color.White,
                        modifier = Modifier.padding(end = 6.dp),
                    )
                    Text("الصوت", color = Color.White)
                }
            }

            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    surah?.name ?: "Al-Baqarah",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
                )
                Text(
                    "Bader Al-Turki",
                    color = Color.White.copy(alpha = 0.8f),
                    style = androidx.compose.material3.MaterialTheme.typography.bodyLarge,
                )
            }

            Column(Modifier.fillMaxWidth()) {
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    IconButton(onClick = { }) {
                        Icon(Icons.Default.SkipPrevious, contentDescription = "Previous", tint = Color.White)
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Default.Pause,
                            contentDescription = "Pause",
                            tint = Color.White,
                            modifier = Modifier.background(Color(0x33FFFFFF), androidx.compose.foundation.shape.CircleShape),
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(Icons.Default.SkipNext, contentDescription = "Next", tint = Color.White)
                    }
                }
                Row(
                    Modifier.fillMaxWidth().padding(top = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    IconButton(onClick = { }) {
                        Icon(Icons.Default.StarBorder, contentDescription = "Favorite", tint = Color.White)
                    }
                    Text("59:49", color = Color.White.copy(alpha = 0.8f))
                    Spacer(Modifier.weight(1f))
                }
            }
        }
    }
}
