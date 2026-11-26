package hy;

import android.content.Context;
import b2.i;
import b2.r;
import f2.h;
import g1.z6;
import h0.z1;
import i2.b0;
import i2.o0;
import i2.t;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import q3.u;
import x3.k;
import x3.l;
import z.n;
import z2.d1;
import z2.o;
import z2.p;
import z2.w0;

public abstract class b {
    public static final float a = 50;
    public static final float b = 16;
    public static final float c = 6;
    public static final float d = 22;

    public static final void a(cy.e result, r rVar, j jVar, int i) {
        int i2;
        r rVar2;
        String str;
        i iVar = b2.b.E;
        m.e(result, "result");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1995211217);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? g0Var.g(result) : g0Var.i(result) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = result.b.ordinal();
            d1 d1Var = o.a;
            float f = a;
            r rVar3 = b2.o.A;
            if (iOrdinal != 0) {
                o0 o0Var = b0.b;
                if (iOrdinal == 1) {
                    rVar2 = rVar3;
                    g0Var.c0(-1283850686);
                    r rVarF = n.f(h.c(z1.m(rVar2, f), p0.f.a(b)), t.b(0.1f, dl.a.i), o0Var);
                    w0 w0VarD = h0.o.d(iVar, false);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    r rVarC = b2.a.c(rVarF, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    q.I(w0VarD, g0Var, b3.h.f);
                    q.I(m1VarM, g0Var, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    q.E(g0Var, b3.h.h);
                    q.I(rVarC, g0Var, b3.h.d);
                    Integer num = result.e;
                    String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
                    z6.b(strValueOf == null ? "" : strValueOf, (r) null, dl.a.k, kh.o.z(20), u.D, (q3.i) null, 0L, (l) null, (k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
                    g0Var = g0Var;
                    g0Var.r(true);
                    g0Var.r(false);
                } else {
                    if (iOrdinal != 2) {
                        throw oi.k.r(g0Var, -1842558954, false);
                    }
                    g0Var.c0(-1283219154);
                    dw.a aVar = result.j;
                    boolean z = aVar != null && aVar.c();
                    float f2 = c;
                    if (z) {
                        g0Var.c0(-1283152566);
                        r rVarF2 = n.f(h.c(z1.m(rVar3, f), p0.f.a(f2)), dl.a.q, o0Var);
                        w0 w0VarD2 = h0.o.d(iVar, false);
                        int iHashCode2 = Long.hashCode(g0Var.T);
                        m1 m1VarM2 = g0Var.m();
                        r rVarC2 = b2.a.c(rVarF2, g0Var);
                        b3.i.c.getClass();
                        b3.g gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        q.I(w0VarD2, g0Var, b3.h.f);
                        q.I(m1VarM2, g0Var, b3.h.e);
                        q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                        q.E(g0Var, b3.h.h);
                        q.I(rVarC2, g0Var, b3.h.d);
                        wr.k.h(null, d, 0.0f, dl.a.h, g0Var, 48, 5);
                        g0Var = g0Var;
                        g0Var.r(true);
                        g0Var.r(false);
                        rVar2 = rVar3;
                    } else {
                        g0Var.c0(-1282646708);
                        String str2 = aVar != null ? aVar.f : null;
                        str = str2 != null ? str2 : "";
                        wb.h hVar = new wb.h((Context) g0Var.k(c3.o0.b));
                        hVar.c = str.length() > 0 ? str : null;
                        hVar.b();
                        mb.j jVarI = mb.l.i(hVar.a(), (p) null, g0Var, 0, 62);
                        rVar2 = rVar3;
                        n.c(jVarI, (String) null, rd.a.g0(f, 0, dl.a.s, h.c(z1.m(rVar3, f), p0.f.a(f2)), !(jVarI.j() instanceof mb.g) && r30.k.L0(str)), (b2.d) null, d1Var, 0.0f, g0Var, 24624, 104);
                        g0Var.r(false);
                    }
                    g0Var.r(false);
                }
            } else {
                rVar2 = rVar3;
                g0Var.c0(-1284761156);
                bx.c cVar = result.d;
                String str3 = cVar != null ? cVar.e : null;
                str = str3 != null ? str3 : "";
                wb.h hVar2 = new wb.h((Context) g0Var.k(c3.o0.b));
                if (!(str.length() > 0)) {
                    str = null;
                }
                hVar2.c = str;
                mb.j jVarI2 = mb.l.i(w.c.q(hVar2, 600), (p) null, g0Var, 0, 62);
                n.c(jVarI2, (String) null, rd.a.g0(f, 0, dl.a.s, h.c(z1.m(rVar2, f), p0.f.a), !(jVarI2.j() instanceof mb.g)), (b2.d) null, d1Var, 0.0f, g0Var, 24624, 104);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.l((Object) result, rVar2, i, 5);
        }
    }
}
