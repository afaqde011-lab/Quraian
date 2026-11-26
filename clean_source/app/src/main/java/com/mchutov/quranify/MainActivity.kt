package com.mchutov.quranify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mchutov.quranify.ui.navigation.AppNavHost
import com.mchutov.quranify.ui.theme.QuranifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuranifyTheme {
                AppNavHost()
            }
        }
    }
}
