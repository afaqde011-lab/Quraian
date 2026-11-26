package q0;

import com.google.android.gms.cast.Cast;

public abstract class c {

    public static final float f12575a;

    public static final float f12576b;

    static {
        float f3 = 25;
        f12575a = f3;
        f12576b = (f3 * 2.0f) / 2.4142137f;
    }

    public static final void a(e1.n nVar, b2.r rVar, long j9, l1.j jVar, int i10, int i11) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1776202187);
        int i12 = (g0Var.g(nVar) ? 4 : 2) | i10 | (g0Var.g(rVar) ? 32 : 16);
        if ((i10 & 384) == 0) {
            i12 |= ((i11 & 4) == 0 && g0Var.f(j9)) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i12 & 1, (i12 & 147) != 146)) {
            g0Var.X();
            if ((i10 & 1) != 0 && !g0Var.A()) {
                g0Var.V();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                i12 &= -897;
                j9 = 9205357640488583168L;
            }
            g0Var.s();
            int i13 = i12 & 14;
            boolean z10 = i13 == 4;
            Object objN = g0Var.N();
            if (z10 || objN == l1.i.f9868a) {
                objN = new a(nVar, 0);
                g0Var.n0(objN);
            }
            a.a.a(nVar, b2.b.B, v1.d.d(-1653527038, new b(j9, j3.q.c(rVar, false, (u00.k) objN)), g0Var), g0Var, i13 | 432);
        } else {
            g0Var.V();
        }
        long j10 = j9;
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new kx.n(nVar, rVar, j10, i10, i11, 2);
        }
    }

    public static final void b(b2.r rVar, l1.j jVar, int i10, int i11) {
        int i12;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else {
            i12 = (g0Var.g(rVar) ? 4 : 2) | i10;
        }
        if (g0Var.S(i12 & 1, (i12 & 3) != 2)) {
            if (i13 != 0) {
                rVar = b2.o.A;
            }
            h0.c.h(f2.h.f(h0.z1.n(rVar, f12576b, f12575a), new gj.h(((e1.a1) g0Var.k(e1.b1.f4956a)).f4954a, 4)), g0Var);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.h(rVar, i10, i11, 6);
        }
    }
}
