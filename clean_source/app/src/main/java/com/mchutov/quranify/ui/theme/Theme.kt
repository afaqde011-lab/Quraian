package com.mchutov.quranify.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Quranify original palette: deep navy blue
val Primary = Color(0xFF0A2A66)
val PrimaryDark = Color(0xFF061B45)
val Accent = Color(0xFF4FC3F7)
val BackgroundDark = Color(0xFF061529)
val SurfaceDark = Color(0xFF0C2245)
val BackgroundLight = Color(0xFFE8F0FA)

private val DarkColors = darkColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    primaryContainer = PrimaryDark,
    onPrimaryContainer = Color.White,
    secondary = Accent,
    onSecondary = Color.Black,
    background = BackgroundDark,
    onBackground = Color.White,
    surface = SurfaceDark,
    onSurface = Color.White,
)

private val LightColors = lightColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    secondary = Accent,
    background = BackgroundLight,
)

@Composable
fun QuranifyTheme(darkTheme: Boolean = true, content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content,
    )
}
