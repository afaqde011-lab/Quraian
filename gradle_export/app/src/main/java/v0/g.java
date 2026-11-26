package v0;

import a10.h0;
import android.view.View;
import b2.r;
import c3.o0;
import c4.c0;
import com.google.android.gms.cast.Cast;
import h0.o;
import l1.g0;
import l1.i1;
import l1.m1;
import l1.q;
import l1.q1;
import l1.r1;
import l1.z0;
import qo.s;
import z2.w0;

public abstract class g {

    public static final v1.c f15325a = new v1.c(new r0.a(1), 636288403, false);

    public static final v1.c f15326b = new v1.c(new r0.a(2), -1357803046, false);

    public static final void a(r rVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        r rVar2;
        v1.c cVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(790527681);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            Object objN = g0Var.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                i1 i1Var = new i1(null, l1.c.D);
                g0Var.n0(i1Var);
                objN = i1Var;
            }
            z0 z0Var = (z0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == cVar3) {
                objN2 = new ct.k(z0Var, 27);
                g0Var.n0(objN2);
            }
            u00.a aVar = (u00.a) objN2;
            c0 c0Var = i.f15327a;
            x0.c cVarJ = h0.j(f15326b, g0Var, 6);
            rVar2 = rVar;
            cVar2 = cVar;
            q.b(new q1[]{x0.g.f16398b.a(e(aVar, g0Var, 2)), x0.g.f16397a.a(cVarJ)}, v1.d.d(1070596993, new cz.g(rVar2, z0Var, cVar2, cVarJ, aVar), g0Var), g0Var, 56);
        } else {
            rVar2 = rVar;
            cVar2 = cVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new kz.h(rVar2, cVar2, i10, 5);
        }
    }

    public static final void b(r rVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(155925518);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            boolean z10 = g0Var.k(x0.g.f16397a) != null;
            boolean z11 = g0Var.k(x0.g.f16398b) != null;
            if (z10 && z11) {
                g0Var.c0(-1977187922);
                w0 w0VarD = o.d(b2.b.A, true);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC = b2.a.c(rVar, g0Var);
                b3.i.f2042c.getClass();
                b3.g gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD, g0Var, b3.h.f2039f);
                q.I(m1VarM, g0Var, b3.h.f2038e);
                q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
                q.E(g0Var, b3.h.f2041h);
                q.I(rVarC, g0Var, b3.h.f2037d);
                cVar.invoke(g0Var, Integer.valueOf((i11 >> 3) & 14));
                g0Var.r(true);
                g0Var.r(false);
            } else if (z10) {
                g0Var.c0(-1976997706);
                c(rVar, cVar, g0Var, i11 & 126);
                g0Var.r(false);
            } else if (z11) {
                g0Var.c0(-1976846922);
                i.d(rVar, cVar, g0Var, i11 & 126);
                g0Var.r(false);
            } else {
                g0Var.c0(-1976716505);
                a(rVar, cVar, g0Var, i11 & 126);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new kz.h(rVar, cVar, i10, 4);
        }
    }

    public static final void c(r rVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(2064964257);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            d(rVar, cVar, g0Var, ((i11 << 3) & 896) | (i11 & 14) | 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new kz.h(rVar, cVar, i10, 1);
        }
    }

    public static final void d(r rVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(771959668);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(null) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(cVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.f9868a;
            if (objN == cVar2) {
                i1 i1Var = new i1(null, l1.c.D);
                g0Var.n0(i1Var);
                objN = i1Var;
            }
            z0 z0Var = (z0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == cVar2) {
                objN2 = new ct.k(z0Var, 26);
                g0Var.n0(objN2);
            }
            q.a(x0.g.f16398b.a(e((u00.a) objN2, g0Var, 0)), v1.d.d(-291176396, new s(rVar, z0Var, cVar, 2), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new kz.h(rVar, cVar, i10, 2);
        }
    }

    public static final f e(u00.a aVar, l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        View view = (View) g0Var.k(o0.f2726f);
        boolean zG = g0Var.g(view);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (zG || objN == cVar) {
            objN = new f(view, null, aVar);
            g0Var.n0(objN);
        }
        f fVar = (f) objN;
        boolean zI = g0Var.i(fVar);
        Object objN2 = g0Var.N();
        if (zI || objN2 == cVar) {
            objN2 = new a(fVar, 3);
            g0Var.n0(objN2);
        }
        q.e(fVar, (u00.k) objN2, jVar);
        return fVar;
    }
}
