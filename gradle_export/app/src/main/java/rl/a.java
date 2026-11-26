package rl;

import ab.a0;
import c4.b0;
import y3.k;
import y3.m;

public final class a implements b0 {
    public final int A;

    public a(int i) {
        e eVar = e.A;
        this.A = i;
    }

    public final long f(k anchorBounds, long j, m layoutDirection, long j2) {
        kotlin.jvm.internal.m.e(anchorBounds, "anchorBounds");
        kotlin.jvm.internal.m.e(layoutDirection, "layoutDirection");
        int iD = (anchorBounds.d() / 2) + anchorBounds.a;
        int i = (int) (j2 >> 32);
        int i2 = ((int) (j >> 32)) - i;
        if (i2 < 0) {
            i2 = 0;
        }
        int iY = a0.y(iD - (i / 2), 0, i2);
        int i3 = anchorBounds.b;
        int i4 = this.A;
        int i5 = (int) (j2 & 4294967295L);
        int i6 = (i3 - i4) - i5;
        int i7 = anchorBounds.d + i4;
        boolean z = i6 >= 0;
        boolean z2 = i5 + i7 <= ((int) (j & 4294967295L));
        e eVar = e.A;
        if (!z && z2) {
            i6 = i7;
        }
        return (((long) iY) << 32) | (((long) i6) & 4294967295L);
    }
}
