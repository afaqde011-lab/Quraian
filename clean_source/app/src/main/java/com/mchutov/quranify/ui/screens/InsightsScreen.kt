package com.mchutov.quranify.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.ui.components.ScreenShell

@Composable
fun InsightsScreen() {
    ScreenShell(title = "Insights") {
        listOf(
            "Listening time" to "12h 30m",
            "Completed surahs" to "18",
            "Favorite reciter" to "Mishary Rashid",
            "Current streak" to "7 days",
        ).forEach { (label, value) ->
            Card(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
            ) {
                Column(Modifier.padding(16.dp)) {
                    Text(label, style = MaterialTheme.typography.bodyMedium)
                    Text(value, style = MaterialTheme.typography.titleMedium)
                }
            }
        }
    }
}
