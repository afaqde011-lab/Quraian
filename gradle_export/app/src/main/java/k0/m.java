package k0;

import java.util.List;
import l0.f0;
import l0.o0;
import l0.p0;

public final class m extends f5.c {
    public final j C;
    public final o0 D;
    public final int E;
    public final o0 F;
    public final y G;
    public final int H;
    public final int I;
    public final long J;

    public m(j jVar, o0 o0Var, int i10, y yVar, int i11, int i12, long j9) {
        super(4);
        this.F = o0Var;
        this.G = yVar;
        this.H = i11;
        this.I = i12;
        this.J = j9;
        this.C = jVar;
        this.D = o0Var;
        this.E = i10;
    }

    @Override
    public final p0 H0(int i10, int i11, int i12, long j9) {
        return W0(i10, i11, i12, this.E, j9);
    }

    public final q W0(int i10, int i11, int i12, int i13, long j9) {
        int i14;
        j jVar = this.C;
        Object objB = jVar.b(i10);
        Object objJ = jVar.f8474b.j(i10);
        List listK0 = K0(this.D, i10, j9);
        if (y3.a.f(j9)) {
            i14 = y3.a.j(j9);
        } else {
            if (!y3.a.e(j9)) {
                g0.a.a("does not have fixed height");
            }
            i14 = y3.a.i(j9);
        }
        y3.m layoutDirection = this.F.B.getLayoutDirection();
        f0 f0Var = this.G.m;
        return new q(i10, objB, i14, i13, layoutDirection, this.H, this.I, listK0, this.J, objJ, f0Var, j9, i11, i12);
    }
}
