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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mchutov.quranify.ui.theme.Background
import com.mchutov.quranify.ui.theme.PrimaryDark

/**
 * Shared visual shell matching the original Quranify screenshots:
 * black canvas, subtle blue gradient at top, optional ambient video,
 * white title and consistent spacing.
 */
@Composable
fun ScreenShell(
    title: String,
    videoAsset: String = "playerBackground.mp4",
    showVideo: Boolean = true,
    content: @Composable ColumnScope.() -> Unit,
) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Background),
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(PrimaryDark, Color.Black, Color.Black),
                    ),
                ),
        )
        if (showVideo) {
            VideoBackground(
                videoAsset,
                Modifier
                    .fillMaxSize()
                    .alpha(0.35f),
            )
        }
        Box(
            Modifier
                .fillMaxSize()
                .background(Color(0x99000000)),
        )
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
