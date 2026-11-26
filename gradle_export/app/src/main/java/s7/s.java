package s7;

public final class s implements y, x {
    public final a0 A;
    public final long B;
    public final a1.i C;
    public a D;
    public y E;
    public x F;
    public long G = -9223372036854775807L;

    public s(a0 a0Var, a1.i iVar, long j9) {
        this.A = a0Var;
        this.C = iVar;
        this.B = j9;
    }

    @Override
    public final void a(y yVar) {
        x xVar = this.F;
        String str = e7.i0.f5136a;
        xVar.a(this);
    }

    public final void b(a0 a0Var) {
        long j9 = this.G;
        if (j9 == -9223372036854775807L) {
            j9 = this.B;
        }
        a aVar = this.D;
        aVar.getClass();
        y yVarB = aVar.b(a0Var, this.C, j9);
        this.E = yVarB;
        if (this.F != null) {
            yVarB.m(this, j9);
        }
    }

    @Override
    public final long c(long j9, i7.l1 l1Var) {
        y yVar = this.E;
        String str = e7.i0.f5136a;
        return yVar.c(j9, l1Var);
    }

    @Override
    public final void d(c1 c1Var) {
        x xVar = this.F;
        String str = e7.i0.f5136a;
        xVar.d(this);
    }

    @Override
    public final boolean e(i7.m0 m0Var) {
        y yVar = this.E;
        return yVar != null && yVar.e(m0Var);
    }

    @Override
    public final long g() {
        y yVar = this.E;
        String str = e7.i0.f5136a;
        return yVar.g();
    }

    @Override
    public final long i(v7.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j9) {
        long j10 = this.G;
        if (j10 != -9223372036854775807L && j9 == this.B) {
            j9 = j10;
        }
        this.G = -9223372036854775807L;
        y yVar = this.E;
        String str = e7.i0.f5136a;
        return yVar.i(rVarArr, zArr, a1VarArr, zArr2, j9);
    }

    @Override
    public final boolean isLoading() {
        y yVar = this.E;
        return yVar != null && yVar.isLoading();
    }

    @Override
    public final void j() {
        y yVar = this.E;
        if (yVar != null) {
            yVar.j();
            return;
        }
        a aVar = this.D;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override
    public final long k(long j9) {
        y yVar = this.E;
        String str = e7.i0.f5136a;
        return yVar.k(j9);
    }

    @Override
    public final void m(x xVar, long j9) {
        this.F = xVar;
        y yVar = this.E;
        if (yVar != null) {
            long j10 = this.G;
            if (j10 == -9223372036854775807L) {
                j10 = this.B;
            }
            yVar.m(this, j10);
        }
    }

    @Override
    public final void o(boolean z10, long j9) {
        y yVar = this.E;
        String str = e7.i0.f5136a;
        yVar.o(z10, j9);
    }

    @Override
    public final long p() {
        y yVar = this.E;
        String str = e7.i0.f5136a;
        return yVar.p();
    }

    @Override
    public final l1 s() {
        y yVar = this.E;
        String str = e7.i0.f5136a;
        return yVar.s();
    }

    @Override
    public final long t() {
        y yVar = this.E;
        String str = e7.i0.f5136a;
        return yVar.t();
    }

    @Override
    public final void v(long j9) {
        y yVar = this.E;
        String str = e7.i0.f5136a;
        yVar.v(j9);
    }
}
