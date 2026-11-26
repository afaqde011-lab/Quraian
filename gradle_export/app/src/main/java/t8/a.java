package t8;

import a8.c0;
import a8.d0;
import a8.e0;

public final class a implements f, d0 {

    public final long f14372a;

    public final long f14373b;

    public final int f14374c;

    public final long f14375d;

    public final int f14376e;

    public final long f14377f;

    public final boolean f14378g;

    public final long f14379h;

    public final int f14380i;

    public final int f14381j;

    public final boolean f14382k;
    public final long l;

    public a(long j9, long j10, int i10, int i11, boolean z10) {
        this.f14372a = j9;
        this.f14373b = j10;
        this.f14374c = i11 == -1 ? 1 : i11;
        this.f14376e = i10;
        this.f14378g = z10;
        if (j9 == -1) {
            this.f14375d = -1L;
            this.f14377f = -9223372036854775807L;
        } else {
            long j11 = j9 - j10;
            this.f14375d = j11;
            this.f14377f = (Math.max(0L, j11) * 8000000) / ((long) i10);
        }
        this.f14379h = j10;
        this.f14380i = i10;
        this.f14381j = i11;
        this.f14382k = z10;
        this.l = j9 == -1 ? -1L : j9;
    }

    @Override
    public final long a() {
        return this.l;
    }

    @Override
    public final boolean b() {
        return this.f14375d != -1 || this.f14378g;
    }

    @Override
    public final long c(long j9) {
        return (Math.max(0L, j9 - this.f14373b) * 8000000) / ((long) this.f14376e);
    }

    @Override
    public final c0 d(long j9) {
        long j10 = this.f14375d;
        long j11 = this.f14373b;
        if (j10 == -1 && !this.f14378g) {
            e0 e0Var = new e0(0L, j11);
            return new c0(e0Var, e0Var);
        }
        int i10 = this.f14376e;
        long j12 = this.f14374c;
        long jMin = (((((long) i10) * j9) / 8000000) / j12) * j12;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j12);
        }
        long jMax = Math.max(jMin, 0L) + j11;
        long jMax2 = (Math.max(0L, jMax - j11) * 8000000) / ((long) i10);
        e0 e0Var2 = new e0(jMax2, jMax);
        if (j10 != -1 && jMax2 < j9) {
            long j13 = jMax + j12;
            if (j13 < this.f14372a) {
                return new c0(e0Var2, new e0((Math.max(0L, j13 - j11) * 8000000) / ((long) i10), j13));
            }
        }
        return new c0(e0Var2, e0Var2);
    }

    @Override
    public final int e() {
        return this.f14380i;
    }

    @Override
    public final long f() {
        return this.f14377f;
    }
}
