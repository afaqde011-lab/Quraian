package gv;

import l1.p2;
import w.b2;

public abstract class s {
    public static final float a = 44;
    public static final float b = 24;
    public static final float c = 36;

    public static final void a(bv.o1 o1Var, jk.a aVar, b2.r rVar, v1.c cVar, l1.j jVar, int i) {
        int i2;
        jk.a aVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(540044116);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(o1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            aVar2 = aVar;
            i2 |= g0Var.i(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.g(rVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            va.a.e(h0.z1.e(rVar, a), aVar2, p0.f.a(32), 32.0f, b2.b.E, false, 0.0f, 0.0f, new i2.t(((i2.t) b2.a(o1Var.m == null ? i2.t.b(0.5f, dl.a.P) : i2.t.b(0.1f, dl.a.i), (x.y) null, (String) null, g0Var, 0, 14).getValue()).a), v1.d.d(1510691256, new r(cVar, 0), g0Var), g0Var, (i2 & 112) | 805334016, 224);
            g0Var = g0Var;
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.a(o1Var, aVar, rVar, cVar, i);
        }
    }

    public static final void b(bv.o1 uiState, u00.k onAction, jk.a aVar, b2.r rVar, l1.j jVar, int i) {
        int i2;
        b2.r rVar2;
        float f;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1236944716);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(aVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            p2 p2VarB = x.d.b(uiState.R ? 1.0f : 0.7f, (x.y) null, (String) null, g0Var, 0, 30);
            if (uiState.D) {
                f = uiState.C ? 1.0f : 0.7f;
            } else {
                f = 0.2f;
            }
            int i4 = i3 >> 3;
            b2.r rVar3 = b2.o.A;
            a(uiState, aVar, rVar3, v1.d.d(1585931428, new bt.m0(uiState, onAction, p2VarB, x.d.b(f, (x.y) null, (String) null, g0Var, 0, 30), x.d.b(uiState.v ? 1.0f : 0.7f, (x.y) null, (String) null, g0Var, 0, 30), 2), g0Var), g0Var, (i3 & 14) | 3072 | (i4 & 112) | (i4 & 896));
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.a(uiState, onAction, aVar, rVar2, i, 1);
        }
    }

    public static final void c(bv.o1 uiState, u00.k onAction, kk.c cVar, b2.r rVar, l1.j jVar, int i) {
        int i2;
        long jB;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1546446180);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.g(rVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            p2 p2VarB = x.d.b(uiState.w ? 1.0f : 0.7f, (x.y) null, (String) null, g0Var, 0, 30);
            if (uiState.k) {
                jB = dl.a.k;
            } else {
                jB = uiState.l ? dl.a.i : i2.t.b(0.7f, dl.a.i);
            }
            int i4 = i3 >> 3;
            a(uiState, cVar, rVar, v1.d.d(63368364, new i1(uiState, jB, onAction, p2VarB), g0Var), g0Var, (i3 & 14) | 3072 | (i4 & 112) | (i4 & 896));
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.a(uiState, onAction, cVar, rVar, i, 3);
        }
    }
}
