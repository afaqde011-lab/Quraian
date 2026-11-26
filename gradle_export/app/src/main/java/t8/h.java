package t8;

import a8.c0;
import a8.e0;
import e7.i0;

public final class h implements f {

    public final long f14408a;

    public final int f14409b;

    public final long f14410c;

    public final int f14411d;

    public final long f14412e;

    public final long f14413f;

    public final long[] f14414g;

    public h(long j9, int i10, long j10, int i11, long j11, long[] jArr) {
        this.f14408a = j9;
        this.f14409b = i10;
        this.f14410c = j10;
        this.f14411d = i11;
        this.f14412e = j11;
        this.f14414g = jArr;
        this.f14413f = j11 != -1 ? j9 + j11 : -1L;
    }

    @Override
    public final long a() {
        return this.f14413f;
    }

    @Override
    public final boolean b() {
        return this.f14414g != null;
    }

    @Override
    public final long c(long j9) {
        long j10 = j9 - this.f14408a;
        if (!b() || j10 <= this.f14409b) {
            return 0L;
        }
        long[] jArr = this.f14414g;
        jArr.getClass();
        double d3 = (j10 * 256.0d) / this.f14412e;
        int iE = i0.e(jArr, (long) d3, true);
        long j11 = this.f14410c;
        long j12 = (((long) iE) * j11) / 100;
        long j13 = jArr[iE];
        int i10 = iE + 1;
        long j14 = (j11 * ((long) i10)) / 100;
        long j15 = iE == 99 ? 256L : jArr[i10];
        return Math.round((j13 == j15 ? 0.0d : (d3 - j13) / (j15 - j13)) * (j14 - j12)) + j12;
    }

    @Override
    public final c0 d(long j9) {
        double d3;
        double d5;
        boolean zB = b();
        int i10 = this.f14409b;
        long j10 = this.f14408a;
        if (!zB) {
            e0 e0Var = new e0(0L, j10 + ((long) i10));
            return new c0(e0Var, e0Var);
        }
        long jI = i0.i(j9, 0L, this.f14410c);
        double d10 = (jI * 100.0d) / this.f14410c;
        double d11 = 0.0d;
        if (d10 <= 0.0d) {
            d3 = 256.0d;
        } else if (d10 >= 100.0d) {
            d3 = 256.0d;
            d11 = 256.0d;
        } else {
            int i11 = (int) d10;
            long[] jArr = this.f14414g;
            jArr.getClass();
            double d12 = jArr[i11];
            if (i11 == 99) {
                d3 = 256.0d;
                d5 = 256.0d;
            } else {
                d3 = 256.0d;
                d5 = jArr[i11 + 1];
            }
            d11 = ((d5 - d12) * (d10 - ((double) i11))) + d12;
        }
        long j11 = this.f14412e;
        e0 e0Var2 = new e0(jI, j10 + i0.i(Math.round((d11 / d3) * j11), i10, j11 - 1));
        return new c0(e0Var2, e0Var2);
    }

    @Override
    public final int e() {
        return this.f14411d;
    }

    @Override
    public final long f() {
        return this.f14410c;
    }
}
