package k9;

import android.os.Bundle;
import java.util.Objects;

public final class c4 {

    public static final androidx.media3.common.e1 f9243k;
    public static final c4 l;
    public static final String m;

    public static final String f9244n;

    public static final String f9245o;

    public static final String f9246p;

    public static final String f9247q;

    public static final String f9248r;

    public static final String f9249s;

    public static final String f9250t;

    public static final String f9251u;

    public static final String f9252v;

    public final androidx.media3.common.e1 f9253a;

    public final boolean f9254b;

    public final long f9255c;

    public final long f9256d;

    public final long f9257e;

    public final int f9258f;

    public final long f9259g;

    public final long f9260h;

    public final long f9261i;

    public final long f9262j;

    static {
        androidx.media3.common.e1 e1Var = new androidx.media3.common.e1(null, 0, null, null, 0, 0L, 0L, -1, -1);
        f9243k = e1Var;
        l = new c4(e1Var, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        String str = e7.i0.f5136a;
        m = Integer.toString(0, 36);
        f9244n = Integer.toString(1, 36);
        f9245o = Integer.toString(2, 36);
        f9246p = Integer.toString(3, 36);
        f9247q = Integer.toString(4, 36);
        f9248r = Integer.toString(5, 36);
        f9249s = Integer.toString(6, 36);
        f9250t = Integer.toString(7, 36);
        f9251u = Integer.toString(8, 36);
        f9252v = Integer.toString(9, 36);
    }

    public c4(androidx.media3.common.e1 e1Var, boolean z10, long j9, long j10, long j11, int i10, long j12, long j13, long j14, long j15) {
        ta.c0.s(z10 == (e1Var.f1189h != -1));
        this.f9253a = e1Var;
        this.f9254b = z10;
        this.f9255c = j9;
        this.f9256d = j10;
        this.f9257e = j11;
        this.f9258f = i10;
        this.f9259g = j12;
        this.f9260h = j13;
        this.f9261i = j14;
        this.f9262j = j15;
    }

    public static c4 b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(m);
        return new c4(bundle2 == null ? f9243k : androidx.media3.common.e1.c(bundle2), bundle.getBoolean(f9244n, false), bundle.getLong(f9245o, -9223372036854775807L), bundle.getLong(f9246p, -9223372036854775807L), bundle.getLong(f9247q, 0L), bundle.getInt(f9248r, 0), bundle.getLong(f9249s, 0L), bundle.getLong(f9250t, -9223372036854775807L), bundle.getLong(f9251u, -9223372036854775807L), bundle.getLong(f9252v, 0L));
    }

    public final c4 a(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new c4(this.f9253a.b(z10, z11), z10 && this.f9254b, this.f9255c, z10 ? this.f9256d : -9223372036854775807L, z10 ? this.f9257e : 0L, z10 ? this.f9258f : 0, z10 ? this.f9259g : 0L, z10 ? this.f9260h : -9223372036854775807L, z10 ? this.f9261i : -9223372036854775807L, z10 ? this.f9262j : 0L);
    }

    public final Bundle c(int i10) {
        Bundle bundle = new Bundle();
        androidx.media3.common.e1 e1Var = this.f9253a;
        if (i10 < 3 || !f9243k.a(e1Var)) {
            bundle.putBundle(m, e1Var.d(i10));
        }
        boolean z10 = this.f9254b;
        if (z10) {
            bundle.putBoolean(f9244n, z10);
        }
        long j9 = this.f9255c;
        if (j9 != -9223372036854775807L) {
            bundle.putLong(f9245o, j9);
        }
        long j10 = this.f9256d;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f9246p, j10);
        }
        long j11 = this.f9257e;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f9247q, j11);
        }
        int i11 = this.f9258f;
        if (i11 != 0) {
            bundle.putInt(f9248r, i11);
        }
        long j12 = this.f9259g;
        if (j12 != 0) {
            bundle.putLong(f9249s, j12);
        }
        long j13 = this.f9260h;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f9250t, j13);
        }
        long j14 = this.f9261i;
        if (j14 != -9223372036854775807L) {
            bundle.putLong(f9251u, j14);
        }
        long j15 = this.f9262j;
        if (i10 >= 3 && j15 == 0) {
            return bundle;
        }
        bundle.putLong(f9252v, j15);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4.class == obj.getClass()) {
            c4 c4Var = (c4) obj;
            if (this.f9255c == c4Var.f9255c && this.f9253a.equals(c4Var.f9253a) && this.f9254b == c4Var.f9254b && this.f9256d == c4Var.f9256d && this.f9257e == c4Var.f9257e && this.f9258f == c4Var.f9258f && this.f9259g == c4Var.f9259g && this.f9260h == c4Var.f9260h && this.f9261i == c4Var.f9261i && this.f9262j == c4Var.f9262j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9253a, Boolean.valueOf(this.f9254b));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        androidx.media3.common.e1 e1Var = this.f9253a;
        sb2.append(e1Var.f1183b);
        sb2.append(", periodIndex=");
        sb2.append(e1Var.f1186e);
        sb2.append(", positionMs=");
        sb2.append(e1Var.f1187f);
        sb2.append(", contentPositionMs=");
        sb2.append(e1Var.f1188g);
        sb2.append(", adGroupIndex=");
        sb2.append(e1Var.f1189h);
        sb2.append(", adIndexInAdGroup=");
        sb2.append(e1Var.f1190i);
        sb2.append("}, isPlayingAd=");
        sb2.append(this.f9254b);
        sb2.append(", eventTimeMs=");
        sb2.append(this.f9255c);
        sb2.append(", durationMs=");
        sb2.append(this.f9256d);
        sb2.append(", bufferedPositionMs=");
        sb2.append(this.f9257e);
        sb2.append(", bufferedPercentage=");
        sb2.append(this.f9258f);
        sb2.append(", totalBufferedDurationMs=");
        sb2.append(this.f9259g);
        sb2.append(", currentLiveOffsetMs=");
        sb2.append(this.f9260h);
        sb2.append(", contentDurationMs=");
        sb2.append(this.f9261i);
        sb2.append(", contentBufferedPositionMs=");
        return a1.b.k(this.f9262j, "}", sb2);
    }
}
