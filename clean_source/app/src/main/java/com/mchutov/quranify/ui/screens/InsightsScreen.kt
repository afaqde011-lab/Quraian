package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InsightsScreen() {
    Text(
        "Insights\n\nListening time: 12h 30m\nCompleted surahs: 18\nFavorite reciter: Mishary Rashid",
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier.padding(16.dp),
    )
}
