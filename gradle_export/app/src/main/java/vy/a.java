package vy;

import b2.o;
import b2.r;
import b3.e;
import f2.h;
import h0.c1;
import h0.i;
import h0.t1;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.t;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import p0.f;
import q3.u;
import u00.n;
import x3.k;
import z2.w0;

public abstract class a {
    public static final float a = 54;

    public static final void a(String value, String title, String subtitle, r rVar, j jVar, int i) {
        r rVar2;
        int i2;
        n nVar;
        r rVar3;
        n nVar2;
        n nVar3;
        e eVar;
        u00.a aVar;
        int i3;
        int i4;
        m.e(value, "value");
        m.e(title, "title");
        m.e(subtitle, "subtitle");
        g0 g0Var = (g0) jVar;
        g0Var.e0(2007471593);
        int i5 = i | (g0Var.g(value) ? 4 : 2) | (g0Var.g(title) ? 32 : 16) | (g0Var.g(subtitle) ? 256 : 128) | 3072;
        if (g0Var.S(i5 & 1, (i5 & 1171) != 1170)) {
            r rVar4 = o.A;
            float f = 12;
            float f2 = 16;
            r rVarF = h0.c.F(z.n.f(h.c(z1.d(rVar4, 1.0f), f.a(24)), t.b(0.1f, dl.a.i), b0.b), f, f2, f2, f2);
            v1 v1VarA = t1.a(i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            u00.a aVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar2);
            } else {
                g0Var.q0();
            }
            n nVar4 = b3.h.f;
            q.I(v1VarA, g0Var, nVar4);
            n nVar5 = b3.h.e;
            q.I(m1VarM, g0Var, nVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar = b3.h.g;
            q.I(numValueOf, g0Var, fVar);
            e eVar2 = b3.h.h;
            q.E(g0Var, eVar2);
            n nVar6 = b3.h.d;
            q.I(rVarC, g0Var, nVar6);
            r rVarE = z1.e(z1.q(h0.c.G(rVar4, 0.0f, 0.0f, f, 0.0f, 11), a + 8), 60);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar2);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, nVar4);
            q.I(m1VarM2, g0Var, nVar5);
            a1.b.v(iHashCode2, g0Var, fVar, g0Var, eVar2);
            q.I(rVarC2, g0Var, nVar6);
            if (value.equals("0")) {
                g0Var.c0(231598009);
                i3 = 0;
                i2 = i5;
                rVar3 = rVar4;
                aVar = aVar2;
                nVar2 = nVar6;
                nVar = nVar4;
                nVar3 = nVar5;
                eVar = eVar2;
                i4 = 16;
                k00.f.a(value, z1.d(rVar4, 1.0f), dl.a.U, kh.o.z(60), new y3.o(kh.o.z(42)), u.M, new k(3), 1, 0.0f, null, g0Var, (i5 & 14) | 12807216, 768);
                g0Var.r(false);
            } else {
                i2 = i5;
                nVar = nVar4;
                rVar3 = rVar4;
                nVar2 = nVar6;
                nVar3 = nVar5;
                eVar = eVar2;
                aVar = aVar2;
                i3 = 0;
                i4 = 16;
                g0Var.c0(232058235);
                k00.f.a(value, z1.d(rVar4, 1.0f), dl.a.U, kh.o.z(36), new y3.o(kh.o.z(40)), u.M, new k(3), 1, 0.4f, null, g0Var, (i2 & 14) | 113470512, 512);
                g0Var.r(false);
            }
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = h0.u.a(i.c, b2.b.M, g0Var, i3);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC3 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, nVar);
            q.I(m1VarM3, g0Var, nVar3);
            a1.b.v(iHashCode3, g0Var, fVar, g0Var, eVar);
            q.I(rVarC3, g0Var, nVar2);
            k00.f.a(title, null, dl.a.k, kh.o.z(i4), new y3.o(kh.o.z(20)), u.L, null, 1, 0.0f, null, g0Var, ((i2 >> 3) & 14) | 12807168, 834);
            k00.f.a(subtitle, null, dl.a.o, kh.o.z(13), new y3.o(kh.o.z(18)), u.B, null, 2, 0.0f, null, g0Var, ((i2 >> 6) & 14) | 12807168, 834);
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(value, title, subtitle, rVar2, i, 17);
        }
    }
}
