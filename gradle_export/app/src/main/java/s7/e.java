package s7;

import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

public final class e extends p {

    public final long f13660b;

    public final long f13661c;

    public final long f13662d;

    public final boolean f13663e;

    public e(k2 k2Var, long j9, long j10, boolean z10) throws ClippingMediaSource$IllegalClippingException {
        super(k2Var);
        if (j10 != Long.MIN_VALUE && j10 < j9) {
            throw new ClippingMediaSource$IllegalClippingException(2, j9, j10);
        }
        boolean z11 = false;
        if (k2Var.getPeriodCount() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        j2 window = k2Var.getWindow(0, new j2());
        long jMax = Math.max(0L, j9);
        if (!z10 && !window.f1293k && jMax != 0 && !window.f1290h) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j10 == Long.MIN_VALUE ? window.m : Math.max(0L, j10);
        long j11 = window.m;
        if (j11 != -9223372036854775807L) {
            jMax2 = jMax2 > j11 ? j11 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f13660b = jMax;
        this.f13661c = jMax2;
        this.f13662d = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (window.f1291i && (jMax2 == -9223372036854775807L || (j11 != -9223372036854775807L && jMax2 == j11))) {
            z11 = true;
        }
        this.f13663e = z11;
    }

    @Override
    public final h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        this.f13728a.getPeriod(0, h2Var, z10);
        long j9 = h2Var.f1235e - this.f13660b;
        long j10 = this.f13662d;
        h2Var.i(h2Var.f1231a, h2Var.f1232b, 0, j10 != -9223372036854775807L ? j10 - j9 : -9223372036854775807L, j9);
        return h2Var;
    }

    @Override
    public final j2 getWindow(int i10, j2 j2Var, long j9) {
        this.f13728a.getWindow(0, j2Var, 0L);
        long j10 = j2Var.f1296p;
        long j11 = this.f13660b;
        j2Var.f1296p = j10 + j11;
        j2Var.m = this.f13662d;
        j2Var.f1291i = this.f13663e;
        long j12 = j2Var.l;
        if (j12 != -9223372036854775807L) {
            long jMax = Math.max(j12, j11);
            j2Var.l = jMax;
            long j13 = this.f13661c;
            if (j13 != -9223372036854775807L) {
                jMax = Math.min(jMax, j13);
            }
            j2Var.l = jMax - j11;
        }
        long jW = e7.i0.W(j11);
        long j14 = j2Var.f1287e;
        if (j14 != -9223372036854775807L) {
            j2Var.f1287e = j14 + jW;
        }
        long j15 = j2Var.f1288f;
        if (j15 != -9223372036854775807L) {
            j2Var.f1288f = j15 + jW;
        }
        return j2Var;
    }
}
