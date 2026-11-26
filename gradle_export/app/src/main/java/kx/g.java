package kx;

import b2.o;
import ev.q;
import g00.b0;
import h00.d0;
import h00.r;
import java.util.ArrayList;
import java.util.List;
import jx.s;
import l1.g0;
import u00.p;
import x.q1;

public final class g implements p {
    public final int A;
    public final List B;
    public final u00.k C;
    public final float D;
    public final Object E;

    public g(List list, Object obj, u00.k kVar, float f, int i) {
        this.A = i;
        this.B = list;
        this.E = obj;
        this.C = kVar;
        this.D = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A) {
            case 0:
                k0.k kVar = (k0.k) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (l1.j) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                s sVar = (s) this.E;
                int i = (iIntValue2 & 6) == 0 ? (g0Var.g(kVar) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i |= g0Var.e(iIntValue) ? 32 : 16;
                }
                g0 g0Var2 = g0Var;
                if (g0Var2.S(i & 1, (i & 147) != 146)) {
                    fx.b bVar = (fx.b) this.B.get(iIntValue);
                    g0Var2.c0(1029869673);
                    q1 q1Var = h.a;
                    q1 q1Var2 = h.b;
                    kVar.getClass();
                    o mVar = (q1Var == null && q1Var2 == null && q1Var == null) ? o.A : new l0.m(q1Var, q1Var2, q1Var);
                    u30.b bVar2 = sVar.d;
                    ArrayList arrayList = new ArrayList(r.q0(bVar2, 10));
                    int i2 = 0;
                    for (Object obj5 : bVar2) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            va.a.k0();
                            throw null;
                        }
                        arrayList.add(new g00.k(Integer.valueOf(((fx.b) obj5).a), Integer.valueOf(i3)));
                        i2 = i3;
                    }
                    int iIntValue3 = ((Number) d0.O(d0.Y(arrayList), Integer.valueOf(bVar.a))).intValue();
                    boolean z = sVar.k;
                    u30.b bVar3 = sVar.l;
                    u00.k kVar2 = this.C;
                    boolean zG = g0Var2.g(kVar2) | g0Var2.g(bVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.a) {
                        objN = new a20.a(kVar2, bVar, 25);
                        g0Var2.n0(objN);
                    }
                    a.m(bVar, iIntValue3, z, bVar3, (u00.a) objN, mVar, new y3.f(this.D), g0Var, 0);
                    g0Var2.r(false);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            default:
                k0.k kVar3 = (k0.k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                g0 g0Var3 = (l1.j) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                int i4 = (iIntValue5 & 6) == 0 ? (g0Var3.g(kVar3) ? 4 : 2) | iIntValue5 : iIntValue5;
                if ((iIntValue5 & 48) == 0) {
                    i4 |= g0Var3.e(iIntValue4) ? 32 : 16;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(i4 & 1, (i4 & 147) != 146)) {
                    bx.c cVar = (bx.c) this.B.get(iIntValue4);
                    g0Var4.c0(-1958269408);
                    boolean z2 = cVar.f;
                    qx.o oVar = (qx.o) this.E;
                    boolean z3 = oVar.l;
                    u30.b bVarE = ze.d.E(oVar.m);
                    u00.k kVar4 = this.C;
                    boolean zG2 = g0Var4.g(kVar4) | g0Var4.i(cVar);
                    Object objN2 = g0Var4.N();
                    if (zG2 || objN2 == l1.i.a) {
                        objN2 = new q(kVar4, cVar, 3);
                        g0Var4.n0(objN2);
                    }
                    f50.k.d(cVar, (u00.a) objN2, z3, z2, bVarE, null, new y3.f(this.D), g0Var3, 8, 32);
                    g0Var4.r(false);
                } else {
                    g0Var4.V();
                }
                return b0.a;
        }
    }
}
