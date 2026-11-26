package s7;

public final class k1 implements y, x {
    public final y A;
    public final long B;
    public x C;

    public k1(y yVar, long j9) {
        this.A = yVar;
        this.B = j9;
    }

    @Override
    public final void a(y yVar) {
        x xVar = this.C;
        xVar.getClass();
        xVar.a(this);
    }

    @Override
    public final long c(long j9, i7.l1 l1Var) {
        long j10 = this.B;
        return this.A.c(j9 - j10, l1Var) + j10;
    }

    @Override
    public final void d(c1 c1Var) {
        x xVar = this.C;
        xVar.getClass();
        xVar.d(this);
    }

    @Override
    public final boolean e(i7.m0 m0Var) {
        i7.l0 l0Var = new i7.l0();
        long j9 = m0Var.f7421a;
        l0Var.f7413b = m0Var.f7422b;
        l0Var.f7414c = m0Var.f7423c;
        l0Var.f7412a = j9 - this.B;
        return this.A.e(new i7.m0(l0Var));
    }

    @Override
    public final long g() {
        long jG = this.A.g();
        if (jG == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jG + this.B;
    }

    @Override
    public final long i(v7.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j9) {
        a1[] a1VarArr2 = new a1[a1VarArr.length];
        int i10 = 0;
        while (true) {
            a1 a1Var = null;
            if (i10 >= a1VarArr.length) {
                break;
            }
            j1 j1Var = (j1) a1VarArr[i10];
            if (j1Var != null) {
                a1Var = j1Var.A;
            }
            a1VarArr2[i10] = a1Var;
            i10++;
        }
        y yVar = this.A;
        long j10 = this.B;
        long jI = yVar.i(rVarArr, zArr, a1VarArr2, zArr2, j9 - j10);
        for (int i11 = 0; i11 < a1VarArr.length; i11++) {
            a1 a1Var2 = a1VarArr2[i11];
            if (a1Var2 == null) {
                a1VarArr[i11] = null;
            } else {
                a1 a1Var3 = a1VarArr[i11];
                if (a1Var3 == null || ((j1) a1Var3).A != a1Var2) {
                    a1VarArr[i11] = new j1(a1Var2, j10);
                }
            }
        }
        return jI + j10;
    }

    @Override
    public final boolean isLoading() {
        return this.A.isLoading();
    }

    @Override
    public final void j() {
        this.A.j();
    }

    @Override
    public final long k(long j9) {
        long j10 = this.B;
        return this.A.k(j9 - j10) + j10;
    }

    @Override
    public final void m(x xVar, long j9) {
        this.C = xVar;
        this.A.m(this, j9 - this.B);
    }

    @Override
    public final void o(boolean z10, long j9) {
        this.A.o(z10, j9 - this.B);
    }

    @Override
    public final long p() {
        long jP = this.A.p();
        if (jP == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jP + this.B;
    }

    @Override
    public final l1 s() {
        return this.A.s();
    }

    @Override
    public final long t() {
        long jT = this.A.t();
        if (jT == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jT + this.B;
    }

    @Override
    public final void v(long j9) {
        this.A.v(j9 - this.B);
    }
}
