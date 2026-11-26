package a1;

import c3.g3;
import java.util.concurrent.CancellationException;

public final class w1 implements u00.a {
    public final int A;
    public final j2 B;

    public w1(j2 j2Var, int i10) {
        this.A = i10;
        this.B = j2Var;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                return this.B.Q.f135a.d().C.toString();
            case 1:
                j2 j2Var = this.B;
                if (!j2Var.H1()) {
                    z.g0 g0Var = j2Var.f60b0;
                    if (g0Var.N) {
                        g0Var.V.I1(7);
                    }
                }
                j2Var.S.x(b1.k0.C);
                return Boolean.TRUE;
            case 2:
                j2 j2Var2 = this.B;
                a40.c0.y(j2Var2.p1(), (k00.i) null, (a40.a0) null, new b2(j2Var2, null, 0), 3);
                return Boolean.TRUE;
            case 3:
                j2 j2Var3 = this.B;
                a40.c0.y(j2Var3.p1(), (k00.i) null, (a40.a0) null, new b2(j2Var3, null, 1), 3);
                return Boolean.TRUE;
            case 4:
                l1.q2 q2Var = c3.o1.f2745u;
                j2 j2Var4 = this.B;
                j2Var4.f64f0 = (g3) b3.m.h(j2Var4, q2Var);
                j2Var4.S.f1943d = j2Var4.H1();
                k00.c cVar = null;
                if (j2Var4.H1() && j2Var4.f65g0 == null) {
                    j2Var4.f65g0 = a40.c0.y(j2Var4.p1(), (k00.i) null, (a40.a0) null, new b2(j2Var4, cVar, 4), 3);
                } else if (!j2Var4.H1()) {
                    a40.u1 u1Var = j2Var4.f65g0;
                    if (u1Var != null) {
                        u1Var.i((CancellationException) null);
                    }
                    j2Var4.f65g0 = null;
                }
                return g00.b0.a;
            case 5:
                b3.m.u(this.B);
                return g00.b0.a;
            case 6:
                b3.m.u(this.B);
                return g00.b0.a;
            case 7:
                b0.a.a(this.B);
                return null;
            case 8:
                b0.a.a(this.B);
                return v1.f134a;
            case 9:
                j2 j2Var5 = this.B;
                a40.c0.y(j2Var5.p1(), (k00.i) null, (a40.a0) null, new b2(j2Var5, null, 2), 3);
                return Boolean.TRUE;
            case 10:
                j2 j2Var6 = this.B;
                if (j2Var6.H1()) {
                    ((c3.p1) j2Var6.J1()).b();
                } else {
                    z.g0 g0Var2 = j2Var6.f60b0;
                    if (g0Var2.N) {
                        g0Var2.V.I1(7);
                    }
                }
                return Boolean.TRUE;
            case 11:
                j2 j2Var7 = this.B;
                if (j2Var7.f69k0 != null) {
                    ((c3.p1) j2Var7.J1()).b();
                } else {
                    j2Var7.K1(true);
                }
                return g00.b0.a;
            default:
                this.B.S.x(b1.k0.C);
                return g00.b0.a;
        }
    }
}
