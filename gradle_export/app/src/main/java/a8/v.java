package a8;

public class v implements d0 {

    public final int f308a;

    public final long f309b;

    public final Object f310c;

    public v(long j9) {
        this(j9, 0L);
        this.f308a = 1;
    }

    public v(long j9, long j10) {
        this.f308a = 1;
        this.f309b = j9;
        e0 e0Var = j10 == 0 ? e0.f252c : new e0(0L, j10);
        this.f310c = new c0(e0Var, e0Var);
    }

    public v(Object obj, long j9, int i10) {
        this.f308a = i10;
        this.f310c = obj;
        this.f309b = j9;
    }

    @Override
    public final boolean b() {
        switch (this.f308a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override
    public final c0 d(long j9) {
        switch (this.f308a) {
            case 0:
                w wVar = (w) this.f310c;
                wVar.f321k.getClass();
                l9.f0 f0Var = wVar.f321k;
                long[] jArr = (long[]) f0Var.B;
                long[] jArr2 = (long[]) f0Var.C;
                int iE = e7.i0.e(jArr, e7.i0.i((((long) wVar.f315e) * j9) / 1000000, 0L, wVar.f320j - 1), false);
                long j10 = iE == -1 ? 0L : jArr[iE];
                long j11 = iE != -1 ? jArr2[iE] : 0L;
                int i10 = wVar.f315e;
                long j12 = (j10 * 1000000) / ((long) i10);
                long j13 = this.f309b;
                e0 e0Var = new e0(j12, j11 + j13);
                if (j12 == j9 || iE == jArr.length - 1) {
                    return new c0(e0Var, e0Var);
                }
                int i11 = iE + 1;
                return new c0(e0Var, new e0((jArr[i11] * 1000000) / ((long) i10), j13 + jArr2[i11]));
            case 1:
                return (c0) this.f310c;
            default:
                c8.b bVar = (c8.b) this.f310c;
                c0 c0VarB = bVar.f2984i[0].b(j9);
                int i12 = 1;
                while (true) {
                    c8.e[] eVarArr = bVar.f2984i;
                    if (i12 >= eVarArr.length) {
                        return c0VarB;
                    }
                    c0 c0VarB2 = eVarArr[i12].b(j9);
                    if (c0VarB2.f236a.f254b < c0VarB.f236a.f254b) {
                        c0VarB = c0VarB2;
                    }
                    i12++;
                }
                break;
        }
    }

    @Override
    public final long f() {
        switch (this.f308a) {
            case 0:
                return ((w) this.f310c).b();
            case 1:
                return this.f309b;
            default:
                return this.f309b;
        }
    }
}
