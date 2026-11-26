package a1;

import java.util.List;

public final class x1 implements u00.k {
    public final int A;
    public final j2 B;

    public x1(j2 j2Var, int i10) {
        this.A = i10;
        this.B = j2Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                j2 j2Var = this.B;
                boolean z10 = j2Var.U;
                if (zBooleanValue) {
                    if (((r2.a) ((r2.c) ((r2.b) b3.m.h(j2Var, c3.o1.m))).f13044a.getValue()).f13043a != 1) {
                        j2Var.S.v(false);
                    }
                    if (z10) {
                        j2Var.K1(false);
                    }
                } else {
                    j2Var.F1();
                    w2 w2Var = j2Var.Q;
                    z0.g gVar = w2Var.f135a;
                    h1.l lVar = w2Var.f136b;
                    c1.c cVar = c1.c.A;
                    gVar.f16994b.a().w();
                    z0.a aVar = gVar.f16994b;
                    aVar.e(null);
                    w2Var.l(aVar);
                    z0.g.a(gVar, lVar, true, cVar);
                    gVar.f(true);
                    j2Var.Q.a();
                }
                b3.m.t(j2Var, new w1(j2Var, 4));
                break;
            case 1:
                b0.a.a(this.B);
                break;
            case 2:
                e0 e0Var = new e0();
                j2 j2Var2 = this.B;
                j2Var2.Y.b(e0Var);
                j2Var2.f62d0 = e0Var;
                b0.a.a(j2Var2);
                break;
            case 3:
                j2 j2Var3 = this.B;
                s2 s2Var = j2Var3.R;
                long jT = ((h2.b) obj).f6544a;
                z2.a0 a0VarB = s2Var.b();
                if (a0VarB != null && a0VarB.A()) {
                    jT = a0VarB.T(jT);
                }
                int iD = j2Var3.R.d(true, jT);
                if (iD >= 0) {
                    j2Var3.Q.j(m3.h0.b(iD, iD));
                }
                j2Var3.S.A(q0.y0.A, jT);
                break;
            case 4:
                j2 j2Var4 = this.B;
                j2Var4.G1();
                j2Var4.S.d();
                b0.a.a(j2Var4);
                break;
            case 5:
                this.B.G1();
                break;
            case 6:
                j2 j2Var5 = this.B;
                a40.c0.y(j2Var5.p1(), (k00.i) null, a40.a0.D, new d((q0.e1) obj, j2Var5, null, 5), 1);
                break;
            case 7:
                List list = (List) obj;
                m3.n0 n0VarC = this.B.R.c();
                return Boolean.valueOf(n0VarC != null ? list.add(n0VarC) : false);
            default:
                this.B.S.v(((Boolean) obj).booleanValue());
                break;
        }
        return g00.b0.a;
    }
}
