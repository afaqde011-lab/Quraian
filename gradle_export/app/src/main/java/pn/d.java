package pn;

import ab.a0;
import b6.k;
import bs.g;
import h00.q;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.w;
import l1.g0;
import l1.j;
import l1.r1;
import ta.c0;
import y3.f;

public abstract class d {
    public static final float a = (8 * 2) + (38 * 3);

    public static final void a(qn.b state, float f, j jVar, int i) {
        m.e(state, "state");
        u30.b bVar = state.a;
        g0 g0Var = (g0) jVar;
        g0Var.e0(963429758);
        int i2 = (g0Var.g(state) ? 4 : 2) | i | (g0Var.d(f) ? 32 : 16);
        int i3 = 0;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            qn.a aVar = (qn.a) q.L0(bVar);
            float f2 = 8;
            float f3 = 14 + 16 + f2;
            float f4 = a0.C(new f((f - f3) - a), new f(100), new f(112)).A;
            float f5 = (f - f4) - f3;
            w wVar = new w();
            float f6 = 48;
            wVar.A = f6;
            for (int i4 = 3; i4 > 0; i4--) {
                float f7 = (f5 - ((i4 - 1) * f2)) / i4;
                if (f.a(f7, 36) >= 0) {
                    wVar.A = p30.f.j0(new f(f7), new f(f6)).A;
                    i3 = i4;
                    break;
                }
            }
            va.a.b(ze.d.u(k.a), (j6.c) null, v1.d.d(498624864, new g(q.j1(q.H0(bVar, 1), i3), aVar, f4, wVar), g0Var), g0Var, 384, 2);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new kn.d(state, f, i, 2);
        }
    }

    public static final void b(qn.a aVar, float f, b6.m mVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1911349187);
        int i2 = (g0Var.g(aVar) ? 4 : 2) | i | (g0Var.d(f) ? 32 : 16) | 384;
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            mVar = k.a;
            c0.d(ze.d.v(mVar), 1, v1.d.d(-1014841183, new b(aVar, f, 1), g0Var), g0Var, 3072, 2);
        } else {
            g0Var.V();
        }
        b6.m mVar2 = mVar;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.k(aVar, f, mVar2, i, 5);
        }
    }
}
