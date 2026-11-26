package sw;

import ab.y;
import android.content.Context;
import android.content.SharedPreferences;
import b2.r;
import b3.e;
import b3.g;
import b3.i;
import bp.c;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g1.o3;
import g1.z6;
import h0.o;
import h0.v;
import h0.v1;
import h0.z1;
import i2.t;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import lb.f;
import m3.r0;
import os.x;
import q3.u;
import ri.t1;
import tp.h;
import u00.n;
import ur.g1;
import wo.c0;
import x3.k;
import x3.l;
import z2.w0;

public final class a implements n {
    public final int A;

    public a(int i) {
        this.A = i;
    }

    public a(int i, int i2) {
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                e60.a factory = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it, "it");
                Context contextI = t1.i(factory);
                b0 b0Var = a0.a;
                return new jw.b(contextI, (c0) factory.f(b0Var.b(c0.class), null, null), (c) factory.f(b0Var.b(c.class), null, null), (lw.b) factory.f(b0Var.b(lw.b.class), null, null));
            case 1:
                e60.a factory2 = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it2, "it");
                b0 b0Var2 = a0.a;
                return new jw.a((c0) factory2.f(b0Var2.b(c0.class), null, null), (x) factory2.f(b0Var2.b(x.class), null, null));
            case 2:
                e60.a factory3 = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it3, "it");
                Context contextI2 = t1.i(factory3);
                b0 b0Var3 = a0.a;
                return new lw.b(contextI2, (f) factory3.f(b0Var3.b(f.class), null, null), (fu.a) factory3.f(b0Var3.b(fu.a.class), null, null));
            case 3:
                e60.a single = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it4, "it");
                b0 b0Var4 = a0.a;
                return new mw.a((jw.b) single.f(b0Var4.b(jw.b.class), null, null), (jw.a) single.f(b0Var4.b(jw.a.class), null, null), (lw.b) single.f(b0Var4.b(lw.b.class), null, null), (rw.a) single.f(b0Var4.b(rw.a.class), null, null));
            case 4:
                e60.a single2 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it5, "it");
                return new rw.a(y.l0(t1.i(single2)));
            case 5:
                return (h2.b) obj2;
            case 6:
                ((Integer) obj2).getClass();
                bi.b.c((j) obj, q.K(1));
                return g00.b0.a;
            case 7:
                ((Integer) obj2).getClass();
                h.c((j) obj, q.K(1));
                return g00.b0.a;
            case 8:
                g0 g0Var = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r rVarF = z.n.f(z1.c, dl.a.L, i2.b0.b);
                    w0 w0VarD = o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarF, g0Var);
                    i.c.getClass();
                    g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(w0VarD, g0Var, b3.h.f);
                    q.I(m1VarM, g0Var, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    q.E(g0Var, b3.h.h);
                    q.I(rVarC, g0Var, b3.h.d);
                    y3.e(g0Var, 0);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 9:
                ((Integer) obj2).getClass();
                tr.a.d((j) obj, q.K(1));
                return g00.b0.a;
            case 10:
                ((Integer) obj2).getClass();
                g1.d((j) obj, q.K(1));
                return g00.b0.a;
            case 11:
                ((Integer) obj2).getClass();
                uy.m.b((j) obj, q.K(1));
                return g00.b0.a;
            case 12:
                List old = (List) obj;
                List list = (List) obj2;
                m.e(old, "old");
                m.e(list, "new");
                return Boolean.valueOf(c7.i.k(old).equals(c7.i.k(list)));
            case 13:
                e60.a single3 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it6, "it");
                return new tx.a((SharedPreferences) single3.f(a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 14:
                ((Integer) obj2).getClass();
                g0 g0Var3 = (j) obj;
                g0Var3.c0(735280693);
                h0.c0 c0VarI = h0.c.i(0, 14);
                g0Var3.r(false);
                return c0VarI;
            case 15:
                return va.a.h();
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                e60.a single4 = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                m.e(single4, "$this$single");
                m.e(it7, "it");
                b0 b0Var5 = a0.a;
                return new vp.x((c0) single4.f(b0Var5.b(c0.class), null, null), (SharedPreferences) single4.f(b0Var5.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 17:
                ((Integer) obj2).getClass();
                g0 g0Var4 = (j) obj;
                g0Var4.c0(2003848437);
                h0.c0 c0VarI2 = h0.c.i(0, 14);
                g0Var4.r(false);
                return c0VarI2;
            case 18:
                g0 g0Var5 = (j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z3.j(y3.R(2131231358, g0Var5, 0), (String) null, z1.m(b2.o.A, 10), 0L, g0Var5, 440, 8);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case 19:
                g0 g0Var7 = (j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    float f = 12;
                    b2.o oVar = b2.o.A;
                    r rVarD = h0.c.D(oVar, f, 8);
                    v1 v1VarA = h0.t1.a(h0.i.g(f), b2.b.K, g0Var7, 54);
                    int iHashCode2 = Long.hashCode(g0Var8.T);
                    m1 m1VarM2 = g0Var8.m();
                    r rVarC2 = b2.a.c(rVarD, g0Var7);
                    i.c.getClass();
                    g gVar2 = b3.h.b;
                    g0Var8.g0();
                    if (g0Var8.S) {
                        g0Var8.l(gVar2);
                    } else {
                        g0Var8.q0();
                    }
                    q.I(v1VarA, g0Var7, b3.h.f);
                    q.I(m1VarM2, g0Var7, b3.h.e);
                    q.I(Integer.valueOf(iHashCode2), g0Var7, b3.h.g);
                    q.E(g0Var7, b3.h.h);
                    q.I(rVarC2, g0Var7, b3.h.d);
                    r rVarM = z1.m(oVar, 20);
                    m2.b bVarR = y3.R(2131231383, g0Var7, 0);
                    long j = dl.a.k;
                    o3.a(bVarR, (String) null, rVarM, j, g0Var7, 440, 0);
                    z6.b(z3.U(g0Var7, 2131887263), (r) null, j, kh.o.z(18), (u) null, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(18), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var7, 24576, 48, 260074);
                    g0Var8.r(true);
                } else {
                    g0Var8.V();
                }
                return g00.b0.a;
            case 20:
                g0 g0Var9 = (j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                boolean z = (iIntValue4 & 3) != 2;
                g0 g0Var10 = g0Var9;
                a30.x xVar = g0Var10.a;
                if (g0Var10.S(iIntValue4 & 1, z)) {
                    float f2 = 12;
                    b2.o oVar2 = b2.o.A;
                    r rVarD2 = h0.c.D(oVar2, f2, 8);
                    v1 v1VarA2 = h0.t1.a(h0.i.g(f2), b2.b.K, g0Var9, 54);
                    int iHashCode3 = Long.hashCode(g0Var10.T);
                    m1 m1VarM3 = g0Var10.m();
                    r rVarC3 = b2.a.c(rVarD2, g0Var9);
                    i.c.getClass();
                    g gVar3 = b3.h.b;
                    g0Var10.g0();
                    if (g0Var10.S) {
                        g0Var10.l(gVar3);
                    } else {
                        g0Var10.q0();
                    }
                    b3.f fVar = b3.h.f;
                    q.I(v1VarA2, g0Var9, fVar);
                    b3.f fVar2 = b3.h.e;
                    q.I(m1VarM3, g0Var9, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    b3.f fVar3 = b3.h.g;
                    q.I(numValueOf, g0Var9, fVar3);
                    e eVar = b3.h.h;
                    q.E(g0Var9, eVar);
                    b3.f fVar4 = b3.h.d;
                    q.I(rVarC3, g0Var9, fVar4);
                    r rVarM2 = z1.m(oVar2, 20);
                    m2.b bVarR2 = y3.R(2131231403, g0Var9, 0);
                    long j2 = dl.a.k;
                    o3.a(bVarR2, (String) null, rVarM2, j2, g0Var9, 440, 0);
                    v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var9, 0);
                    int iHashCode4 = Long.hashCode(g0Var10.T);
                    m1 m1VarM4 = g0Var10.m();
                    r rVarC4 = b2.a.c(oVar2, g0Var9);
                    g0Var10.g0();
                    if (g0Var10.S) {
                        g0Var10.l(gVar3);
                    } else {
                        g0Var10.q0();
                    }
                    q.I(vVarA, g0Var9, fVar);
                    q.I(m1VarM4, g0Var9, fVar2);
                    x5.u(iHashCode4, g0Var9, fVar3, g0Var9, eVar);
                    q.I(rVarC4, g0Var9, fVar4);
                    z6.b(z3.U(g0Var9, 2131887188), (r) null, dl.a.R, kh.o.z(18), u.B, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(18), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var9, 1597440, 48, 260010);
                    z6.b(z3.U(g0Var9, 2131887187), (r) null, t.b(0.6f, j2), kh.o.z(14), (u) null, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(14), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var9, 24576, 48, 260074);
                    g0Var10.r(true);
                    g0Var10.r(true);
                } else {
                    g0Var10.V();
                }
                return g00.b0.a;
            case 21:
                g0 g0Var11 = (j) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                g0 g0Var12 = g0Var11;
                if (!g0Var12.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    g0Var12.V();
                }
                return g00.b0.a;
            case 22:
                ((Integer) obj2).getClass();
                wr.k.e((j) obj, q.K(1));
                return g00.b0.a;
            case 23:
                ((Integer) obj2).getClass();
                wr.k.G((j) obj, q.K(1));
                return g00.b0.a;
            case 24:
                ((Integer) obj2).getClass();
                wr.k.d0((j) obj, q.K(1));
                return g00.b0.a;
            case 25:
                ((Integer) obj2).getClass();
                wr.k.r((j) obj, q.K(1));
                return g00.b0.a;
            case 26:
                ((Integer) obj2).getClass();
                wr.k.b0((j) obj, q.K(1));
                return g00.b0.a;
            case 27:
                ((Integer) obj2).getClass();
                wr.k.f0((j) obj, q.K(1));
                return g00.b0.a;
            case 28:
                ((Integer) obj2).getClass();
                wr.k.p((j) obj, q.K(1));
                return g00.b0.a;
            default:
                ((Integer) obj2).getClass();
                wr.k.a0((j) obj, q.K(1));
                return g00.b0.a;
        }
    }
}
