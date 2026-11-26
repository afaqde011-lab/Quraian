package androidx.media3.common.audio;

import c7.k;

public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(k kVar) {
        this("Unhandled input format:", kVar);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, k kVar) {
        super(str + " " + kVar);
    }
}
