package w0;

import a1.q1;
import b2.r;
import b3.m;
import e1.o0;
import e1.q0;
import gz.e1;
import u.d0;
import u00.n;
import z2.a0;

public abstract class h {
    public static final r a(r rVar, n nVar) {
        return rVar.V(new b(nVar));
    }

    public static final t0.c b(b3.k kVar) {
        t0.f fVar;
        s0.a aVar = new s0.a();
        m.B(kVar, d.f15827a, new q0.a(new q0.a(aVar, 17), new e1(1, aVar, s0.a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 24), 18));
        d0 d0Var = new d0();
        d0 d0Var2 = aVar.f13618a;
        Object[] objArr = d0Var2.f14837a;
        int i10 = d0Var2.f14838b;
        int i11 = 0;
        boolean z10 = true;
        t0.b bVar = null;
        while (true) {
            fVar = t0.f.f14322b;
            if (i11 >= i10) {
                break;
            }
            t0.b bVar2 = (t0.b) objArr[i11];
            if (!z10 || bVar2 != fVar) {
                if (bVar2 == fVar && bVar == fVar) {
                    z10 = false;
                } else {
                    if (bVar2 != fVar) {
                        d0 d0Var3 = aVar.f13619b;
                        Object[] objArr2 = d0Var3.f14837a;
                        int i12 = d0Var3.f14838b;
                        int i13 = 0;
                        while (true) {
                            if (i13 < i12) {
                                if (((Boolean) ((u00.k) objArr2[i13]).invoke(bVar2)).booleanValue()) {
                                    i13++;
                                } else {
                                    z10 = false;
                                }
                            }
                        }
                    }
                    d0Var.a(bVar2);
                    z10 = false;
                    bVar = bVar2;
                }
            }
            i11++;
        }
        if (((t0.b) (d0Var.h() ? null : d0Var.f14837a[d0Var.f14838b - 1])) == fVar) {
            d0Var.k(d0Var.f14838b - 1);
        }
        m1.b bVar3 = d0Var.f14839c;
        if (bVar3 == null) {
            bVar3 = new m1.b(d0Var, 1);
            d0Var.f14839c = bVar3;
        }
        return new t0.c(bVar3);
    }

    public static final r c(n nVar) {
        return new e(nVar);
    }

    public static final r d(r rVar, l lVar, q1 q1Var, q0 q0Var, o0 o0Var) {
        return rVar.V(new i(lVar, q1Var, q0Var, o0Var));
    }

    public static final h2.c e(h2.c cVar, a0 a0Var, a0 a0Var2) {
        if (!a0Var.A() || !a0Var2.A()) {
            return h2.c.f6545e;
        }
        return bi.b.g(a0Var2.V(z2.d0.i(a0Var), cVar.e()), cVar.d());
    }
}
