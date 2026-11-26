package androidx.media3.exoplayer.audio;

import androidx.media3.common.t;
import g4.c;

public final class AudioSink$WriteException extends Exception {
    public final int A;
    public final boolean B;
    public final t C;

    public AudioSink$WriteException(int i10, t tVar, boolean z10) {
        super(c.f(i10, "AudioTrack write failed: "));
        this.B = z10;
        this.A = i10;
        this.C = tVar;
    }
}
