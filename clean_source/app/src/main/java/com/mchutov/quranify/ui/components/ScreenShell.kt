package com.mchutov.quranify.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Shared visual shell for every screen: looping video background,
 * deep-blue overlay, and consistent title/content styling.
 */
@Composable
fun ScreenShell(
    title: String,
    videoAsset: String = "playerBackground.mp4",
    content: @Composable ColumnScope.() -> Unit,
) {
    Box(Modifier.fillMaxSize()) {
        VideoBackground(videoAsset, Modifier.fillMaxSize())
        Box(
            Modifier
                .fillMaxSize()
                .background(Color(0x80061529)),
        ) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(16.dp),
            ) {
                Text(
                    title,
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White,
                )
                content()
            }
        }
    }
}
