package yy;

import b2.o;
import b2.r;
import b3.g;
import b3.h;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g00.s;
import g1.z6;
import h0.c1;
import h0.i;
import h0.t1;
import h0.v;
import h0.v1;
import h0.z1;
import i2.t;
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
import q3.u;
import u00.n;
import x3.k;
import x3.l;

public abstract class d {
    public static final e a = f.a(24);
    public static final float b = 12;

    public static final void a(final ry.d dVar, final String str, final float f, final float f2, final long j, j jVar, final int i) {
        g0 g0Var;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1467929033);
        int i2 = i | (g0Var2.e(dVar.ordinal()) ? 4 : 2) | (g0Var2.g(str) ? 32 : 16) | (g0Var2.d(f) ? 256 : 128) | (g0Var2.d(f2) ? 2048 : 1024) | (g0Var2.f(j) ? 16384 : 8192);
        if (g0Var2.S(i2 & 1, (i2 & 9363) != 9362)) {
            String strU = z3.U(g0Var2, dVar.A);
            r rVarD = h0.c.D(z1.d(o.A, 1.0f), f, f2);
            h0.b bVar = i.a;
            v1 v1VarA = t1.a(i.g(b), b2.b.K, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarD, g0Var2);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(v1VarA, g0Var2, h.f);
            q.I(m1VarM, g0Var2, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var2, h.g);
            q.E(g0Var2, h.h);
            q.I(rVarC, g0Var2, h.d);
            long j2 = dl.a.k;
            u uVar = u.C;
            int i3 = i2 & 57344;
            z6.b(strU, (r) null, j2, j, uVar, (q3.i) null, 0L, (l) null, (k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var2, i3 | 1572864, 24960, 241578);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c.h(new c1(1.0f, true), g0Var2);
            z6.b(str, (r) null, j2, j, uVar, (q3.i) null, 0L, (l) null, (k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var2, ((i2 >> 3) & 14) | 1572864 | i3, 24960, 241578);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n(str, f, f2, j, i) {
                public final String B;
                public final float C;
                public final float D;
                public final long E;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(1);
                    d.a(this.A, this.B, this.C, this.D, this.E, (j) obj, iK);
                    return b0.a;
                }
            };
        }
    }

    public static final void b(String str, String str2, String str3, j jVar, int i) {
        float f;
        float f2;
        long jZ;
        String str4;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1740916146);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | (g0Var.g(str2) ? 32 : 16) | (g0Var.g(str3) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                f = 16;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 24;
            }
            float f3 = f;
            int iOrdinal2 = aVar.ordinal();
            if (iOrdinal2 == 0) {
                f2 = 18;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f2 = 20;
            }
            int iOrdinal3 = aVar.ordinal();
            if (iOrdinal3 == 0) {
                jZ = kh.o.z(14);
            } else {
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ = kh.o.z(18);
            }
            long j = jZ;
            r rVarF = z.n.f(f2.h.c(z1.d(o.A, 1.0f), a), t.b(0.08f, dl.a.i), i2.b0.b);
            v vVarA = h0.u.a(i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, h.f);
            q.I(m1VarM, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC, g0Var, h.d);
            g0Var.c0(-743779059);
            n00.b bVar = ry.d.C;
            bVar.getClass();
            s sVar = new s(bVar, 4);
            while (sVar.hasNext()) {
                ry.d dVar = (ry.d) sVar.next();
                m.e(dVar, "<this>");
                int iOrdinal4 = dVar.ordinal();
                if (iOrdinal4 == 0) {
                    str4 = str;
                } else if (iOrdinal4 == 1) {
                    str4 = str2;
                } else {
                    if (iOrdinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str4 = str3;
                }
                a(dVar, str4, f3, f2, j, g0Var, 0);
                f2 = f2;
            }
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new qo.s(i, 5, str, str2, str3);
        }
    }
}
