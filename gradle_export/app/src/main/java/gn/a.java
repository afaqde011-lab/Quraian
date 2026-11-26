package gn;

import a1.y1;
import ab.a0;
import al.i;
import android.content.Context;
import b6.m;
import c00.k;
import dn.l;
import g00.b0;
import h00.q;
import l1.g0;
import l1.j;
import l1.r1;
import ta.c0;
import u00.n;
import u00.o;
import y3.h;

public abstract class a {
    public static final v1.c a = new v1.c(new eu.b(14), 243131832, false);

    public static final void a(hn.a aVar, float f, m mVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1965688596);
        int i2 = (g0Var.g(aVar) ? 4 : 2) | i | (g0Var.d(f) ? 32 : 16) | (g0Var.g(mVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            c0.d(ze.d.v(mVar), 1, v1.d.d(-412768720, new e(aVar, f, 0), g0Var), g0Var, 3072, 2);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new k(aVar, f, mVar, i, 2);
        }
    }

    public static final void b(hn.b state, float f, j jVar, int i) {
        hn.b bVar;
        int i2;
        int i3;
        float f2;
        kotlin.jvm.internal.m.e(state, "state");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1593834623);
        int i4 = 4;
        int i5 = (g0Var.g(state) ? 4 : 2) | i | (g0Var.d(f) ? 32 : 16);
        if (g0Var.S(i5 & 1, (i5 & 19) != 18)) {
            float f3 = 64;
            while (true) {
                if (i4 <= 0) {
                    i2 = 12;
                    i3 = 1;
                    f2 = f3;
                    break;
                }
                float fZ = a0.Z(f, f3, 12, i4);
                if (y3.f.a(fZ, 40) >= 0 || i4 == 1) {
                    i3 = i4;
                    i2 = 12;
                    f2 = fZ;
                    break;
                }
                i4--;
            }
            bVar = state;
            c(bVar, i3, f2, i2, true, g0Var, (i5 & 14) | 27648);
        } else {
            bVar = state;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(bVar, f, i, 0);
        }
    }

    public static final void c(final hn.b state, final int i, final float f, final float f2, final boolean z, j jVar, final int i2) {
        j jVar2;
        kotlin.jvm.internal.m.e(state, "state");
        j jVar3 = (g0) jVar;
        jVar3.e0(1708742238);
        int i3 = (jVar3.g(state) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= jVar3.e(i) ? 32 : 16;
        }
        int i4 = i3 | (jVar3.d(f) ? 256 : 128);
        if (jVar3.S(i4 & 1, (i4 & 9363) != 9362)) {
            jVar2 = jVar3;
            w00.a.b(ze.d.u(b6.k.a), 0, 0, v1.d.d(-944810924, new o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    j6.g Column = (j6.g) obj;
                    g0 g0Var = (j) obj2;
                    ((Integer) obj3).getClass();
                    kotlin.jvm.internal.m.e(Column, "$this$Column");
                    m mVar = b6.k.a;
                    c0.d(ze.d.D(ze.d.v(mVar), 20), 1, a.a, g0Var, 3072, 2);
                    float f3 = f2;
                    a.a.f(ze.d.D(mVar, f3), g0Var, 0);
                    g0 g0Var2 = g0Var;
                    g0Var2.c0(-1725177558);
                    int i5 = 0;
                    for (Object obj4 : q.j1(state.a, i)) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            va.a.k0();
                            throw null;
                        }
                        hn.a aVar = (hn.a) obj4;
                        if (i5 > 0) {
                            g0Var2.c0(1469114913);
                            a.a.f(ze.d.D(mVar, f3), g0Var, 0);
                            g0Var2.r(false);
                        } else {
                            g0Var2.c0(1469195637);
                            g0Var2.r(false);
                        }
                        float f4 = f;
                        a.a(aVar, f4, z ? ze.d.D(mVar, f4) : mVar, g0Var, 0);
                        i5 = i6;
                    }
                    g0Var2.r(false);
                    a.a.f(Column.a(mVar), g0Var, 0);
                    return b0.a;
                }
            }, jVar3), jVar2, 3072, 6);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.c(state, i, f, f2, z, (j) obj, l1.q.K(i2 | 1));
                    return b0.a;
                }
            };
        }
    }

    public static final void d(hn.b state, float f, j jVar, int i) {
        hn.b bVar;
        kotlin.jvm.internal.m.e(state, "state");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1044197119);
        int i2 = (g0Var.g(state) ? 4 : 2) | i | (g0Var.d(f) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            float f2 = 10;
            bVar = state;
            c(bVar, 2, a0.Z(f, 44, f2, 2), f2, false, g0Var, (i2 & 14) | 27696);
        } else {
            bVar = state;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(bVar, f, i, 1);
        }
    }

    public static final void e(hn.a aVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-260352211);
        int i2 = (g0Var.g(aVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            w00.a.b(ze.d.u(b6.k.a), 0, 0, v1.d.d(-1462331785, new e(aVar, a0.D0(h.b(l.A.b(((h) g0Var.k(b6.g.a)).a))), 2), g0Var), g0Var, 3072, 6);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y1(aVar, i, 18);
        }
    }

    public static final void f(hn.b bVar, final l lVar, j jVar, int i) {
        final hn.b bVar2;
        l lVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(774508453);
        int i2 = (g0Var.g(bVar) ? 4 : 2) | i | (g0Var.e(lVar.ordinal()) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            final Context context = (Context) g0Var.k(b6.g.b);
            final long jB = lVar.b(((h) g0Var.k(b6.g.a)).a);
            final float dimension = context.getResources().getDimension(2131166319) / context.getResources().getDisplayMetrics().density;
            bVar2 = bVar;
            lVar2 = lVar;
            va.a.b(ze.d.u(b6.k.a), j6.c.d, v1.d.d(309703559, new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    j jVar2 = (j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    g0 g0Var2 = (g0) jVar2;
                    if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        l lVar3 = lVar;
                        m mVarD = lVar3.a(jVar2).d(new d6.c0(new o6.b(dimension)));
                        Context context2 = context;
                        va.a.b(ze.d.m(mVarD, e6.f.a(k00.f.U(context2))), (j6.c) null, v1.d.d(364000485, new g(context2, jB, bVar2, lVar3), jVar2), jVar2, 384, 2);
                    } else {
                        g0Var2.V();
                    }
                    return b0.a;
                }
            }, g0Var), g0Var, 384, 0);
        } else {
            bVar2 = bVar;
            lVar2 = lVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new i(bVar2, lVar2, i, 18);
        }
    }
}
