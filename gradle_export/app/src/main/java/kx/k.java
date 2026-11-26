package kx;

import g00.b0;
import i2.t;
import l1.g0;
import u00.o;
import w.d0;

public final class k implements o {
    public final int A;
    public final u00.k B;
    public final kk.c C;

    public k(u00.k kVar, kk.c cVar, int i) {
        this.A = i;
        this.B = kVar;
        this.C = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                d0 AnimatedVisibility = (d0) obj;
                g0 g0Var = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                p0.e eVar = p0.f.a;
                float f = 0;
                float f2 = 44;
                long jB = t.b(0.5f, dl.a.P);
                g0 g0Var2 = g0Var;
                u00.k kVar = this.B;
                boolean zG = g0Var2.g(kVar);
                Object objN = g0Var2.N();
                if (zG || objN == l1.i.a) {
                    objN = new jz.t(8, kVar);
                    g0Var2.n0(objN);
                }
                w50.c.f((u00.a) objN, this.C, null, false, false, 0.0f, new y3.f(f2), 0L, jB, 10.0f, eVar, f, a.c, g0Var, 806879232, 432, 188);
                break;
            default:
                d0 AnimatedVisibility2 = (d0) obj;
                g0 g0Var3 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility2, "$this$AnimatedVisibility");
                p0.e eVar2 = p0.f.a;
                float f3 = 0;
                float f4 = 44;
                long jB2 = t.b(0.5f, dl.a.P);
                g0 g0Var4 = g0Var3;
                u00.k kVar2 = this.B;
                boolean zG2 = g0Var4.g(kVar2);
                Object objN2 = g0Var4.N();
                if (zG2 || objN2 == l1.i.a) {
                    objN2 = new qt.h(3, kVar2);
                    g0Var4.n0(objN2);
                }
                w50.c.f((u00.a) objN2, this.C, null, false, false, 0.0f, new y3.f(f4), 0L, jB2, 10.0f, eVar2, f3, rx.a.b, g0Var3, 806879232, 432, 188);
                break;
        }
        return b0.a;
    }
}
