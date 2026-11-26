package t8;

import a8.c0;
import a8.e0;
import e7.i0;

public final class g implements f {

    public final long[] f14403a;

    public final long[] f14404b;

    public final long f14405c;

    public final long f14406d;

    public final int f14407e;

    public g(long[] jArr, long[] jArr2, long j9, long j10, long j11, int i10) {
        this.f14403a = jArr;
        this.f14404b = jArr2;
        this.f14405c = j9;
        this.f14406d = j11;
        this.f14407e = i10;
    }

    @Override
    public final long a() {
        return this.f14406d;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final long c(long j9) {
        return this.f14403a[i0.e(this.f14404b, j9, true)];
    }

    @Override
    public final c0 d(long j9) {
        long[] jArr = this.f14403a;
        int iE = i0.e(jArr, j9, true);
        long j10 = jArr[iE];
        long[] jArr2 = this.f14404b;
        e0 e0Var = new e0(j10, jArr2[iE]);
        if (j10 >= j9 || iE == jArr.length - 1) {
            return new c0(e0Var, e0Var);
        }
        int i10 = iE + 1;
        return new c0(e0Var, new e0(jArr[i10], jArr2[i10]));
    }

    @Override
    public final int e() {
        return this.f14407e;
    }

    @Override
    public final long f() {
        return this.f14405c;
    }
}
