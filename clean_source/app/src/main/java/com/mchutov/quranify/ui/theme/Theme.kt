package com.mchutov.quranify.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Palette taken from the original Quranify screenshots:
// black canvas, bright blue accent, warm gold highlights.
val Primary = Color(0xFF2E7CF6)
val PrimaryDark = Color(0xFF0A1B3D)
val Accent = Color(0xFFD4AF37)
val Background = Color(0xFF000000)
val Surface = Color(0xFF141416)
val SurfaceLight = Color(0xFF1E1E22)
val OnSurface = Color(0xFFFFFFFF)

private val DarkColors = darkColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    primaryContainer = PrimaryDark,
    onPrimaryContainer = Color.White,
    secondary = Accent,
    onSecondary = Color.Black,
    background = Background,
    onBackground = Color.White,
    surface = Surface,
    onSurface = OnSurface,
)

@Composable
fun QuranifyTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = DarkColors, content = content)
}
