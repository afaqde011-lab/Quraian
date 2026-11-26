package com.mchutov.quranify.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlaylistPlay
import androidx.compose.material.icons.filled.ShowChart
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import com.mchutov.quranify.data.LocalRepository
import com.mchutov.quranify.ui.screens.HomeScreen
import com.mchutov.quranify.ui.screens.RecitersScreen
import com.mchutov.quranify.ui.screens.PlaylistsScreen
import com.mchutov.quranify.ui.screens.InsightsScreen
import com.mchutov.quranify.ui.screens.SearchScreen
import com.mchutov.quranify.ui.screens.SettingsScreen
import com.mchutov.quranify.ui.screens.PlayerScreen

private val tabs = listOf(
    "Sounds" to Icons.Default.Home,
    "All Surahs" to Icons.Default.Person,
    "You help" to Icons.Default.PlaylistPlay,
    "AirPlay" to Icons.Default.Search,
    "Control" to Icons.Default.Settings,
    "Insights" to Icons.Default.ShowChart,
)

@Composable
fun AppNavHost() {
    var selected by remember { mutableIntStateOf(0) }
    var playing by remember { mutableIntStateOf(-1) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                tabs.forEachIndexed { index, (label, icon) ->
                    NavigationBarItem(
                        selected = selected == index,
                        onClick = { selected = index },
                        icon = { Icon(icon, contentDescription = label) },
                        label = { Text(label) },
                    )
                }
            }
        }
    ) { padding ->
        androidx.compose.foundation.layout.Box(Modifier.padding(padding)) {
            when (selected) {
                0 -> HomeScreen(onPlay = { playing = it }, playing = playing)
                1 -> RecitersScreen()
                2 -> PlaylistsScreen()
                3 -> SearchScreen()
                4 -> SettingsScreen()
                5 -> InsightsScreen()
            }

            if (playing != -1) {
                PlayerScreen(
                    surah = LocalRepository.surahs.find { it.number == playing },
                    onClose = { playing = -1 },
                )
            }
        }
    }
}
