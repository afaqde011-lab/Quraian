package ix;

import android.content.Context;
import c3.o0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.c7;
import g1.o3;
import g1.z6;
import gv.a0;
import h0.c1;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.t0;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import hx.x;
import i2.b0;
import i2.s0;
import i2.t;
import java.util.Map;
import java.util.WeakHashMap;
import l1.g0;
import l1.m1;
import l1.r1;
import m3.i0;
import m3.r0;

public abstract class o {
    public static final float a = 20;
    public static final float b = 44;

    public static final void a(x uiState, u00.k onAction, l1.j jVar, int i) {
        int i2;
        u00.k kVar;
        float f;
        b2.r rVar;
        b3.f fVar;
        boolean z;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        String str = uiState.i;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1536740316);
        int i3 = i | (g0Var.g(uiState) ? 4 : 2) | (g0Var.i(onAction) ? 32 : 16);
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            gm.a aVar2 = gm.a.A;
            float f2 = aVar == aVar2 ? 16 : 24;
            b2.r rVarM = h0.c.M(h0.c.G(z1.c, f2, t0VarL.c() + n1Var.c(), f2, 0.0f, 8), h0.c.f);
            v vVarA = u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarM, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar2);
            b3.f fVar3 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar4 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar4);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar5 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar5);
            b2.r rVar2 = b2.o.A;
            if (aVar == aVar2) {
                g0Var.c0(81265420);
                rVar = rVar2;
                fVar = fVar4;
                f = 1.0f;
                rx.a.f(z3.U(g0Var, 2131887154), h0.c.E(z1.d(rVar2, 1.0f), 0.0f, 16, 1), 0L, g0Var, 48, 4);
                z = false;
                g0Var.r(false);
            } else {
                f = 1.0f;
                rVar = rVar2;
                fVar = fVar4;
                z = false;
                g0Var.c0(81498292);
                g0Var.r(false);
            }
            float f3 = 16;
            b2.r rVarE = h0.c.E(z1.d(rVar, f), 0.0f, f3, 1);
            v1 v1VarA = t1.a(h0.i.g(f3), b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar2);
            l1.q.I(m1VarM2, g0Var, fVar3);
            a1.b.v(iHashCode2, g0Var, fVar, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar5);
            if (f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(f, true);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32 ? true : z;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z2 || objN == obj) {
                objN = new hv.j(10, onAction);
                g0Var.n0(objN);
            }
            boolean z3 = z;
            a.g(str, (u00.k) objN, c1Var, true, 0, g0Var, 3072, 16);
            boolean z4 = i4 == 32 ? true : z3;
            Object objN2 = g0Var.N();
            if (z4 || objN2 == obj) {
                objN2 = new a0(22, onAction);
                g0Var.n0(objN2);
            }
            b2.r rVar3 = rVar;
            i2 = 1;
            z6.b(z3.U(g0Var, 2131887176), w50.c.n(rVar, true, (u00.a) objN2), dl.a.m, kh.o.z(17), q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260008);
            g0Var = g0Var;
            g0Var.r(true);
            if (r30.k.L0(str)) {
                kVar = onAction;
                if (uiState.k.isEmpty()) {
                    g0Var.c0(972531962);
                    b(z1.d(rVar3, 1.0f), g0Var, 6);
                    g0Var.r(false);
                } else {
                    g0Var.c0(972512581);
                    String strU = z3.U(g0Var, 2131887182);
                    u30.b bVar = uiState.k;
                    boolean z5 = i4 == 32;
                    Object objN3 = g0Var.N();
                    if (z5 || objN3 == obj) {
                        objN3 = new hv.j(12, kVar);
                        g0Var.n0(objN3);
                    }
                    u00.k kVar2 = (u00.k) objN3;
                    boolean z6 = i4 == 32;
                    Object objN4 = g0Var.N();
                    if (z6 || objN4 == obj) {
                        objN4 = new a0(23, kVar);
                        g0Var.n0(objN4);
                    }
                    d(strU, bVar, n1Var, t0VarL, kVar2, (u00.a) objN4, g0Var, 64, 0);
                    g0Var = g0Var;
                    g0Var.r(false);
                }
            } else {
                g0Var.c0(972496157);
                String strU2 = z3.U(g0Var, 2131887183);
                u30.b bVar2 = uiState.j;
                boolean z7 = i4 == 32;
                Object objN5 = g0Var.N();
                if (z7 || objN5 == obj) {
                    kVar = onAction;
                    objN5 = new hv.j(11, kVar);
                    g0Var.n0(objN5);
                } else {
                    kVar = onAction;
                }
                d(strU2, bVar2, n1Var, t0VarL, (u00.k) objN5, null, g0Var, 64, 32);
                g0Var = g0Var;
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            i2 = 1;
            kVar = onAction;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new hx.v(uiState, kVar, i, i2);
        }
    }

    public static final void b(b2.r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1469386789);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            b2.r rVarC = f2.h.c(rVar, p0.f.a(a));
            long j = dl.a.i;
            b2.r rVarC2 = h0.c.C(z.n.f(rVarC, t.b(0.1f, j), b0.b), 16);
            v vVarA = u.a(h0.i.g(10), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarC2, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC3, g0Var, fVar4);
            String strU = z3.U(g0Var, 2131887181);
            long jZ = kh.o.z(13);
            long jZ2 = kh.o.z(18);
            q3.u uVar = q3.u.B;
            long j2 = dl.a.k;
            z6.b(strU, (b2.r) null, t.b(0.5f, j2), jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC4 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            o3.a(y3.R(2131231367, g0Var, 0), (String) null, z1.m(oVar, 20), j, g0Var, 440, 0);
            g0Var.c0(97573950);
            m3.e eVar2 = new m3.e();
            g0Var.c0(97574975);
            int iE = eVar2.e(new i0(j2, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65534));
            try {
                eVar2.b(z3.U(g0Var, 2131887180));
                eVar2.d(iE);
                g0Var.r(false);
                g0Var.c0(97580504);
                int iE2 = eVar2.e(new i0(t.b(0.5f, j2), 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65534));
                try {
                    eVar2.b(" " + z3.U(g0Var, 2131887179) + " ");
                    eVar2.b(z3.U(g0Var, 2131887178));
                    eVar2.d(iE2);
                    g0Var.r(false);
                    m3.h hVarF = eVar2.f();
                    g0Var.r(false);
                    z6.c(hVarF, (b2.r) null, 0L, kh.o.z(15), uVar, 0L, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (Map) null, (u00.k) null, (r0) null, g0Var, 1597440, 48, 522158);
                    g0Var = g0Var;
                    g0Var.r(true);
                    g0Var.r(true);
                } catch (Throwable th) {
                    eVar2.d(iE2);
                    throw th;
                }
            } catch (Throwable th2) {
                eVar2.d(iE);
                throw th2;
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 17);
        }
    }

    public static final void c(bx.c cVar, p0.e eVar, u00.a aVar, l1.j jVar, int i) {
        bx.c cVar2 = cVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1459872698);
        int i2 = i | (g0Var.i(cVar2) ? 4 : 2) | (g0Var.g(eVar) ? 32 : 16) | (g0Var.i(aVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            String str = cVar2.e;
            if (str.length() <= 0) {
                str = null;
            }
            hVar.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            b2.o oVar = b2.o.A;
            float f = 16;
            b2.r rVarC = h0.c.C(w50.c.n(z.n.f(f2.h.c(z1.d(oVar, 1.0f), eVar), t.b(0.1f, dl.a.i), b0.b), true, aVar), f);
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar2 = b3.h.h;
            l1.q.E(g0Var, eVar2);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC2, g0Var, fVar4);
            float f2 = b;
            z.n.c(jVarI, (String) null, rd.a.g0(f2, 0, dl.a.s, f2.h.c(z1.m(oVar, f2), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarE = h0.c.E(new c1(1.0f, true), 12, 0.0f, 2);
            v vVarA = u.a(h0.i.g(2), b2.b.M, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar2);
            l1.q.I(rVarC3, g0Var, fVar4);
            cVar2 = cVar;
            String str2 = cVar2.b;
            long jZ = kh.o.z(17);
            long jZ2 = kh.o.z(22);
            q3.u uVar = q3.u.B;
            long j = dl.a.k;
            z6.b(str2, (b2.r) null, j, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239530);
            z6.b(cVar2.i, (b2.r) null, t.b(0.5f, j), kh.o.z(15), uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239530);
            g0Var = g0Var;
            g0Var.r(true);
            z3.j(y3.R(2131231099, g0Var, 0), (String) null, z1.q(oVar, f), dl.a.p, g0Var, 440, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 14, cVar2, eVar, aVar);
        }
    }

    public static final void d(String str, u30.b bVar, n1 n1Var, t0 t0Var, u00.k kVar, u00.a aVar, l1.j jVar, int i, int i2) {
        u00.a aVar2;
        int i3;
        u00.a aVar3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1996263555);
        int i4 = i | (g0Var.g(str) ? 4 : 2) | (g0Var.i(bVar) ? 32 : 16) | (g0Var.g(n1Var) ? 256 : 128) | (g0Var.g(t0Var) ? 2048 : 1024) | (g0Var.i(kVar) ? 16384 : 8192);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i3 = i4 | (g0Var.i(aVar2) ? 131072 : 65536);
        }
        if (g0Var.S(i3 & 1, (74899 & i3) != 74898)) {
            u00.a aVar4 = i5 != 0 ? null : aVar2;
            h0.a0 a0Var = z1.c;
            p1 p1VarG = h0.c.g(0.0f, 0.0f, 0.0f, t0Var.a() + n1Var.a(), 7);
            boolean z = ((i3 & 14) == 4) | ((458752 & i3) == 131072) | ((i3 & 112) == 32 || g0Var.i(bVar)) | ((i3 & 57344) == 16384);
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = new az.k(str, bVar, aVar4, kVar);
                g0Var.n0(objN);
            }
            k00.f.d(a0Var, null, p1VarG, null, null, null, false, null, (u00.k) objN, g0Var, 6, 506);
            aVar3 = aVar4;
        } else {
            g0Var.V();
            aVar3 = aVar2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c7(str, bVar, n1Var, t0Var, kVar, aVar3, i, i2);
        }
    }
}
