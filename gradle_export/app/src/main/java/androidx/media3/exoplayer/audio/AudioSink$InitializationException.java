package androidx.media3.exoplayer.audio;

import androidx.media3.common.t;
import com.google.protobuf.RuntimeVersion;
import oi.k;
import w.c;

public final class AudioSink$InitializationException extends Exception {
    public final boolean A;

    public AudioSink$InitializationException(int i10, int i11, int i12, int i13, t tVar, boolean z10, AudioOutputProvider$InitializationException audioOutputProvider$InitializationException) {
        StringBuilder sbP = k.p(i10, i11, "AudioTrack init failed 0 Config(", ", ", ", ");
        c.u(sbP, i12, ", ", i13, ") ");
        sbP.append(tVar);
        sbP.append(z10 ? " (recoverable)" : RuntimeVersion.SUFFIX);
        super(sbP.toString(), audioOutputProvider$InitializationException);
        this.A = z10;
    }
}
