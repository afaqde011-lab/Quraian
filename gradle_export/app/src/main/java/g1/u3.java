package g1;

import com.google.android.gms.cast.Cast;

public abstract class u3 {

    public static final l1.q2 f5999a;

    static {
        rd.a.J(new e00.g(20));
        f5999a = new l1.q2(new e00.g(21));
    }

    public static final void a(q0 q0Var, x4 x4Var, f6 f6Var, l8 l8Var, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(904511636);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(q0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(x4Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(f6Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.g(l8Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.i(cVar) ? 16384 : 8192;
        }
        if (g0Var.S(i11 & 1, (i11 & 9363) != 9362)) {
            g0Var.X();
            if ((i10 & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            z5 z5VarA = y5.a(0.0f, 7, false);
            long j9 = q0Var.f5907a;
            boolean zF = g0Var.f(j9);
            Object objN = g0Var.N();
            if (zF || objN == l1.i.f9868a) {
                objN = new e1.a1(j9, i2.t.b(0.4f, j9));
                g0Var.n0(objN);
            }
            l1.q.b(new l1.q1[]{r0.f5948a.a(q0Var), f5999a.a(x4Var), z.s0.f16964a.a(z5VarA), g6.f5806a.a(f6Var), e1.b1.f4956a.a((e1.a1) objN), m8.f5890a.a(l8Var)}, v1.d.d(-1750539308, new w(l8Var, cVar, 5), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new t3(q0Var, x4Var, f6Var, l8Var, cVar, i10, 0);
        }
    }

    public static final void b(q0 q0Var, f6 f6Var, l8 l8Var, v1.c cVar, l1.j jVar, int i10) {
        f6 f6Var2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-449719819);
        int i11 = i10 | (g0Var.g(q0Var) ? 4 : 2) | 16 | (g0Var.i(cVar) ? 2048 : 1024);
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                f6Var = (f6) g0Var.k(g6.f5806a);
            } else {
                g0Var.V();
            }
            int i12 = i11 & (-113);
            f6 f6Var3 = f6Var;
            g0Var.s();
            a(q0Var, (x4) g0Var.k(f5999a), f6Var3, l8Var, cVar, g0Var, (i12 & 14) | 3072 | ((i12 << 3) & 57344));
            f6Var2 = f6Var3;
        } else {
            g0Var.V();
            f6Var2 = f6Var;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new dz.k(q0Var, f6Var2, l8Var, cVar, i10, 5);
        }
    }
}
