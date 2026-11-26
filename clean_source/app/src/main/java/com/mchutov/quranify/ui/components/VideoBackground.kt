package com.mchutov.quranify.ui.components

import android.widget.VideoView
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

/**
 * Looping, silent MP4 background from assets/videos/background/.
 * Recreated only when the asset changes. Failures are ignored so the
 * app never hangs or crashes if a device cannot decode the video.
 */
@Composable
fun VideoBackground(assetName: String, modifier: Modifier = Modifier) {
    key(assetName) {
        AndroidView(
            modifier = modifier,
            factory = { context ->
                VideoView(context)
            },
            update = { view ->
                try {
                    val descriptor = view.context.assets.openFd("videos/background/$assetName")
                    try {
                        view.setDataSource(
                            descriptor.fileDescriptor,
                            descriptor.startOffset,
                            descriptor.length,
                        )
                    } finally {
                        descriptor.close()
                    }
                    view.setOnPreparedListener { player ->
                        player.isLooping = true
                        player.setVolume(0f, 0f)
                        view.start()
                    }
                    view.setOnErrorListener { _, _, _ -> true }
                } catch (_: Exception) {
                    // Keep the static blue background if video cannot be opened.
                }
            },
        )
    }
}
