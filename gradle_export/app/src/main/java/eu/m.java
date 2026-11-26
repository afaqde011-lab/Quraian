package eu;

import e1.v0;
import g1.e0;
import g1.j0;
import g1.w3;
import g1.z3;
import h0.n1;
import l1.g0;
import l1.m1;
import q0.j1;
import q0.s0;
import q0.z0;

public final class m implements u00.n {
    public final int A = 3;
    public final Object B;
    public final Object C;
    public final boolean D;
    public final int E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    public m(v0 v0Var, j1 j1Var, boolean z, u00.k kVar, r3.w wVar, r3.p pVar, y3.c cVar, int i) {
        this.B = v0Var;
        this.F = j1Var;
        this.D = z;
        this.G = kVar;
        this.H = wVar;
        this.I = pVar;
        this.C = cVar;
        this.E = i;
    }

    public m(l3.a aVar, u00.a aVar2, k2.h hVar, k2.h hVar2, b2.r rVar, boolean z, e0 e0Var, int i) {
        this.F = aVar;
        this.B = aVar2;
        this.G = hVar;
        this.H = hVar2;
        this.C = rVar;
        this.D = z;
        this.I = e0Var;
        this.E = i;
    }

    public m(v1.c cVar, u00.a aVar, b2.r rVar, u00.n nVar, boolean z, w3 w3Var, n1 n1Var, int i) {
        this.F = cVar;
        this.B = aVar;
        this.C = rVar;
        this.G = nVar;
        this.D = z;
        this.H = w3Var;
        this.I = n1Var;
        this.E = i;
    }

    public m(boolean z, u00.a aVar, String str, String str2, String str3, b2.r rVar, String str4, int i) {
        this.D = z;
        this.B = aVar;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.C = rVar;
        this.I = str4;
        this.E = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.l(this.D, (u00.a) this.B, (String) this.F, (String) this.G, (String) this.H, (b2.r) this.C, (String) this.I, (l1.j) obj, l1.q.K(this.E | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                j0.c((l3.a) this.F, (u00.a) this.B, (k2.h) this.G, (k2.h) this.H, (b2.r) this.C, this.D, (e0) this.I, (l1.j) obj, l1.q.K(this.E | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                z3.b((v1.c) this.F, (u00.a) this.B, (b2.r) this.C, (u00.n) this.G, this.D, (w3) this.H, (n1) this.I, (l1.j) obj, l1.q.K(this.E | 1));
                break;
            default:
                v0 v0Var = (v0) this.B;
                j1 j1Var = (j1) this.F;
                u00.k kVar = (u00.k) this.G;
                r3.w wVar = (r3.w) this.H;
                r3.p pVar = (r3.p) this.I;
                y3.c cVar = (y3.c) this.C;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s0 s0Var = new s0(j1Var, kVar, wVar, pVar, cVar, this.E);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVarC = b2.a.c(b2.o.A, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(s0Var, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    g0Var2.r(true);
                    z0 z0VarA = j1Var.a();
                    z0 z0Var = z0.A;
                    boolean z2 = this.D;
                    if (z0VarA != z0Var && j1Var.c() != null) {
                        z2.a0 a0VarC = j1Var.c();
                        kotlin.jvm.internal.m.b(a0VarC);
                        z = a0VarC.A() && z2;
                    }
                    q0.q.m(v0Var, z, g0Var, 0);
                    if (j1Var.a() == z0.C && z2) {
                        g0Var2.c0(-714666198);
                        q0.q.n(v0Var, g0Var, 0);
                        g0Var2.r(false);
                    } else {
                        g0Var2.c0(-714589318);
                        g0Var2.r(false);
                    }
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
        }
        return g00.b0.a;
    }
}
