package com.mchutov.quranify.audio

import android.content.Context
import android.media.MediaPlayer

/** Simple looped sound-effect player for MP3 files in assets/audio/. */
object SoundPlayer {
    private var player: MediaPlayer? = null

    fun play(context: Context, asset: String) {
        stop()
        val descriptor = context.assets.openFd("audio/$asset")
        try {
            player = MediaPlayer().apply {
                setDataSource(descriptor.fileDescriptor, descriptor.startOffset, descriptor.length)
                isLooping = true
                setVolume(0.6f, 0.6f)
                prepare()
                start()
            }
        } finally {
            descriptor.close()
        }
    }

    fun stop() {
        player?.let {
            try {
                if (it.isPlaying) it.stop()
            } finally {
                it.release()
            }
        }
        player = null
    }
}
