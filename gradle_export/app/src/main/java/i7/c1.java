package i7;

import android.os.SystemClock;
import androidx.media3.common.k2;
import androidx.media3.exoplayer.ExoPlaybackException;
import fh.d2;
import java.util.List;

public final class c1 {

    public static final s7.a0 f7246u = new s7.a0(new Object());

    public final k2 f7247a;

    public final s7.a0 f7248b;

    public final long f7249c;

    public final long f7250d;

    public final int f7251e;

    public final ExoPlaybackException f7252f;

    public final boolean f7253g;

    public final s7.l1 f7254h;

    public final v7.u f7255i;

    public final List f7256j;

    public final s7.a0 f7257k;
    public final boolean l;
    public final int m;

    public final int f7258n;

    public final androidx.media3.common.z0 f7259o;

    public final boolean f7260p;

    public volatile long f7261q;

    public volatile long f7262r;

    public volatile long f7263s;

    public volatile long f7264t;

    public c1(k2 k2Var, s7.a0 a0Var, long j9, long j10, int i10, ExoPlaybackException exoPlaybackException, boolean z10, s7.l1 l1Var, v7.u uVar, List list, s7.a0 a0Var2, boolean z11, int i11, int i12, androidx.media3.common.z0 z0Var, long j11, long j12, long j13, long j14, boolean z12) {
        this.f7247a = k2Var;
        this.f7248b = a0Var;
        this.f7249c = j9;
        this.f7250d = j10;
        this.f7251e = i10;
        this.f7252f = exoPlaybackException;
        this.f7253g = z10;
        this.f7254h = l1Var;
        this.f7255i = uVar;
        this.f7256j = list;
        this.f7257k = a0Var2;
        this.l = z11;
        this.m = i11;
        this.f7258n = i12;
        this.f7259o = z0Var;
        this.f7261q = j11;
        this.f7262r = j12;
        this.f7263s = j13;
        this.f7264t = j14;
        this.f7260p = z12;
    }

    public static c1 k(v7.u uVar) {
        k2 k2Var = k2.EMPTY;
        s7.l1 l1Var = s7.l1.f13708d;
        d2 d2Var = d2.E;
        androidx.media3.common.z0 z0Var = androidx.media3.common.z0.f1685d;
        s7.a0 a0Var = f7246u;
        return new c1(k2Var, a0Var, -9223372036854775807L, 0L, 1, null, false, l1Var, uVar, d2Var, a0Var, false, 1, 0, z0Var, 0L, 0L, 0L, 0L, false);
    }

    public final c1 a() {
        return new c1(this.f7247a, this.f7248b, this.f7249c, this.f7250d, this.f7251e, this.f7252f, this.f7253g, this.f7254h, this.f7255i, this.f7256j, this.f7257k, this.l, this.m, this.f7258n, this.f7259o, this.f7261q, this.f7262r, l(), SystemClock.elapsedRealtime(), this.f7260p);
    }

    public final c1 b(boolean z10) {
        return new c1(this.f7247a, this.f7248b, this.f7249c, this.f7250d, this.f7251e, this.f7252f, z10, this.f7254h, this.f7255i, this.f7256j, this.f7257k, this.l, this.m, this.f7258n, this.f7259o, this.f7261q, this.f7262r, this.f7263s, this.f7264t, this.f7260p);
    }

    public final c1 c(s7.a0 a0Var) {
        return new c1(this.f7247a, this.f7248b, this.f7249c, this.f7250d, this.f7251e, this.f7252f, this.f7253g, this.f7254h, this.f7255i, this.f7256j, a0Var, this.l, this.m, this.f7258n, this.f7259o, this.f7261q, this.f7262r, this.f7263s, this.f7264t, this.f7260p);
    }

    public final c1 d(s7.a0 a0Var, long j9, long j10, long j11, long j12, s7.l1 l1Var, v7.u uVar, List list) {
        return new c1(this.f7247a, a0Var, j10, j11, this.f7251e, this.f7252f, this.f7253g, l1Var, uVar, list, this.f7257k, this.l, this.m, this.f7258n, this.f7259o, this.f7261q, j12, j9, SystemClock.elapsedRealtime(), this.f7260p);
    }

    public final c1 e(int i10, int i11, boolean z10) {
        return new c1(this.f7247a, this.f7248b, this.f7249c, this.f7250d, this.f7251e, this.f7252f, this.f7253g, this.f7254h, this.f7255i, this.f7256j, this.f7257k, z10, i10, i11, this.f7259o, this.f7261q, this.f7262r, this.f7263s, this.f7264t, this.f7260p);
    }

    public final c1 f(ExoPlaybackException exoPlaybackException) {
        return new c1(this.f7247a, this.f7248b, this.f7249c, this.f7250d, this.f7251e, exoPlaybackException, this.f7253g, this.f7254h, this.f7255i, this.f7256j, this.f7257k, this.l, this.m, this.f7258n, this.f7259o, this.f7261q, this.f7262r, this.f7263s, this.f7264t, this.f7260p);
    }

    public final c1 g(androidx.media3.common.z0 z0Var) {
        return new c1(this.f7247a, this.f7248b, this.f7249c, this.f7250d, this.f7251e, this.f7252f, this.f7253g, this.f7254h, this.f7255i, this.f7256j, this.f7257k, this.l, this.m, this.f7258n, z0Var, this.f7261q, this.f7262r, this.f7263s, this.f7264t, this.f7260p);
    }

    public final c1 h(int i10) {
        return new c1(this.f7247a, this.f7248b, this.f7249c, this.f7250d, i10, this.f7252f, this.f7253g, this.f7254h, this.f7255i, this.f7256j, this.f7257k, this.l, this.m, this.f7258n, this.f7259o, this.f7261q, this.f7262r, this.f7263s, this.f7264t, this.f7260p);
    }

    public final c1 i(boolean z10) {
        return new c1(this.f7247a, this.f7248b, this.f7249c, this.f7250d, this.f7251e, this.f7252f, this.f7253g, this.f7254h, this.f7255i, this.f7256j, this.f7257k, this.l, this.m, this.f7258n, this.f7259o, this.f7261q, this.f7262r, this.f7263s, this.f7264t, z10);
    }

    public final c1 j(k2 k2Var) {
        return new c1(k2Var, this.f7248b, this.f7249c, this.f7250d, this.f7251e, this.f7252f, this.f7253g, this.f7254h, this.f7255i, this.f7256j, this.f7257k, this.l, this.m, this.f7258n, this.f7259o, this.f7261q, this.f7262r, this.f7263s, this.f7264t, this.f7260p);
    }

    public final long l() {
        long j9;
        long j10;
        if (!m()) {
            return this.f7263s;
        }
        do {
            j9 = this.f7264t;
            j10 = this.f7263s;
        } while (j9 != this.f7264t);
        return e7.i0.H(e7.i0.W(j10) + ((long) ((SystemClock.elapsedRealtime() - j9) * this.f7259o.f1688a)));
    }

    public final boolean m() {
        return this.f7251e == 3 && this.l && this.f7258n == 0;
    }
}
