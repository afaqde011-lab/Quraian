package kx;

import b2.r;
import g00.b0;
import h0.z1;
import i2.t;
import jx.s;
import l1.g0;
import l1.p2;
import u00.o;
import w.c0;
import w.d0;
import w.x0;
import w.y0;

public final class d implements o {
    public final int A = 1;
    public final s B;
    public final y3.c C;
    public final u00.k D;
    public final p2 E;

    public d(s sVar, y3.c cVar, u00.k kVar, p2 p2Var) {
        this.B = sVar;
        this.C = cVar;
        this.D = kVar;
        this.E = p2Var;
    }

    public d(y3.c cVar, u00.k kVar, s sVar, p2 p2Var) {
        this.C = cVar;
        this.D = kVar;
        this.B = sVar;
        this.E = p2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                d0 AnimatedVisibility = (d0) obj;
                g0 g0Var = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                r rVarE = h0.c.E(z1.d(b2.o.A, 1.0f), 0.0f, 16, 1);
                g0 g0Var2 = g0Var;
                y3.c cVar = this.C;
                boolean zG = g0Var2.g(cVar);
                u00.k kVar = this.D;
                boolean zG2 = zG | g0Var2.g(kVar);
                Object objN = g0Var2.N();
                if (zG2 || objN == l1.i.a) {
                    objN = new jk.i(cVar, kVar, 1);
                    g0Var2.n0(objN);
                }
                a.f(this.B.c, z2.d0.o(rVarE, (u00.k) objN), ((t) this.E.getValue()).a, g0Var, 48);
                break;
            default:
                k0.k item = (k0.k) obj;
                g0 g0Var3 = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    s sVar = this.B;
                    c0.c(true ^ sVar.g, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(1420817260, new d(this.C, this.D, sVar, this.E), g0Var3), g0Var3, 196608, 30);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return b0.a;
    }
}
