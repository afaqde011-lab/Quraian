package q0;

import java.util.List;

public abstract class e {

    public static final g00.k f12583a;

    static {
        h00.x xVar = h00.x.A;
        f12583a = new g00.k(xVar, xVar);
    }

    public static final void a(m3.h hVar, List list, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1794596951);
        int i11 = (i10 & 6) == 0 ? (g0Var.g(hVar) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(list) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                m3.f fVar = (m3.f) list.get(i12);
                u00.o oVar = (u00.o) fVar.f10423a;
                int i13 = fVar.f10424b;
                int i14 = fVar.f10425c;
                Object objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = d.f12579b;
                    g0Var.n0(objN);
                }
                z2.w0 w0Var = (z2.w0) objN;
                int iHashCode = Long.hashCode(g0Var.T);
                l1.m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(b2.o.A, g0Var);
                b3.i.f2042c.getClass();
                b3.g gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0Var, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC, g0Var, b3.h.f2037d);
                oVar.invoke(hVar.subSequence(i13, i14).B, g0Var, 0);
                g0Var.r(true);
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(hVar, list, i10, 13);
        }
    }
}
