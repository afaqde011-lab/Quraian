package k7;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.media3.common.y1;
import java.lang.reflect.Method;
import java.math.RoundingMode;

public final class v {
    public boolean A;
    public long B;

    public final gi.c f9157a;

    public final e7.b0 f9158b;

    public final long[] f9159c;

    public final AudioTrack f9160d;

    public final int f9161e;

    public final long f9162f;

    public final boolean f9163g;

    public final p f9164h;

    public float f9165i;

    public long f9166j;

    public long f9167k;
    public long l;
    public Method m;

    public long f9168n;

    public long f9169o;

    public long f9170p;

    public long f9171q;

    public long f9172r;

    public int f9173s;

    public int f9174t;

    public long f9175u;

    public final long f9176v;

    public long f9177w;

    public long f9178x;

    public long f9179y;

    public long f9180z;

    public v(gi.c cVar, e7.b0 b0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        this.f9157a = cVar;
        this.f9158b = b0Var;
        this.f9160d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f9159c = new long[10];
        this.f9180z = -9223372036854775807L;
        this.f9179y = -9223372036854775807L;
        this.f9164h = new p(audioTrack, cVar);
        int sampleRate = audioTrack.getSampleRate();
        this.f9161e = sampleRate;
        boolean zD = e7.i0.D(i10);
        this.f9163g = zD;
        this.f9162f = zD ? e7.i0.O(sampleRate, i12 / i11) : -9223372036854775807L;
        this.f9171q = 0L;
        this.f9172r = 0L;
        this.A = false;
        this.B = 0L;
        this.f9175u = -9223372036854775807L;
        this.f9176v = -9223372036854775807L;
        this.f9169o = 0L;
        this.f9168n = 0L;
        this.f9165i = 1.0f;
        this.f9166j = -9223372036854775807L;
    }

    public final long a() {
        if (this.f9175u != -9223372036854775807L) {
            return Math.min(this.f9178x, c());
        }
        this.f9158b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f9170p >= 5) {
            AudioTrack audioTrack = this.f9160d;
            if (audioTrack.getPlayState() != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                long j9 = this.f9171q;
                if (j9 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j9;
                        this.A = false;
                    } else {
                        this.f9172r++;
                    }
                }
                this.f9171q = playbackHeadPosition;
            }
            this.f9170p = jElapsedRealtime;
        }
        return this.f9171q + this.B + (this.f9172r << 32);
    }

    public final long b(long j9) {
        long jU;
        int i10 = this.f9174t;
        int i11 = this.f9161e;
        if (i10 == 0) {
            jU = this.f9175u != -9223372036854775807L ? e7.i0.O(i11, c()) : e7.i0.O(i11, a());
        } else {
            jU = e7.i0.u(this.f9165i, j9 + this.f9167k);
        }
        long jMax = Math.max(0L, jU - this.f9168n);
        return this.f9175u != -9223372036854775807L ? Math.min(e7.i0.O(i11, this.f9178x), jMax) : jMax;
    }

    public final long c() {
        if (this.f9160d.getPlayState() == 2) {
            return this.f9177w;
        }
        this.f9158b.getClass();
        return this.f9177w + e7.i0.Q(e7.i0.u(this.f9165i, e7.i0.H(SystemClock.elapsedRealtime()) - this.f9175u), this.f9161e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j9) {
        long j10 = this.f9166j;
        if (j10 == -9223372036854775807L || j9 < j10) {
            return;
        }
        long jX = e7.i0.x(this.f9165i, j9 - j10);
        this.f9158b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - e7.i0.W(jX);
        this.f9166j = -9223372036854775807L;
        ((s) this.f9157a.B).f9142i.f(-1, new y1(jCurrentTimeMillis));
    }
}
