package yy;

import b2.r;
import b3.g;
import b3.h;
import com.google.android.gms.internal.measurement.y3;
import g1.o3;
import g1.z6;
import h0.i;
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
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import p0.e;
import p0.f;
import qo.s;
import x3.k;
import x3.l;
import z.n;

public abstract class b {
    public static final e a = f.a(24);

    public static final void a(String buttonText, String subtitle, u00.a onClearDataClicked, j jVar, int i) {
        long jZ;
        float f;
        m.e(buttonText, "buttonText");
        m.e(subtitle, "subtitle");
        m.e(onClearDataClicked, "onClearDataClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-855430868);
        int i2 = i | (g0Var.g(buttonText) ? 4 : 2) | (g0Var.g(subtitle) ? 32 : 16) | (g0Var.i(onClearDataClicked) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                jZ = o.z(14);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ = o.z(18);
            }
            long j = jZ;
            int iOrdinal2 = aVar.ordinal();
            if (iOrdinal2 == 0) {
                f = 16;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 20;
            }
            v vVarA = u.a(i.g(8), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            r rVarC = b2.a.c(oVar, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = h.f;
            q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = h.d;
            q.I(rVarC, g0Var, fVar4);
            r rVarD = h0.c.D(w50.c.n(n.f(f2.h.c(z1.d(oVar, 1.0f), a), t.b(0.08f, dl.a.i), b0.b), true, onClearDataClicked), 16, f);
            v1 v1VarA = t1.a(i.a, b2.b.K, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            r rVarM = z1.m(oVar, 20);
            m2.b bVarR = y3.R(2131231403, g0Var, 0);
            long j2 = dl.a.R;
            o3.a(bVarR, (String) null, rVarM, j2, g0Var, 440, 0);
            z6.b(buttonText, h0.c.G(oVar, 12, 0.0f, 0.0f, 0.0f, 14), j2, j, q3.u.C, (q3.i) null, 0L, (l) null, (k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | 1572912, 24960, 241576);
            g0Var.r(true);
            z6.b(subtitle, (r) null, dl.a.p, o.z(12), (q3.u) null, (q3.i) null, 0L, (l) null, (k) null, o.z(14), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 3) & 14) | 24576, 48, 260074);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new s(i, 4, buttonText, subtitle, onClearDataClicked);
        }
    }
}
