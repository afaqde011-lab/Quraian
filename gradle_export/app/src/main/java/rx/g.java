package rx;

import b2.r;
import g00.b0;
import h0.z1;
import i2.t;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.p2;
import u00.k;
import u00.o;
import w.c0;
import w.d0;
import w.x0;
import w.y0;

public final class g implements o {
    public final int A = 1;
    public final qx.o B;
    public final y3.c C;
    public final k D;
    public final p2 E;

    public g(qx.o oVar, y3.c cVar, k kVar, p2 p2Var) {
        this.B = oVar;
        this.C = cVar;
        this.D = kVar;
        this.E = p2Var;
    }

    public g(y3.c cVar, k kVar, qx.o oVar, p2 p2Var) {
        this.C = cVar;
        this.D = kVar;
        this.B = oVar;
        this.E = p2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                d0 AnimatedVisibility = (d0) obj;
                g0 g0Var = (j) obj2;
                ((Integer) obj3).getClass();
                m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                r rVarE = h0.c.E(z1.d(b2.o.A, 1.0f), 0.0f, 16, 1);
                g0 g0Var2 = g0Var;
                y3.c cVar = this.C;
                boolean zG = g0Var2.g(cVar);
                k kVar = this.D;
                boolean zG2 = zG | g0Var2.g(kVar);
                Object objN = g0Var2.N();
                if (zG2 || objN == i.a) {
                    objN = new jk.i(cVar, kVar, 6);
                    g0Var2.n0(objN);
                }
                r rVarO = z2.d0.o(rVarE, (k) objN);
                qx.o oVar = this.B;
                a.j(oVar.c, oVar.f, rVarO, ((t) this.E.getValue()).a, g0Var, 0);
                break;
            default:
                k0.k item = (k0.k) obj;
                g0 g0Var3 = (j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.e(item, "$this$item");
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qx.o oVar2 = this.B;
                    c0.c(true ^ oVar2.h, (r) null, (x0) null, (y0) null, (String) null, v1.d.d(-1848622604, new g(this.C, this.D, oVar2, this.E), g0Var3), g0Var3, 196608, 30);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return b0.a;
    }
}
