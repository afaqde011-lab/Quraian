package com.mchutov.quranify.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Primary = Color(0xFF00695C)
val PrimaryDark = Color(0xFF004D40)
val Accent = Color(0xFFFFC107)
val BackgroundLight = Color(0xFFF7F7F2)
val BackgroundDark = Color(0xFF121212)

private val LightColors = lightColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    secondary = Accent,
    background = BackgroundLight,
)
private val DarkColors = darkColorScheme(
    primary = Color(0xFF80CBC4),
    onPrimary = Color.Black,
    secondary = Accent,
    background = BackgroundDark,
)

@Composable
fun QuranifyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content,
    )
}
