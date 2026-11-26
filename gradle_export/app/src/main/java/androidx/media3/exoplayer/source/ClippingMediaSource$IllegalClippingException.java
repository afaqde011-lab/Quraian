package androidx.media3.exoplayer.source;

import java.io.IOException;
import ta.c0;

public final class ClippingMediaSource$IllegalClippingException extends IOException {
    public ClippingMediaSource$IllegalClippingException(int i10) {
        this(i10, -9223372036854775807L, -9223372036854775807L);
    }

    public ClippingMediaSource$IllegalClippingException(int i10, long j9, long j10) {
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i10 != 0) {
            if (i10 == 1) {
                str = "not seekable to start";
            } else if (i10 != 2) {
                str = "unknown";
            } else {
                c0.A((j9 == -9223372036854775807L || j10 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j9 + ", End time: " + j10;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
        super(sb2.toString());
    }
}
