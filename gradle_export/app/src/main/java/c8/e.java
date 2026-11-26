package c8;

import a8.e0;
import a8.l0;
import e7.i0;
import java.math.RoundingMode;
import ta.c0;

public final class e {

    public final d f2999a;

    public final l0 f3000b;

    public final int f3001c;

    public final int f3002d;

    public final long f3003e;

    public int f3004f;

    public int f3005g;

    public int f3006h;

    public int f3007i;

    public int f3008j;

    public int f3009k;
    public long l;
    public long[] m;

    public int[] f3010n;

    public e(int i10, d dVar, l0 l0Var) {
        int i11 = dVar.f2996d;
        this.f2999a = dVar;
        int iA = dVar.a();
        boolean z10 = true;
        if (iA != 1 && iA != 2) {
            z10 = false;
        }
        c0.s(z10);
        int i12 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f3001c = (iA == 2 ? 1667497984 : 1651965952) | i12;
        long j9 = ((long) dVar.f2994b) * 1000000;
        long j10 = dVar.f2995c;
        String str = i0.f5136a;
        this.f3003e = i0.Q(i11, j9, j10, RoundingMode.DOWN);
        this.f3000b = l0Var;
        this.f3002d = iA == 2 ? i12 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.f3010n = new int[512];
        this.f3004f = i11;
    }

    public final e0 a(int i10) {
        return new e0(((this.f3003e * ((long) 1)) / ((long) this.f3004f)) * ((long) this.f3010n[i10]), this.m[i10]);
    }

    public final a8.c0 b(long j9) {
        if (this.f3009k == 0) {
            e0 e0Var = new e0(0L, this.l);
            return new a8.c0(e0Var, e0Var);
        }
        int i10 = (int) (j9 / ((this.f3003e * ((long) 1)) / ((long) this.f3004f)));
        int iD = i0.d(this.f3010n, i10, true, true);
        if (this.f3010n[iD] == i10) {
            e0 e0VarA = a(iD);
            return new a8.c0(e0VarA, e0VarA);
        }
        e0 e0VarA2 = a(iD);
        int i11 = iD + 1;
        return i11 < this.m.length ? new a8.c0(e0VarA2, a(i11)) : new a8.c0(e0VarA2, e0VarA2);
    }
}
