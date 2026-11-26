package j0;

import l0.o0;
import l0.p0;

public final class k extends f5.c {
    public final i C;
    public final o0 D;
    public final long E;
    public final boolean F;
    public final o0 G;
    public final int H;
    public final int I;
    public final b2.c J;
    public final b2.h K;
    public final int L;
    public final int M;
    public final long N;
    public final v O;

    public k(long j9, boolean z10, i iVar, o0 o0Var, int i10, int i11, b2.c cVar, b2.h hVar, int i12, int i13, long j10, v vVar) {
        super(4);
        this.F = z10;
        this.G = o0Var;
        this.H = i10;
        this.I = i11;
        this.J = cVar;
        this.K = hVar;
        this.L = i12;
        this.M = i13;
        this.N = j10;
        this.O = vVar;
        this.C = iVar;
        this.D = o0Var;
        this.E = y3.b.b(0, z10 ? y3.a.h(j9) : Integer.MAX_VALUE, 0, z10 ? Integer.MAX_VALUE : y3.a.g(j9), 5);
    }

    @Override
    public final p0 H0(int i10, int i11, int i12, long j9) {
        return W0(i10, j9);
    }

    public final o W0(int i10, long j9) {
        i iVar = this.C;
        Object objB = iVar.b(i10);
        Object objJ = iVar.f7757b.j(i10);
        return new o(i10, K0(this.D, i10, j9), this.F, this.J, this.K, this.G.B.getLayoutDirection(), this.L, this.M, i10 == this.H + (-1) ? 0 : this.I, this.N, objB, objJ, this.O.f7829o, j9);
    }
}
