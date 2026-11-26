package androidx.media3.common;

import android.util.Pair;
import java.util.Objects;

public final class s1 {

    public final Object f1539a;

    public final s2 f1540b;

    public final q0 f1541c;

    public final t0 f1542d;

    public final Object f1543e;

    public final k0 f1544f;

    public final long f1545g;

    public final long f1546h;

    public final long f1547i;

    public final boolean f1548j;

    public final boolean f1549k;
    public final long l;
    public final long m;

    public final long f1550n;

    public final boolean f1551o;

    public final fh.t0 f1552p;

    public final long[] f1553q;

    public s1(r1 r1Var) {
        int i10 = 0;
        if (r1Var.f1473f == null) {
            ta.c0.r("presentationStartTimeMs can only be set if liveConfiguration != null", r1Var.f1474g == -9223372036854775807L);
            ta.c0.r("windowStartTimeMs can only be set if liveConfiguration != null", r1Var.f1475h == -9223372036854775807L);
            ta.c0.r("elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null", r1Var.f1476i == -9223372036854775807L);
        } else {
            long j9 = r1Var.f1474g;
            if (j9 != -9223372036854775807L) {
                long j10 = r1Var.f1475h;
                if (j10 != -9223372036854775807L) {
                    ta.c0.r("windowStartTimeMs can't be less than presentationStartTimeMs", j10 >= j9);
                }
            }
        }
        int size = r1Var.f1481p.size();
        long j11 = r1Var.m;
        if (j11 != -9223372036854775807L) {
            ta.c0.r("defaultPositionUs can't be greater than durationUs", r1Var.l <= j11);
        }
        this.f1539a = r1Var.f1468a;
        this.f1540b = r1Var.f1469b;
        this.f1541c = r1Var.f1470c;
        this.f1542d = r1Var.f1471d;
        this.f1543e = r1Var.f1472e;
        this.f1544f = r1Var.f1473f;
        this.f1545g = r1Var.f1474g;
        this.f1546h = r1Var.f1475h;
        this.f1547i = r1Var.f1476i;
        this.f1548j = r1Var.f1477j;
        this.f1549k = r1Var.f1478k;
        this.l = r1Var.l;
        this.m = r1Var.m;
        long j12 = r1Var.f1479n;
        this.f1550n = j12;
        this.f1551o = r1Var.f1480o;
        fh.t0 t0Var = r1Var.f1481p;
        this.f1552p = t0Var;
        long[] jArr = new long[t0Var.size()];
        this.f1553q = jArr;
        if (t0Var.isEmpty()) {
            return;
        }
        jArr[0] = -j12;
        while (i10 < size - 1) {
            long[] jArr2 = this.f1553q;
            int i11 = i10 + 1;
            jArr2[i11] = jArr2[i10] + ((u1) this.f1552p.get(i10)).f1657b;
            i10 = i11;
        }
    }

    public static Object a(s1 s1Var, int i10) {
        Object obj = s1Var.f1539a;
        fh.t0 t0Var = s1Var.f1552p;
        return t0Var.isEmpty() ? obj : Pair.create(obj, ((u1) t0Var.get(i10)).f1656a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.f1539a.equals(s1Var.f1539a) && this.f1540b.equals(s1Var.f1540b) && this.f1541c.equals(s1Var.f1541c) && Objects.equals(this.f1542d, s1Var.f1542d) && Objects.equals(this.f1543e, s1Var.f1543e) && Objects.equals(this.f1544f, s1Var.f1544f) && this.f1545g == s1Var.f1545g && this.f1546h == s1Var.f1546h && this.f1547i == s1Var.f1547i && this.f1548j == s1Var.f1548j && this.f1549k == s1Var.f1549k && this.l == s1Var.l && this.m == s1Var.m && this.f1550n == s1Var.f1550n && this.f1551o == s1Var.f1551o && this.f1552p.equals(s1Var.f1552p);
    }

    public final int hashCode() {
        int iHashCode = (this.f1541c.hashCode() + ((this.f1540b.f1556a.hashCode() + ((this.f1539a.hashCode() + 217) * 31)) * 31)) * 31;
        t0 t0Var = this.f1542d;
        int iHashCode2 = (iHashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        Object obj = this.f1543e;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        k0 k0Var = this.f1544f;
        int iHashCode4 = (iHashCode3 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        long j9 = this.f1545g;
        int i10 = (iHashCode4 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f1546h;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f1547i;
        int i12 = (((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f1548j ? 1 : 0)) * 31) + (this.f1549k ? 1 : 0)) * 31;
        long j12 = this.l;
        int i13 = (i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.m;
        int i14 = (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f1550n;
        return this.f1552p.hashCode() + ((((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f1551o ? 1 : 0)) * 31);
    }
}
