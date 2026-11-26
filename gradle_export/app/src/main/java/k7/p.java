package k7;

import android.media.AudioTrack;
import com.google.android.gms.cast.framework.media.NotificationOptions;

public final class p {

    public final o f9120a;

    public final int f9121b;

    public final gi.c f9122c;

    public int f9123d;

    public long f9124e;

    public long f9125f;

    public long f9126g;

    public long f9127h;

    public long f9128i;

    public p(AudioTrack audioTrack, gi.c cVar) {
        this.f9120a = new o(audioTrack);
        this.f9121b = audioTrack.getSampleRate();
        this.f9122c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.f9123d = i10;
        if (i10 == 0) {
            this.f9126g = 0L;
            this.f9127h = -1L;
            this.f9128i = -9223372036854775807L;
            this.f9124e = System.nanoTime() / 1000;
            this.f9125f = NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
            return;
        }
        if (i10 == 1) {
            this.f9125f = NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f9125f = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f9125f = 500000L;
        }
    }
}
