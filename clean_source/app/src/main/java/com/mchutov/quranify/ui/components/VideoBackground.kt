package com.mchutov.quranify.ui.components

import android.net.Uri
import android.widget.VideoView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

/**
 * Plays a looping, silent video from app assets as a background.
 * Asset path: videos/background/<assetName>
 */
@Composable
fun VideoBackground(assetName: String, modifier: Modifier = Modifier) {
    AndroidView(
        factory = { context ->
            VideoView(context).apply {
                val path = "file:///android_asset/videos/background/$assetName"
                setVideoURI(Uri.parse(path))
                setOnPreparedListener { player ->
                    player.isLooping = true
                    player.setVolume(0f, 0f)
                    start()
                }
            }
        },
        update = { view ->
            val path = "file:///android_asset/videos/background/$assetName"
            view.setVideoURI(Uri.parse(path))
            view.setOnPreparedListener { player ->
                player.isLooping = true
                player.setVolume(0f, 0f)
                view.start()
            }
        },
        modifier = modifier,
    )
}
