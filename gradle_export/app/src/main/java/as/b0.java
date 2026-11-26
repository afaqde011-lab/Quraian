package as;

import android.content.Context;
import h0.z1;
import java.util.List;
import ur.d1;
import ur.h1;

public final class b0 implements u00.o {
    public final int A;
    public final float B;
    public final Object C;
    public final Object D;
    public final Object E;

    public b0(Object obj, Object obj2, float f, Object obj3, int i) {
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.B = f;
        this.E = obj3;
    }

    public b0(h1 h1Var, u00.k kVar, l1.z0 z0Var, float f) {
        this.A = 2;
        this.C = h1Var;
        this.D = kVar;
        this.E = z0Var;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                g2.t tVar = (g2.t) this.C;
                u00.k kVar = (u00.k) this.D;
                u0 u0Var = (u0) this.E;
                j0.b item = (j0.b) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b2.r rVarJ = g2.d.j(b2.o.A, tVar);
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    Object obj4 = l1.i.a;
                    if (zG || objN == obj4) {
                        objN = new d0(0, kVar);
                        g0Var2.n0(objN);
                    }
                    b2.r rVarE = z1.e(h0.c.G(h0.c.E(g2.d.s(rVarJ, (u00.k) objN), this.B, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12, 7), 40);
                    String str = u0Var.h;
                    boolean zG2 = g0Var2.g(kVar);
                    Object objN2 = g0Var2.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new d0(1, kVar);
                        g0Var2.n0(objN2);
                    }
                    ox.a.f(rVarE, str, (u00.k) objN2, 2131887116, g0Var, 0, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 1:
                List list = (List) this.C;
                qn.a aVar = (qn.a) this.D;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.E;
                j6.g Column = (j6.g) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(Column, "$this$Column");
                b6.k kVar2 = b6.k.a;
                ta.c0.d(ze.d.v(kVar2), 0, v1.d.d(1607509306, new pn.b(aVar, this.B, 0), g0Var3), g0Var3, 3072, 2);
                a.a.f(ze.d.D(kVar2, 14), g0Var3, 0);
                l1.g0 g0Var4 = g0Var3;
                String string = ((Context) g0Var4.k(b6.g.b)).getString(2131887379);
                kotlin.jvm.internal.m.d(string, "getString(...)");
                kh.n.r(string, (b6.m) null, (y3.f) null, g0Var3, 0, 6);
                float f = 8;
                a.a.f(ze.d.D(kVar2, f), g0Var3, 0);
                if (list.isEmpty()) {
                    g0Var4.c0(-1444994431);
                    va.a.b(Column.a(ze.d.v(kVar2)), j6.c.d, pn.a.a, g0Var3, 384, 0);
                    g0Var4.r(false);
                } else {
                    g0Var4.c0(-1445373375);
                    g0Var4.c0(646112346);
                    int i = 0;
                    for (Object obj5 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            va.a.k0();
                            throw null;
                        }
                        qn.a aVar2 = (qn.a) obj5;
                        if (i > 0) {
                            g0Var4.c0(-97036530);
                            a.a.f(ze.d.D(kVar2, f), g0Var3, 0);
                            g0Var4.r(false);
                        } else {
                            g0Var4.c0(-96946196);
                            g0Var4.r(false);
                        }
                        pn.d.b(aVar2, wVar.A, null, g0Var3, 0);
                        i = i2;
                    }
                    g0Var4.r(false);
                    a.a.f(Column.a(kVar2), g0Var3, 0);
                    g0Var4.r(false);
                }
                return g00.b0.a;
            default:
                h1 h1Var = (h1) this.C;
                u00.k kVar3 = (u00.k) this.D;
                l1.z0 z0Var = (l1.z0) this.E;
                j0.b item2 = (j0.b) obj;
                l1.g0 g0Var5 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                l1.g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    u30.b bVar = h1Var.D;
                    String str2 = h1Var.E;
                    String str3 = h1Var.F;
                    String str4 = h1Var.G;
                    String str5 = h1Var.H;
                    boolean zG3 = g0Var6.g(kVar3);
                    Object objN3 = g0Var6.N();
                    Object obj6 = l1.i.a;
                    if (zG3 || objN3 == obj6) {
                        objN3 = new d1(0, kVar3);
                        g0Var6.n0(objN3);
                    }
                    u00.a aVar3 = (u00.a) objN3;
                    boolean zG4 = g0Var6.g(kVar3);
                    Object objN4 = g0Var6.N();
                    if (zG4 || objN4 == obj6) {
                        objN4 = new d1(1, kVar3);
                        g0Var6.n0(objN4);
                    }
                    u00.a aVar4 = (u00.a) objN4;
                    boolean zG5 = g0Var6.g(z0Var);
                    Object objN5 = g0Var6.N();
                    if (zG5 || objN5 == obj6) {
                        objN5 = new ct.k(z0Var, 25);
                        g0Var6.n0(objN5);
                    }
                    u00.a aVar5 = (u00.a) objN5;
                    boolean zG6 = g0Var6.g(kVar3);
                    Object objN6 = g0Var6.N();
                    if (zG6 || objN6 == obj6) {
                        objN6 = new d1(2, kVar3);
                        g0Var6.n0(objN6);
                    }
                    u00.a aVar6 = (u00.a) objN6;
                    boolean zG7 = g0Var6.g(kVar3);
                    Object objN7 = g0Var6.N();
                    if (zG7 || objN7 == obj6) {
                        objN7 = new d1(3, kVar3);
                        g0Var6.n0(objN7);
                    }
                    u00.a aVar7 = (u00.a) objN7;
                    boolean zG8 = g0Var6.g(kVar3);
                    Object objN8 = g0Var6.N();
                    if (zG8 || objN8 == obj6) {
                        objN8 = new d1(4, kVar3);
                        g0Var6.n0(objN8);
                    }
                    wr.k.l(bVar, str2, str3, str4, str5, aVar3, aVar4, aVar5, aVar6, aVar7, (u00.a) objN8, null, this.B, g0Var5, 0);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
        }
    }
}
