package kn;

import android.content.Context;
import b6.g;
import b6.k;
import b6.m;
import dn.l;
import e6.f;
import g00.b0;
import l1.g0;
import l1.j;
import u00.n;
import y3.h;

public final class b implements n {
    public final int A;
    public final l B;
    public final ln.c C;
    public final long D;

    public b(l lVar, ln.c cVar, long j, int i) {
        this.A = i;
        this.B = lVar;
        this.C = cVar;
        this.D = j;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                j jVar = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var = (g0) jVar;
                if (!g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var.V();
                } else {
                    l lVar = this.B;
                    va.a.b(ze.d.m(lVar.a(jVar), f.a(k00.f.U((Context) g0Var.k(g.b)))), (j6.c) null, v1.d.d(-121709452, new b(lVar, this.C, this.D, 1), jVar), jVar, 384, 2);
                }
                break;
            case 1:
                g0 g0Var2 = (j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var3 = g0Var2;
                if (!g0Var3.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    g0Var3.V();
                } else {
                    b6.a aVar = new b6.a(2131231692);
                    k kVar = k.a;
                    w50.c.d(aVar, null, ze.d.u(kVar), 2, null, g0Var2, 48, 16);
                    m mVarU = ze.d.u(kVar);
                    float f = dn.m.a;
                    va.a.b(w50.c.Y(mVarU), (j6.c) null, v1.d.d(-152148526, new b(this.B, this.C, this.D, 2), g0Var2), g0Var2, 384, 2);
                }
                break;
            default:
                g0 g0Var4 = (j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean z = (iIntValue3 & 3) != 2;
                int i2 = 1 & iIntValue3;
                g0 g0Var5 = g0Var4;
                if (!g0Var5.S(i2, z)) {
                    g0Var5.V();
                } else {
                    l lVar2 = l.A;
                    l lVar3 = this.B;
                    ln.c cVar = this.C;
                    if (lVar3 != lVar2) {
                        g0Var5.c0(-185835852);
                        k00.f.b(cVar, g0Var4, 0);
                        g0Var5.r(false);
                    } else {
                        g0Var5.c0(-185842705);
                        long j = this.D;
                        kh.n.g(cVar, p30.f.j0(new y3.f(h.a(j)), new y3.f(h.b(j))).A - (dn.m.b * 2), g0Var4, 0);
                        g0Var5.r(false);
                    }
                }
                break;
        }
        return b0Var;
    }
}
