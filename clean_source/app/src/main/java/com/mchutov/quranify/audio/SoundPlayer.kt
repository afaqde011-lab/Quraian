package com.mchutov.quranify.audio

import android.content.Context
import android.media.MediaPlayer

/** Loopable sound-effect player for MP3 files in assets/audio/. */
object SoundPlayer {
    private var player: MediaPlayer? = null

    fun play(context: Context, asset: String) {
        stop()
        try {
            val descriptor = context.assets.openFd("audio/$asset")
            val mp = MediaPlayer()
            try {
                mp.setDataSource(descriptor.fileDescriptor, descriptor.startOffset, descriptor.length)
                mp.isLooping = true
                mp.setVolume(0.6f, 0.6f)
                // Async prepare keeps the main thread free (no ANR).
                mp.setOnPreparedListener { it.start() }
                mp.setOnErrorListener { _, _, _ -> true }
                mp.prepareAsync()
                player = mp
            } finally {
                descriptor.close()
            }
        } catch (e: Exception) {
            player?.release()
            player = null
        }
    }

    fun stop() {
        player?.let {
            try {
                if (it.isPlaying) it.stop()
            } catch (_: Exception) {
            } finally {
                try {
                    it.release()
                } catch (_: Exception) {
                }
            }
        }
        player = null
    }
}
