package iw;

import b2.o;
import b2.r;
import g00.b0;
import h0.z1;
import java.util.ArrayList;
import java.util.List;
import ju.h;
import l0.m;
import l1.g0;
import l1.i;
import l1.j;
import u00.k;
import u00.p;
import x.b1;
import x.q1;
import x.x;

public final class e implements p {
    public final int A;
    public final k B;
    public final List C;

    public e(List list, k kVar, int i) {
        this.A = i;
        this.C = list;
        this.B = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.A) {
            case 0:
                k0.k kVar = (k0.k) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (j) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (g0Var.g(kVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= g0Var.e(iIntValue) ? 32 : 16;
                }
                g0 g0Var2 = g0Var;
                if (g0Var2.S(i & 1, (i & 147) != 146)) {
                    dw.a aVar = (dw.a) this.C.get(iIntValue);
                    g0Var2.c0(-909079486);
                    r rVarM = h0.c.m(z1.d(o.A, 1.0f), 1.0f);
                    b1 b1VarV = x.c.v(0.0f, 400.0f, (Object) null, 5);
                    long j = 1;
                    b1 b1VarV2 = x.c.v(0.0f, 400.0f, new y3.j((j << 32) | (j & 4294967295L)), 1);
                    b1 b1VarV3 = x.c.v(0.0f, 400.0f, (Object) null, 5);
                    kVar.getClass();
                    r rVarV = rVarM.V(new m(b1VarV, b1VarV2, b1VarV3));
                    k kVar2 = this.B;
                    boolean zG = g0Var2.g(kVar2) | g0Var2.i(aVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == i.a) {
                        objN = new d(kVar2, aVar, 0);
                        g0Var2.n0(objN);
                    }
                    a.b(aVar, (u00.a) objN, rVarV, g0Var, 0);
                    g0Var2.r(false);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                j0.b bVar = (j0.b) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                g0 g0Var3 = (j) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (g0Var3.g(bVar) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= g0Var3.e(iIntValue3) ? 32 : 16;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(i2 & 1, (i2 & 147) != 146)) {
                    h hVar = (h) ((ArrayList) this.C).get(iIntValue3);
                    g0Var4.c0(-1734073310);
                    x.r rVar = x.a;
                    q1 q1VarW = x.c.w(360, 0, rVar, 2);
                    q1 q1VarW2 = x.c.w(360, 0, rVar, 2);
                    q1 q1VarW3 = x.c.w(220, 0, rVar, 2);
                    bVar.getClass();
                    mu.d.o(hVar, this.B, new m(q1VarW, q1VarW2, q1VarW3), g0Var3, 0);
                    g0Var4.r(false);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return b0.a;
    }
}
