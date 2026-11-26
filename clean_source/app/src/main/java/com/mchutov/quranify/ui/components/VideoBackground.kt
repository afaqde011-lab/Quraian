package com.mchutov.quranify.ui.components

import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.VideoView
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

/**
 * Plays a looping, silent MP4 from assets/videos/background/ as a background.
 * Uses AssetFileDescriptor (more reliable than file:// URI for Android assets)
 * and recreates the view only when the asset name changes.
 */
@Composable
fun VideoBackground(assetName: String, modifier: Modifier = Modifier) {
    key(assetName) {
        AndroidView(
            modifier = modifier,
            factory = { context ->
                VideoView(context).apply {
                    layoutParams = FrameLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT,
                    )
                    val descriptor = context.assets.openFd("videos/background/$assetName")
                    try {
                        setDataSource(
                            descriptor.fileDescriptor,
                            descriptor.startOffset,
                            descriptor.length,
                        )
                    } finally {
                        descriptor.close()
                    }
                    setOnPreparedListener { player ->
                        player.isLooping = true
                        player.setVolume(0f, 0f)
                        start()
                    }
                    setOnErrorListener { _, _, _ -> true }
                }
            },
        )
    }
}
