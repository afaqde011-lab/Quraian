package ix;

import android.content.Context;
import c00.s;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.c5;
import g1.n5;
import g1.t6;
import g1.w6;
import g1.z6;
import gv.y;
import h0.c1;
import h0.p1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import hx.t;
import i2.b0;
import i2.o0;
import i2.t0;
import l1.g0;
import l1.m1;
import l1.r1;
import m3.r0;
import q0.i1;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new ir.b(10), -326398178, false);

    public static final void a(o2.f fVar, b2.r rVar, l1.j jVar, int i) {
        o2.f fVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(412242364);
        int i2 = (g0Var.g(fVar) ? 4 : 2) | i | 48;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            float f = 16;
            b2.r rVar2 = b2.o.A;
            b2.r rVarM = z1.m(rVar2, f);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new t(11);
                g0Var.n0(objN);
            }
            b2.r rVarP = b0.p(rVarM, (u00.k) objN);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarP, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            b2.r rVarB = f2.h.b(z1.m(rVar2, f), 8, (o0) null);
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = new t(12);
                g0Var.n0(objN2);
            }
            int i3 = i2 & 14;
            fVar2 = fVar;
            z3.k(fVar2, (String) null, b0.p(rVarB, (u00.k) objN2), dl.a.g, g0Var, i3 | 48);
            z3.k(fVar2, (String) null, z1.m(rVar2, f), dl.a.i, g0Var, i3 | 432);
            g0Var.r(true);
            rVar = rVar2;
        } else {
            fVar2 = fVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(fVar2, rVar, i, 25);
        }
    }

    public static final void b(String str, String subtitle, u30.b bVar, u00.a onClick, b2.r rVar, l1.j jVar, int i) {
        u30.b reciters = bVar;
        kotlin.jvm.internal.m.e(subtitle, "subtitle");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1315035823);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | (g0Var.g(subtitle) ? 32 : 16) | (g0Var.g(reciters) ? 256 : 128) | (g0Var.i(onClick) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            float f = 24;
            b2.r rVarG = h0.c.G(w50.c.n(z.n.e(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(20)), sg.f.P(va.a.S(new i2.t[]{new i2.t(dl.a.t), new i2.t(dl.a.L)}), 0.0f, 0.0f, 14), (t0) null, 6), true, onClick), f, 28, f, 0.0f, 8);
            b2.h hVar = b2.b.K;
            float f2 = 12;
            v1 v1VarA = t1.a(h0.i.g(f2), hVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
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
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            v1 v1VarA2 = t1.a(h0.i.g(f2), hVar, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            v vVarA = u.a(h0.i.g(4), b2.b.M, g0Var, 6);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            long jZ = kh.o.z(20);
            long jZ2 = kh.o.z(22);
            q3.u uVar = q3.u.D;
            long j = dl.a.n;
            z6.b(str, (b2.r) null, j, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | 1597440, 25008, 239530);
            z6.b(subtitle, (b2.r) null, i2.t.b(0.5f, j), kh.o.z(16), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 3) & 14) | 24576, 48, 260074);
            g0Var = g0Var;
            g0Var.r(true);
            z3.k(g4.h0(2131231099, g0Var, 6), (String) null, z1.m(oVar, 14), dl.a.i, g0Var, 432);
            g0Var.r(true);
            if (bVar.isEmpty()) {
                reciters = bVar;
                g0Var.c0(1612406837);
                g0Var.r(false);
            } else {
                g0Var.c0(1612314581);
                reciters = bVar;
                d(reciters, null, g0Var, (i2 >> 6) & 14);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(str, subtitle, reciters, onClick, rVar, i, 0);
        }
    }

    public static final void c(String str, String subtitle, u30.b reciters, u00.a onClick, b2.r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(subtitle, "subtitle");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-985114599);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | (g0Var.g(subtitle) ? 32 : 16) | (g0Var.g(reciters) ? 256 : 128) | (g0Var.i(onClick) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            float f = 16;
            b2.r rVarG = h0.c.G(w50.c.n(z.n.e(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(20)), sg.f.P(va.a.S(new i2.t[]{new i2.t(dl.a.t), new i2.t(dl.a.L)}), 0.0f, 0.0f, 14), (t0) null, 6), true, onClick), f, 28, f, 0.0f, 8);
            b2.g gVar = b2.b.M;
            v vVarA = u.a(h0.i.g(12), gVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
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
            l1.q.I(rVarC, g0Var, fVar4);
            e(reciters, null, g0Var, (i2 >> 6) & 14);
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            v1 v1VarA = t1.a(h0.i.g, b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            v vVarA2 = u.a(h0.i.c, gVar, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            long jZ = kh.o.z(17);
            long jZ2 = kh.o.z(22);
            q3.u uVar = q3.u.D;
            long j = dl.a.n;
            z6.b(str, (b2.r) null, j, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | 1597440, 25008, 239530);
            z6.b(subtitle, (b2.r) null, i2.t.b(0.5f, j), kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 3) & 14) | 24576, 48, 260074);
            g0Var = g0Var;
            g0Var.r(true);
            z3.k(g4.h0(2131231099, g0Var, 6), (String) null, z1.m(oVar, 14), dl.a.i, g0Var, 432);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(str, subtitle, reciters, onClick, rVar, i, 1);
        }
    }

    public static final void d(u30.b bVar, b2.r rVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1668867925);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            fx.b bVar2 = (fx.b) h00.q.N0(bVar);
            fx.b bVar3 = (fx.b) h00.q.O0(1, bVar);
            fx.b bVar4 = (fx.b) h00.q.O0(2, bVar);
            b2.r rVar2 = b2.o.A;
            b2.r rVarD = z1.d(rVar2, 1.0f);
            h0.b bVar5 = h0.i.a;
            v1 v1VarA = t1.a(h0.i.h(12, b2.b.O), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            i(bVar3 != null ? bVar3.c : null, false, g0Var, 56);
            i(bVar2 != null ? bVar2.c : null, true, g0Var, 56);
            i(bVar4 != null ? bVar4.c : null, false, g0Var, 56);
            g0Var.r(true);
            rVar = rVar2;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(bVar, rVar, i, 0);
        }
    }

    public static final void e(u30.b bVar, b2.r rVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-524318461);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            fx.b bVar2 = (fx.b) h00.q.N0(bVar);
            fx.b bVar3 = (fx.b) h00.q.O0(1, bVar);
            fx.b bVar4 = (fx.b) h00.q.O0(2, bVar);
            b2.r rVar2 = b2.o.A;
            b2.r rVarD = z1.d(rVar2, 1.0f);
            h0.b bVar5 = h0.i.a;
            v1 v1VarA = t1.a(h0.i.h(12, b2.b.N), b2.b.L, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            j(bVar3 != null ? bVar3.c : null, false, g0Var, 56);
            j(bVar2 != null ? bVar2.c : null, true, g0Var, 56);
            j(bVar4 != null ? bVar4.c : null, false, g0Var, 56);
            g0Var.r(true);
            rVar = rVar2;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c(bVar, rVar, i, 1);
        }
    }

    public static final void f(String title, String description, u00.a onRetryClicked, b2.r rVar, l1.j jVar, int i) {
        b2.r rVar2;
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(description, "description");
        kotlin.jvm.internal.m.e(onRetryClicked, "onRetryClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-254967907);
        int i2 = i | (g0Var.g(title) ? 4 : 2) | (g0Var.g(description) ? 32 : 16) | (g0Var.i(onRetryClicked) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            float f = 24;
            b2.r rVarD = h0.c.D(z1.d(rVar, 1.0f), f, 48);
            v vVarA = u.a(h0.i.e, b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            b2.r rVar3 = b2.o.A;
            b2.r rVarM = z1.m(rVar3, 72);
            m2.b bVarR = y3.R(2131231419, g0Var, 0);
            long j = dl.a.n;
            z3.j(bVarR, (String) null, rVarM, j, g0Var, 440, 0);
            h0.c.h(z1.e(rVar3, 16), g0Var);
            z6.b(title, (b2.r) null, j, kh.o.z(17), q3.u.D, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | 1597440, 48, 258986);
            g0Var = g0Var;
            if (r30.k.L0(description)) {
                rVar2 = rVar3;
                g0Var.c0(-1350839045);
                g0Var.r(false);
            } else {
                g0Var.c0(-1351152331);
                h0.c.h(z1.e(rVar3, 8), g0Var);
                rVar2 = rVar3;
                z6.b(description, (b2.r) null, dl.a.o, kh.o.z(15), q3.u.B, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 3) & 14) | 1597440, 48, 258986);
                g0Var = g0Var;
                g0Var.r(false);
            }
            b2.r rVar4 = rVar2;
            h0.c.h(z1.e(rVar4, f), g0Var);
            kh.n.l(z3.U(g0Var, 2131886944), onRetryClicked, z1.q(rVar4, 200), 32, 0.0f, false, false, gl.d.Secondary, false, (u00.n) null, g0Var, ((i2 >> 3) & 112) | 100666752, 0, 7920);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new e(i, 0, rVar, title, description, onRetryClicked);
        }
    }

    public static final void g(String str, u00.k onSearchQueryChanged, b2.r rVar, boolean z, int i, l1.j jVar, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        g0 g0Var;
        int i6;
        r1 r1VarT;
        int i7;
        z0.g gVarH;
        Object objN;
        Object obj;
        g2.t tVar;
        boolean z3;
        boolean zG;
        Object objN2;
        boolean z4;
        boolean z5;
        Object objN3;
        Object objN4;
        int i8;
        u00.n nVar;
        kotlin.jvm.internal.m.e(onSearchQueryChanged, "onSearchQueryChanged");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-902701882);
        int i9 = i2 | (g0Var2.g(str) ? 4 : 2) | (g0Var2.i(onSearchQueryChanged) ? 32 : 16) | (g0Var2.g(rVar) ? 256 : 128);
        if ((i3 & 16) == 0) {
            i4 = i;
            int i11 = g0Var2.e(i4) ? 16384 : 8192;
            i5 = i9 | i11;
            if ((i5 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (g0Var2.S(i5 & 1, z2)) {
                g0Var2.X();
                if ((i2 & 1) == 0 && !g0Var2.A()) {
                    g0Var2.V();
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                } else if ((i3 & 16) != 0) {
                    i5 &= -57345;
                    i4 = 2131887198;
                }
                g0Var2.s();
                i7 = i5 & 14;
                gVarH = z0.h.h(str, g0Var2, i7);
                objN = g0Var2.N();
                obj = l1.i.a;
                if (objN == obj) {
                    objN = new g2.t();
                    g0Var2.n0(objN);
                }
                tVar = (g2.t) objN;
                if (i7 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = z3 | g0Var2.g(gVarH);
                objN2 = g0Var2.N();
                if (zG || objN2 == obj) {
                    objN2 = new l(str, gVarH, null, 0);
                    g0Var2.n0(objN2);
                }
                l1.q.i(str, g0Var2, (u00.n) objN2);
                boolean zG2 = g0Var2.g(gVarH);
                if ((i5 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z4 | zG2;
                objN3 = g0Var2.N();
                if (z5 || objN3 == obj) {
                    objN3 = new s(gVarH, onSearchQueryChanged, null, 1);
                    g0Var2.n0(objN3);
                }
                l1.q.i(gVarH, g0Var2, (u00.n) objN3);
                Boolean boolValueOf = Boolean.valueOf(z);
                objN4 = g0Var2.N();
                if (objN4 == obj) {
                    objN4 = new m(z, tVar, null, 0);
                    g0Var2.n0(objN4);
                }
                l1.q.i(boolValueOf, g0Var2, (u00.n) objN4);
                float f = 32;
                b2.r rVarJ = g2.d.j(z.n.f(f2.h.c(z1.e(z1.d(rVar, 1.0f), 40), p0.f.a(f)), i2.t.b(0.1f, dl.a.i), b0.b), tVar);
                p0.e eVarA = p0.f.a(f);
                z0.e eVar = z0.e.B;
                c5 c5Var = c5.a;
                long j = i2.t.f;
                long j2 = dl.a.k;
                i8 = 1;
                int i12 = i4;
                t6 t6VarC = c5.c(j2, j2, j2, 0L, j, j, j, 0L, 0L, j, j, j, 0L, i2.t.b(0.6f, j2), i2.t.b(0.6f, j2), i2.t.b(0.6f, j2), g0Var2, 1207945096);
                p1 p1VarE = h0.c.e(16, 0.0f, 2);
                if (str.length() > 0) {
                    g0Var2.c0(-1599115348);
                    u00.n nVarD = v1.d.d(-621879077, new c00.p(gVarH, i8), g0Var2);
                    g0Var2.r(false);
                    nVar = nVarD;
                } else {
                    g0Var2.c0(-1598385856);
                    g0Var2.r(false);
                    nVar = null;
                }
                n5.c(gVarH, rVarJ, false, (r0) null, (w6) null, v1.d.d(-1620817025, new c00.j(i12, 2), g0Var2), a, nVar, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarC, p1VarE, g0Var2, 113246208, 100663296, 18611324);
                g0Var = g0Var2;
                i6 = i12;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                i6 = i4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new y(str, onSearchQueryChanged, rVar, z, i6, i2, i3);
            }
        }
        i4 = i;
        i5 = i9 | i11;
        if ((i5 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (g0Var2.S(i5 & 1, z2)) {
            g0Var2.X();
            if ((i2 & 1) == 0) {
                if ((i3 & 16) != 0) {
                    i5 &= -57345;
                    i4 = 2131887198;
                }
            } else if ((i3 & 16) != 0) {
                i5 &= -57345;
                i4 = 2131887198;
            }
            g0Var2.s();
            i7 = i5 & 14;
            gVarH = z0.h.h(str, g0Var2, i7);
            objN = g0Var2.N();
            obj = l1.i.a;
            if (objN == obj) {
                objN = new g2.t();
                g0Var2.n0(objN);
            }
            tVar = (g2.t) objN;
            if (i7 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG = z3 | g0Var2.g(gVarH);
            objN2 = g0Var2.N();
            if (zG) {
                objN2 = new l(str, gVarH, null, 0);
                g0Var2.n0(objN2);
            } else {
                objN2 = new l(str, gVarH, null, 0);
                g0Var2.n0(objN2);
            }
            l1.q.i(str, g0Var2, (u00.n) objN2);
            boolean zG3 = g0Var2.g(gVarH);
            if ((i5 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z4 | zG3;
            objN3 = g0Var2.N();
            if (z5) {
                objN3 = new s(gVarH, onSearchQueryChanged, null, 1);
                g0Var2.n0(objN3);
            } else {
                objN3 = new s(gVarH, onSearchQueryChanged, null, 1);
                g0Var2.n0(objN3);
            }
            l1.q.i(gVarH, g0Var2, (u00.n) objN3);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            objN4 = g0Var2.N();
            if (objN4 == obj) {
                objN4 = new m(z, tVar, null, 0);
                g0Var2.n0(objN4);
            }
            l1.q.i(boolValueOf2, g0Var2, (u00.n) objN4);
            float f2 = 32;
            b2.r rVarJ2 = g2.d.j(z.n.f(f2.h.c(z1.e(z1.d(rVar, 1.0f), 40), p0.f.a(f2)), i2.t.b(0.1f, dl.a.i), b0.b), tVar);
            p0.e eVarA2 = p0.f.a(f2);
            z0.e eVar2 = z0.e.B;
            c5 c5Var2 = c5.a;
            long j3 = i2.t.f;
            long j4 = dl.a.k;
            i8 = 1;
            int i13 = i4;
            t6 t6VarC2 = c5.c(j4, j4, j4, 0L, j3, j3, j3, 0L, 0L, j3, j3, j3, 0L, i2.t.b(0.6f, j4), i2.t.b(0.6f, j4), i2.t.b(0.6f, j4), g0Var2, 1207945096);
            p1 p1VarE2 = h0.c.e(16, 0.0f, 2);
            if (str.length() > 0) {
                g0Var2.c0(-1599115348);
                u00.n nVarD2 = v1.d.d(-621879077, new c00.p(gVarH, i8), g0Var2);
                g0Var2.r(false);
                nVar = nVarD2;
            } else {
                g0Var2.c0(-1598385856);
                g0Var2.r(false);
                nVar = null;
            }
            n5.c(gVarH, rVarJ2, false, (r0) null, (w6) null, v1.d.d(-1620817025, new c00.j(i13, 2), g0Var2), a, nVar, false, (i1) null, (qp.b) null, eVar2, (z.p1) null, eVarA2, t6VarC2, p1VarE2, g0Var2, 113246208, 100663296, 18611324);
            g0Var = g0Var2;
            i6 = i13;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            i6 = i4;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y(str, onSearchQueryChanged, rVar, z, i6, i2, i3);
        }
    }

    public static final void h(final String title, final u30.b reciters, final boolean z, final u30.b downloadedReciters, final u00.k onReciterClicked, final u00.a onSeeAllClicked, b2.r rVar, boolean z2, l1.j jVar, final int i, final int i2) {
        boolean z3;
        int i3;
        ?? r14;
        boolean z4;
        g0 g0Var;
        final b2.r rVar2;
        final boolean z5;
        r1 r1VarT;
        u00.n nVar;
        boolean z6;
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(reciters, "reciters");
        kotlin.jvm.internal.m.e(downloadedReciters, "downloadedReciters");
        kotlin.jvm.internal.m.e(onReciterClicked, "onReciterClicked");
        kotlin.jvm.internal.m.e(onSeeAllClicked, "onSeeAllClicked");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-260617755);
        int i4 = i | (g0Var2.g(title) ? 4 : 2) | (g0Var2.i((Object) reciters) ? 32 : 16) | (g0Var2.h(z) ? 256 : 128) | (g0Var2.g(downloadedReciters) ? 2048 : 1024) | (g0Var2.i(onReciterClicked) ? 16384 : 8192) | (g0Var2.i(onSeeAllClicked) ? 131072 : 65536);
        int i5 = i2 & 64;
        if (i5 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= g0Var2.g(rVar) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        if (i6 != 0) {
            i3 = i4 | 12582912;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i4 | (g0Var2.h(z3) ? 8388608 : 4194304);
        }
        if (g0Var2.S(i3 & 1, (i3 & 4793491) != 4793490)) {
            final b2.r rVar3 = b2.o.A;
            if (i5 == 0) {
                rVar3 = rVar;
            }
            final boolean z7 = i6 != 0 ? false : z3;
            if (((h00.b) reciters).isEmpty()) {
                r1VarT = g0Var2.t();
                if (r1VarT == null) {
                    return;
                }
                final int i7 = 0;
                nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i7) {
                            case 0:
                                ((Integer) obj2).getClass();
                                a.h(title, reciters, z, downloadedReciters, onReciterClicked, onSeeAllClicked, rVar3, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                a.h(title, reciters, z, downloadedReciters, onReciterClicked, onSeeAllClicked, rVar3, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            } else {
                b2.r rVar4 = rVar3;
                boolean z8 = z7;
                float f = ((gm.a) g0Var2.k(dl.e.a)) == gm.a.B ? 24 : 16;
                b2.r rVarD = z1.d(rVar4, 1.0f);
                float f2 = 12;
                v vVarA = u.a(h0.i.g(f2), b2.b.M, g0Var2, 6);
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                b2.r rVarC = b2.a.c(rVarD, g0Var2);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                b3.f fVar = b3.h.f;
                l1.q.I(vVarA, g0Var2, fVar);
                b3.f fVar2 = b3.h.e;
                l1.q.I(m1VarM, g0Var2, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b3.f fVar3 = b3.h.g;
                l1.q.I(numValueOf, g0Var2, fVar3);
                b3.e eVar = b3.h.h;
                l1.q.E(g0Var2, eVar);
                b3.f fVar4 = b3.h.d;
                l1.q.I(rVarC, g0Var2, fVar4);
                b2.r rVarG = h0.c.G(h0.c.E(z1.d(rVar3, 1.0f), f, 0.0f, 2), 0.0f, f2, 0.0f, 4, 5);
                b2.h hVar = b2.b.K;
                v1 v1VarA = t1.a(h0.i.g, hVar, g0Var2, 54);
                int iHashCode2 = Long.hashCode(g0Var2.T);
                m1 m1VarM2 = g0Var2.m();
                b2.r rVarC2 = b2.a.c(rVarG, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(v1VarA, g0Var2, fVar);
                l1.q.I(m1VarM2, g0Var2, fVar2);
                a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                l1.q.I(rVarC2, g0Var2, fVar4);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                c1 c1Var = new c1(1.0f, true);
                v1 v1VarA2 = t1.a(h0.i.g(8), hVar, g0Var2, 54);
                int iHashCode3 = Long.hashCode(g0Var2.T);
                m1 m1VarM3 = g0Var2.m();
                b2.r rVarC3 = b2.a.c(c1Var, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(v1VarA2, g0Var2, fVar);
                l1.q.I(m1VarM3, g0Var2, fVar2);
                a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
                l1.q.I(rVarC3, g0Var2, fVar4);
                if (z8) {
                    g0Var2.c0(91986678);
                    z6 = false;
                    a(g4.h0(2131231389, g0Var2, 6), null, g0Var2, 0);
                    g0Var2.r(false);
                } else {
                    z6 = false;
                    g0Var2.c0(92149087);
                    g0Var2.r(false);
                }
                boolean z9 = z6;
                int i8 = i3;
                k00.f.a(title, null, dl.a.n, kh.o.z(22), new y3.o(kh.o.z(26)), q3.u.D, null, 1, 0.0f, null, g0Var2, (i3 & 14) | 12807168, 834);
                g0Var2.r(true);
                float f3 = 16;
                h0.c.h(z1.q(rVar3, f3), g0Var2);
                z6.b(z3.U(g0Var2, 2131887153), w50.c.n(rVar3, true, onSeeAllClicked), dl.a.m, kh.o.z(15), q3.u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 48, 260008);
                g0Var = g0Var2;
                g0Var.r(true);
                p1 p1VarE = h0.c.e(f3, 0.0f, 2);
                h0.f fVarG = h0.i.g(f2);
                ?? r15 = reciters;
                boolean z11 = ((i8 & 896) == 256 ? true : z9) | (((i8 & 112) == 32 || g0Var.i((Object) r15)) ? true : z9) | ((i8 & 7168) == 2048 ? true : z9) | ((57344 & i8) == 16384 ? true : z9);
                Object objN = g0Var.N();
                if (z11 || objN == l1.i.a) {
                    z4 = z;
                    objN = new q((u30.b) r15, downloadedReciters, onReciterClicked, z4);
                    g0Var.n0(objN);
                } else {
                    z4 = z;
                }
                k00.f.e(null, null, p1VarE, fVarG, null, null, false, null, (u00.k) objN, g0Var, 24960, 491);
                g0Var.r(true);
                z5 = z8;
                rVar2 = rVar4;
                r14 = r15;
            }
            r1VarT.d = nVar;
        }
        r14 = reciters;
        z4 = z;
        g0Var = g0Var2;
        g0Var.V();
        rVar2 = rVar;
        z5 = z3;
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i9 = 1;
            final ?? r2 = r14;
            final boolean z12 = z4;
            nVar = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    switch (i9) {
                        case 0:
                            ((Integer) obj2).getClass();
                            a.h(title, r2, z12, downloadedReciters, onReciterClicked, onSeeAllClicked, rVar2, z5, (l1.j) obj, l1.q.K(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            a.h(title, r2, z12, downloadedReciters, onReciterClicked, onSeeAllClicked, rVar2, z5, (l1.j) obj, l1.q.K(i | 1), i2);
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }

    public static final void i(bx.c cVar, boolean z, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(383110492);
        int i2 = (g0Var.i(cVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            wb.h hVar = new wb.h((Context) g0Var.k(c3.o0.b));
            String str = cVar != null ? cVar.e : null;
            if (str == null || str.length() == 0) {
                str = null;
            }
            hVar.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            z.n.c(jVarI, (String) null, rd.a.g0(12, 0, dl.a.s, f2.h.c(z1.m(b2.o.A, z ? 150 : 100), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d(cVar, z, i, 0);
        }
    }

    public static final void j(bx.c cVar, boolean z, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1705051598);
        int i2 = (g0Var.i(cVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            wb.h hVar = new wb.h((Context) g0Var.k(c3.o0.b));
            String str = cVar != null ? cVar.e : null;
            if (str == null || str.length() == 0) {
                str = null;
            }
            hVar.c = str;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            z.n.c(jVarI, (String) null, rd.a.g0(12, 0, dl.a.s, f2.h.c(z1.m(b2.o.A, z ? 108 : 66), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d(cVar, z, i, 1);
        }
    }
}
