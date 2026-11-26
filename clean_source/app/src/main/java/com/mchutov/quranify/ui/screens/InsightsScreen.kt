package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.data.LocalRepository
import com.mchutov.quranify.ui.components.ScreenShell
import com.mchutov.quranify.ui.theme.Primary

@Composable
fun InsightsScreen() {
    ScreenShell(title = "Insights & Trends", showVideo = false) {
        Text("Listening this week", color = Color.White, modifier = Modifier.padding(top = 8.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .height(130.dp)
                .padding(top = 8.dp),
            verticalAlignment = Alignment.Bottom,
        ) {
            listOf(40, 70, 50, 95, 60, 80, 35).forEach { value ->
                Box(
                    Modifier
                        .weight(1f)
                        .padding(horizontal = 2.dp)
                        .height(value.dp)
                        .background(Primary),
                )
            }
        }
        Text("Top surah's", color = Color.White, modifier = Modifier.padding(top = 16.dp))
        LocalRepository.surahs.take(3).forEach { surah ->
            Card(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
            ) {
                Row(Modifier.padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
                    Text(surah.number.toString(), color = Color(0xFFD4AF37))
                    Column(Modifier.padding(start = 10.dp)) {
                        Text(surah.name, style = MaterialTheme.typography.titleMedium)
                        Text(surah.arabicName, style = MaterialTheme.typography.bodySmall)
                    }
                }
            }
        }
        Text("Top reciters", color = Color.White, modifier = Modifier.padding(top = 16.dp))
        LocalRepository.reciters.take(2).forEach { reciter ->
            Card(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
            ) {
                Text(
                    reciter.name,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(12.dp),
                )
            }
        }
    }
}
