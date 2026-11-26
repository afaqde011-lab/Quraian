package t8;

import a8.c0;
import a8.e0;
import android.util.Pair;
import e7.i0;

public final class c implements f {

    public final long[] f14383a;

    public final long[] f14384b;

    public final long f14385c;

    public c(long j9, long[] jArr, long[] jArr2) {
        this.f14383a = jArr;
        this.f14384b = jArr2;
        this.f14385c = j9 == -9223372036854775807L ? i0.H(jArr2[jArr2.length - 1]) : j9;
    }

    public static Pair g(long j9, long[] jArr, long[] jArr2) {
        int iE = i0.e(jArr, j9, true);
        long j10 = jArr[iE];
        long j11 = jArr2[iE];
        int i10 = iE + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i10];
        return Pair.create(Long.valueOf(j9), Long.valueOf(((long) ((j12 == j10 ? 0.0d : (j9 - j10) / (j12 - j10)) * (jArr2[i10] - j11))) + j11));
    }

    @Override
    public final long a() {
        return -1L;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final long c(long j9) {
        return i0.H(((Long) g(j9, this.f14383a, this.f14384b).second).longValue());
    }

    @Override
    public final c0 d(long j9) {
        Pair pairG = g(i0.W(i0.i(j9, 0L, this.f14385c)), this.f14384b, this.f14383a);
        e0 e0Var = new e0(i0.H(((Long) pairG.first).longValue()), ((Long) pairG.second).longValue());
        return new c0(e0Var, e0Var);
    }

    @Override
    public final int e() {
        return -2147483647;
    }

    @Override
    public final long f() {
        return this.f14385c;
    }
}
