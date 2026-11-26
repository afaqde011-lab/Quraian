package st;

import ab.a0;
import android.content.res.Configuration;
import b2.o;
import b2.r;
import c3.o0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g00.b0;
import g1.z6;
import gv.p0;
import h0.c1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.t;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import u00.n;
import w.c0;
import x.q1;
import x.y;
import x3.k;
import x3.l;

public abstract class g {
    public static final float a = 85;

    public static final void a(int i, int i2, String str, String str2, boolean z, boolean z2, u00.a aVar, r rVar, l1.j jVar, int i3) {
        g0 g0Var;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1808489519);
        int i4 = i3 | (g0Var2.e(i) ? 4 : 2) | (g0Var2.e(i2) ? 32 : 16) | (g0Var2.g(str) ? 256 : 128) | (g0Var2.g(str2) ? 2048 : 1024) | (g0Var2.h(z) ? 16384 : 8192) | (g0Var2.i(aVar) ? 1048576 : 524288) | (g0Var2.g(rVar) ? 8388608 : 4194304);
        if (g0Var2.S(i4 & 1, (4793491 & i4) != 4793490)) {
            r rVarO = w50.c.o(rVar, false, null, aVar, 7);
            v vVarA = u.a(h0.i.c, b2.b.N, g0Var2, 48);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarO, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(vVarA, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var2, fVar4);
            int i5 = (i4 >> 12) & 14;
            int i6 = i4 << 3;
            b(z, i, i2, g0Var2, i5 | (i6 & 112) | (i6 & 896));
            o oVar = o.A;
            h0.c.h(z1.e(oVar, 8), g0Var2);
            float f = 2;
            v1 v1VarA = t1.a(h0.i.g(f), b2.b.K, g0Var2, 54);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC2 = b2.a.c(oVar, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(v1VarA, g0Var2, fVar);
            q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC2, g0Var2, fVar4);
            if (z2) {
                g0Var2.c0(2102847949);
                h0.c.h(z1.m(oVar, 14), g0Var2);
                g0Var2.r(false);
            } else {
                g0Var2.c0(2102949815);
                g0Var2.r(false);
            }
            long j = dl.a.k;
            z6.b(str, (r) null, j, kh.o.z(16), q3.u.L, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(21), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, ((i4 >> 6) & 14) | 1597440, 48, 260010);
            g0Var = g0Var2;
            g0Var.r(true);
            k00.f.a(str2, h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13), t.b(0.5f, j), kh.o.z(13), new y3.o(kh.o.z(18)), null, new k(3), 2, 0.0f, null, g0Var, ((i4 >> 9) & 14) | 12610608, 800);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c.h(new c1(1.0f, true), g0Var);
            bi.b.f(i5 | 48, h0.c.G(oVar, 0.0f, 16, 0.0f, 0.0f, 13), g0Var, z);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new gv.u(i, i2, str, str2, z, z2, aVar, rVar, i3);
        }
    }

    public static final void b(final boolean z, final int i, final int i2, l1.j jVar, final int i3) {
        int i4;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1352460703);
        if ((i3 & 6) == 0) {
            i4 = (g0Var.h(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g0Var.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g0Var.e(i2) ? 256 : 128;
        }
        if (g0Var.S(i4 & 1, (i4 & 147) != 146)) {
            sg.f fVar = cm.a.A;
            Configuration configuration = (Configuration) g0Var.k(o0.a);
            fVar.getClass();
            boolean z2 = sg.f.J(configuration) == cm.a.C;
            q1 q1VarW = x.c.w(RCHTTPStatusCodes.UNSUCCESSFUL, 0, (x.v) null, 6);
            o oVar = o.A;
            c0.f(Boolean.valueOf(z), z2 ? h0.c.m(h0.c.E(z1.d(oVar, 1.0f), 23, 0.0f, 2), 0.94871795f) : z1.e(z1.d(oVar, 1.0f), 117), q1VarW, "layoutModePreview", v1.d.d(-275115234, new gv.a(i, i2, 1), g0Var), g0Var, (i4 & 14) | 28032, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(i3 | 1);
                    g.b(z, i, i2, (l1.j) obj, iK);
                    return b0.a;
                }
            };
        }
    }

    public static final void c(boolean z, u00.k onSelect, l1.j jVar, int i) {
        m.e(onSelect, "onSelect");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-500905448);
        int i2 = (g0Var.h(z) ? 4 : 2) | i | (g0Var.i(onSelect) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            f50.k.e(null, v1.d.d(1357295011, new sp.b(1, onSelect, z), g0Var), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new pp.g(i, onSelect, z);
        }
    }

    public static final void d(int i, u00.k onStepChange, l1.j jVar, int i2) {
        m.e(onStepChange, "onStepChange");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1069586496);
        int i3 = (g0Var.e(i) ? 4 : 2) | i2 | (g0Var.i(onStepChange) ? 32 : 16);
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            List list = ot.c.a;
            int i4 = ot.c.d;
            f50.k.e(null, v1.d.d(-789999733, new p0(i, onStepChange, x.d.b(((Number) list.get(a0.y(i, 0, i4 - 1))).floatValue(), (y) null, (String) null, g0Var, 0, 30), x.d.b(((Number) list.get(a0.y(i, 0, i4 - 1))).floatValue() * 1.86f, (y) null, (String) null, g0Var, 0, 30)), g0Var), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.o(i, i2, onStepChange);
        }
    }
}
