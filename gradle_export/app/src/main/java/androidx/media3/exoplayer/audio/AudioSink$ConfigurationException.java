package androidx.media3.exoplayer.audio;

import androidx.media3.common.t;

public final class AudioSink$ConfigurationException extends Exception {
    public final t A;

    public AudioSink$ConfigurationException(Exception exc, t tVar) {
        super(exc);
        this.A = tVar;
    }

    public AudioSink$ConfigurationException(String str, t tVar) {
        super(str);
        this.A = tVar;
    }
}
