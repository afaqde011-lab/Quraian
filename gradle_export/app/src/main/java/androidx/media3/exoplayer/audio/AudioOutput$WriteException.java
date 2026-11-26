package androidx.media3.exoplayer.audio;

import g4.c;

public final class AudioOutput$WriteException extends Exception {
    public final int A;
    public final boolean B;

    public AudioOutput$WriteException(int i10, boolean z10) {
        super(c.f(i10, "AudioOutput write failed: "));
        this.B = z10;
        this.A = i10;
    }
}
