package hy;

import b2.r;
import f2.h;
import g1.s;
import g1.t3;
import g1.x5;
import g1.z6;
import h0.i;
import h0.n1;
import h0.p1;
import h0.u;
import h0.v;
import h0.z1;
import i2.b0;
import i2.t;
import kh.o;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import x3.k;
import x3.l;
import z.n;
import z2.w0;

public abstract class a {
    public static final float a = 20;

    public static final void a(String title, String message, r rVar, String str, u00.a aVar, j jVar, int i, int i2) {
        String str2;
        int i3;
        u00.a aVar2;
        int i4;
        String str3;
        u00.a aVar3;
        u00.a aVar4;
        boolean z;
        m.e(title, "title");
        m.e(message, "message");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1165131642);
        int i5 = i | (g0Var.g(title) ? 4 : 2) | (g0Var.g(message) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            str2 = str;
        } else {
            str2 = str;
            i3 = i5 | (g0Var.g(str2) ? 2048 : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i4 = i3 | (g0Var.i(aVar2) ? 16384 : 8192);
        }
        if (g0Var.S(i4 & 1, (i4 & 9363) != 9362)) {
            if (i6 != 0) {
                str2 = null;
            }
            u00.a aVar5 = i7 != 0 ? null : aVar2;
            r rVarC = h.c(z1.d(rVar, 1.0f), p0.f.a(a));
            long j = dl.a.i;
            float f = 16;
            r rVarC2 = h0.c.C(n.f(rVarC, t.b(0.08f, j), b0.b), f);
            v vVarA = u.a(i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC3 = b2.a.c(rVarC2, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC3, g0Var, fVar4);
            int i8 = i4;
            String str4 = str2;
            z6.b(title, (r) null, dl.a.n, o.z(17), q3.u.D, (q3.i) null, 0L, (l) null, (k) null, o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, (i8 & 14) | 1597440, 48, 260010);
            b2.o oVar = b2.o.A;
            z6.b(message, h0.c.G(oVar, 0.0f, 8, 0.0f, 0.0f, 13), t.b(0.5f, dl.a.k), o.z(15), q3.u.B, (q3.i) null, 0L, (l) null, (k) null, o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i8 >> 3) & 14) | 1597488, 48, 260008);
            g0Var = g0Var;
            if (str4 == null || aVar5 == null) {
                aVar4 = aVar5;
                z = true;
                g0Var.c0(-1994940346);
                g0Var.r(false);
            } else {
                g0Var.c0(-1995693770);
                r rVarD = z1.d(oVar, 1.0f);
                w0 w0VarD = h0.o.d(b2.b.E, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC4 = b2.a.c(rVarD, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD, g0Var, fVar);
                q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC4, g0Var, fVar4);
                r rVarG = h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13);
                p0.e eVarA = p0.f.a(32);
                p1 p1Var = s.a;
                aVar4 = aVar5;
                x5.a(aVar4, rVarG, false, eVarA, s.a(j, dl.a.l, 0L, 0L, g0Var, 12), (g1.u) null, (n1) null, (f0.i) null, v1.d.d(-1267515507, new fv.a(str4, 3), g0Var), g0Var, ((i8 >> 12) & 14) | 805306416, 484);
                g0Var = g0Var;
                z = true;
                g0Var.r(true);
                g0Var.r(false);
            }
            g0Var.r(z);
            aVar3 = aVar4;
            str3 = str4;
        } else {
            g0Var.V();
            str3 = str2;
            aVar3 = aVar2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new t3(title, message, rVar, str3, aVar3, i, i2);
        }
    }
}
