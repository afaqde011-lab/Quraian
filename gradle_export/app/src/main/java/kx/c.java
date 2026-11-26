package kx;

import b2.r;
import g00.b0;
import jz.t;
import l1.g0;
import l1.p2;
import u00.o;
import w.d0;

public final class c implements o {
    public final int A;
    public final u00.k B;
    public final p2 C;

    public c(u00.k kVar, p2 p2Var, int i) {
        this.A = i;
        this.B = kVar;
        this.C = p2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d0 AnimatedVisibility = (d0) obj;
        switch (this.A) {
            case 0:
                g0 g0Var = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, 16, 7);
                boolean zBooleanValue = ((Boolean) this.C.getValue()).booleanValue();
                g0 g0Var2 = g0Var;
                u00.k kVar = this.B;
                boolean zG = g0Var2.g(kVar);
                Object objN = g0Var2.N();
                if (zG || objN == l1.i.a) {
                    objN = new t(6, kVar);
                    g0Var2.n0(objN);
                }
                a.o(3456, rVarG, null, g0Var, (u00.a) objN, zBooleanValue);
                break;
            default:
                g0 g0Var3 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                r rVarG2 = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, 16, 7);
                boolean zBooleanValue2 = ((Boolean) this.C.getValue()).booleanValue();
                g0 g0Var4 = g0Var3;
                u00.k kVar2 = this.B;
                boolean zG2 = g0Var4.g(kVar2);
                Object objN2 = g0Var4.N();
                if (zG2 || objN2 == l1.i.a) {
                    objN2 = new qt.h(6, kVar2);
                    g0Var4.n0(objN2);
                }
                rx.a.g((u00.a) objN2, zBooleanValue2, false, rVarG2, null, g0Var3, 3456, 16);
                break;
        }
        return b0.a;
    }
}
