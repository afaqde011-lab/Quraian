package k0;

import d0.q1;
import java.util.List;

public final class f implements l0.u {

    public final y f8464a;

    public f(y yVar) {
        this.f8464a = yVar;
    }

    @Override
    public final int a() {
        return this.f8464a.g().f8504p;
    }

    @Override
    public final int b() {
        return ((q) h00.q.T0((List) this.f8464a.g().m)).f8508a;
    }

    @Override
    public final int c() {
        int i10;
        y yVar = this.f8464a;
        int i11 = 0;
        if (yVar.g().m.isEmpty()) {
            return 0;
        }
        p pVarG = yVar.g();
        q1 q1Var = pVarG.f8505q;
        q1 q1Var2 = q1.A;
        int iG = (int) (q1Var == q1Var2 ? pVarG.g() & 4294967295L : pVarG.g() >> 32);
        p pVarG2 = yVar.g();
        boolean z10 = pVarG2.f8505q == q1Var2;
        ?? r4 = pVarG2.m;
        if (!r4.isEmpty()) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < r4.size()) {
                int iB0 = p30.f.B0(z10, pVarG2, i12);
                if (iB0 == -1) {
                    i12++;
                } else {
                    int iMax = 0;
                    while (i12 < r4.size() && p30.f.B0(z10, pVarG2, i12) == iB0) {
                        iMax = Math.max(iMax, (int) (z10 ? ((q) r4.get(i12)).f8524s & 4294967295L : ((q) r4.get(i12)).f8524s >> 32));
                        i12++;
                    }
                    i13 += iMax;
                    i14++;
                }
            }
            i11 = (i13 / i14) + pVarG2.f8507s;
        }
        if (i11 != 0 && (i10 = iG / i11) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override
    public final boolean d() {
        return !this.f8464a.g().m.isEmpty();
    }

    @Override
    public final int e() {
        return this.f8464a.f8546d.f7808b.h();
    }
}
