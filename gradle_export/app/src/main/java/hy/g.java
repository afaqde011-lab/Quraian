package hy;

import a1.v2;
import b2.r;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import f2.h;
import g1.z6;
import gv.a2;
import h0.c1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.t;
import kh.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import u00.k;
import u00.n;
import x3.l;

public abstract class g {
    public static final float a = 20;

    public static final void a(cy.e result, p0.e eVar, k kVar, k kVar2, n nVar, r rVar, j jVar, int i) {
        int i2;
        String str;
        String str2;
        long jZ;
        boolean z;
        long jZ2;
        m.e(result, "result");
        dw.a aVar = result.j;
        cy.f fVar = result.b;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1751807476);
        int i3 = i | (g0Var.i(result) ? 4 : 2) | (g0Var.g(eVar) ? 32 : 16) | (g0Var.i(kVar) ? 256 : 128) | (g0Var.i(kVar2) ? 2048 : 1024) | (g0Var.i(nVar) ? 16384 : 8192) | (g0Var.g(rVar) ? 131072 : 65536);
        if (g0Var.S(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 14;
            boolean z2 = ((i3 & 57344) == 16384) | (i4 == 4 || g0Var.i(result)) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objN = g0Var.N();
            if (z2 || objN == i.a) {
                objN = new ct.m(result, kVar, kVar2, nVar);
                g0Var.n0(objN);
            }
            float f = 16;
            r rVarC = h0.c.C(w50.c.n(z.n.f(h.c(z1.d(rVar, 1.0f), eVar), t.b(0.08f, dl.a.i), b0.b), true, (u00.a) objN), f);
            v1 v1VarA = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = b3.h.f;
            q.I(v1VarA, g0Var, fVar2);
            b3.f fVar3 = b3.h.e;
            q.I(m1VarM, g0Var, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.g;
            q.I(numValueOf, g0Var, fVar4);
            b3.e eVar2 = b3.h.h;
            q.E(g0Var, eVar2);
            b3.f fVar5 = b3.h.d;
            q.I(rVarC2, g0Var, fVar5);
            b.a(result, null, g0Var, 8 | i4);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = u.a(h0.i.g(2), b2.b.M, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC3 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar2);
            q.I(m1VarM2, g0Var, fVar3);
            a1.b.v(iHashCode2, g0Var, fVar4, g0Var, eVar2);
            q.I(rVarC3, g0Var, fVar5);
            int iOrdinal = fVar.ordinal();
            String str3 = "";
            if (iOrdinal == 0) {
                i2 = 2;
                bx.c cVar = result.d;
                str = cVar != null ? cVar.b : null;
                if (str == null) {
                    str2 = str3;
                } else {
                    str2 = str;
                }
            } else if (iOrdinal != 1) {
                i2 = 2;
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = aVar != null ? aVar.c : null;
                if (str == null) {
                    str2 = str3;
                } else {
                    str2 = str;
                }
            } else {
                i2 = 2;
                str = result.f;
                if (str == null) {
                    str = "";
                }
                String str4 = result.h;
                str3 = str4 != null ? str4 : "";
                if (r30.k.L0(str3)) {
                    str2 = str;
                } else {
                    str3 = str + " (" + str3 + ")";
                    str2 = str3;
                }
            }
            l1.t tVar = dl.e.a;
            int iOrdinal2 = ((gm.a) g0Var.k(tVar)).ordinal();
            if (iOrdinal2 == 0) {
                jZ = o.z(17);
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ = o.z(19);
            }
            int iOrdinal3 = ((gm.a) g0Var.k(tVar)).ordinal();
            if (iOrdinal3 != 0) {
                z = true;
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ2 = o.z(24);
            } else {
                z = true;
                jZ2 = o.z(22);
            }
            long j = jZ2;
            q3.u uVar = q3.u.B;
            long j2 = dl.a.k;
            long j3 = jZ;
            boolean z3 = z;
            z6.b(str2, (r) null, j2, j3, uVar, (q3.i) null, 0L, (l) null, (x3.k) null, j, 2, false, 1, 0, (k) null, (r0) null, g0Var, 1572864, 24960, 239530);
            g0Var = g0Var;
            String str5 = result.k;
            if (e.a[fVar.ordinal()] == i2 && str5 == null) {
                if (aVar != null) {
                    str5 = aVar.d;
                    if (r30.k.L0(str5)) {
                        str5 = null;
                    }
                } else {
                    str5 = null;
                }
            }
            String str6 = (str5 == null || r30.k.L0(str5)) ? null : str5;
            if (str6 == null) {
                g0Var.c0(348564387);
                g0Var.r(false);
            } else {
                g0Var.c0(348564388);
                z6.b(str6, (r) null, t.b(0.5f, j2), ri.t1.L(g0Var), uVar, (q3.i) null, 0L, (l) null, (x3.k) null, ri.t1.K(g0Var), 2, false, 1, 0, (k) null, (r0) null, g0Var, 1572864, 24960, 239530);
                g0Var = g0Var;
                g0Var.r(false);
            }
            g0Var.r(z3);
            z3.j(y3.R(2131231099, g0Var, 0), (String) null, z1.q(b2.o.A, f), dl.a.p, g0Var, 440, 0);
            g0Var.r(z3);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a2(result, eVar, kVar, kVar2, nVar, rVar, i);
        }
    }

    public static final void b(String title, u00.a aVar, r rVar, j jVar, int i) {
        g0 g0Var;
        boolean z;
        u00.a aVar2 = aVar;
        m.e(title, "title");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-319263669);
        int i2 = i | (g0Var2.g(title) ? 4 : 2) | (g0Var2.i(aVar2) ? 32 : 16) | (g0Var2.g(rVar) ? 256 : 128);
        if (g0Var2.S(i2 & 1, (i2 & 147) != 146)) {
            v1 v1VarA = t1.a(h0.i.g, b2.b.K, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVar, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(v1VarA, g0Var2, b3.h.f);
            q.I(m1VarM, g0Var2, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            q.E(g0Var2, b3.h.h);
            q.I(rVarC, g0Var2, b3.h.d);
            z6.b(title, (r) null, dl.a.n, ri.t1.N(g0Var2), q3.u.D, (q3.i) null, 0L, (l) null, (x3.k) null, ri.t1.M(g0Var2), 0, false, 0, 0, (k) null, (r0) null, g0Var2, (i2 & 14) | 1572864, 0, 260010);
            aVar2 = aVar;
            g0Var = g0Var2;
            if (aVar2 != null) {
                g0Var.c0(-1007104434);
                z = true;
                r rVarN = w50.c.n(b2.o.A, true, aVar2);
                z6.b(z3.U(g0Var, 2131887177), rVarN, dl.a.m, ri.t1.L(g0Var), q3.u.C, (q3.i) null, 0L, (l) null, (x3.k) null, ri.t1.K(g0Var), 0, false, 0, 0, (k) null, (r0) null, g0Var, 1572864, 0, 260008);
                g0Var.r(false);
            } else {
                z = true;
                g0Var.c0(-1006743749);
                g0Var.r(false);
            }
            g0Var.r(z);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(title, aVar2, rVar, i, 0);
        }
    }

    public static final void c(j0.h searchResultsSection, String str, final int i, u30.b results, final float f, final float f2, k kVar, k kVar2, n nVar, final fy.r rVar) {
        m.e(searchResultsSection, "$this$searchResultsSection");
        m.e(results, "results");
        searchResultsSection.p(str.concat("-header"), "search_section_header", new v1.c(new u00.o() {
            @Override
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                j0.b item = (j0.b) obj;
                g0 g0Var = (j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.e(item, "$this$item");
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f3 = f;
                    g.b(z3.U(g0Var, i), rVar, h0.c.F(z1.d(b2.o.A, 1.0f), f3, f2, f3, 12), g0Var, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            }
        }, -731152075, true));
        searchResultsSection.r(((h00.b) results).a(), new v2(new eu.n(str, 2), results, 16), new as.r0(7, results), new v1.c(new f(results, f, results, kVar, kVar2, nVar), 2039820996, true));
    }
}
