package w;

import java.util.Collection;
import java.util.List;

public final class u1 implements z2.t0 {
    public final z2.t0 A;
    public final a40.z B;
    public z2.a0 E;
    public z2.a0 F;
    public final l1.i1 C = l1.q.z(Boolean.FALSE);
    public final y D = new y(this, 1);
    public final z1.p G = new z1.p();
    public final z1.s H = new z1.s();

    public u1(z2.t0 t0Var, a40.z zVar) {
        this.A = t0Var;
        this.B = zVar;
    }

    public static r1 c(String str, l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.c0(800730162);
        g0Var.c0(-148945892);
        boolean zG = g0Var.g(str);
        Object objN = g0Var.N();
        if (zG || objN == l1.i.f9868a) {
            objN = new r1(str);
            g0Var.n0(objN);
        }
        r1 r1Var = (r1) objN;
        r1Var.f15804b.setValue(m1.f15791a);
        g0Var.r(false);
        g0Var.r(false);
        return r1Var;
    }

    public static b2.r e(u1 u1Var, r1 r1Var, d0 d0Var, oo.k0 k0Var, s1 s1Var, int i10) {
        q1.f15802a.getClass();
        Object obj = s1Var;
        if ((i10 & 64) != 0) {
            obj = x1.f15821a;
        }
        u1Var.getClass();
        return b2.a.a(b2.o.A, new mb.y(r1Var, d0Var.a(), u1Var, obj, k0Var, 1));
    }

    @Override
    public final z2.a0 a(z2.a0 a0Var) {
        return this.A.a(a0Var);
    }

    public final boolean b() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override
    public final long d(z2.a0 a0Var, z2.a0 a0Var2) {
        return this.A.d(a0Var, a0Var2);
    }

    public final void f() {
        Collection<j1> collectionValues = this.H.h().f17051c.values();
        boolean z10 = false;
        for (j1 j1Var : collectionValues) {
            z10 = z10 || (j1Var.a() && j1Var.d());
            j1Var.e();
        }
        if (z10 != b()) {
            this.C.setValue(Boolean.valueOf(z10));
            if (z10) {
                return;
            }
            for (j1 j1Var2 : collectionValues) {
                if (j1Var2.c().size() > 1) {
                    List listC = j1Var2.c();
                    int i10 = l1.f15789a;
                    int size = listC.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            if (((k1) listC.get(i11)).a().b()) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                ba.v0 v0Var = j1Var2.f15782c;
                v0Var.getClass();
                v0Var.f2437a = f2.A;
                v0Var.f2438b = ((l1.f1) v0Var.f2442f).h();
                ((l1.i1) v0Var.f2441e).setValue(c1.f15743a);
            }
        }
    }
}
