package nx;

import com.google.android.gms.internal.measurement.z3;
import h0.t1;
import h0.v1;
import l1.m1;
import w.x0;
import w.y0;

public final class g0 implements u00.o {
    public final int A = 0;
    public final boolean B;
    public final boolean C;
    public final g00.e D;
    public final Object E;
    public final Object F;
    public final Object G;

    public g0(gm.a aVar, i0 i0Var, boolean z, boolean z2, bx.c cVar, u00.k kVar) {
        this.E = aVar;
        this.F = i0Var;
        this.B = z;
        this.C = z2;
        this.G = cVar;
        this.D = kVar;
    }

    public g0(boolean z, u00.a aVar, boolean z2, String str, String str2, u00.a aVar2) {
        this.B = z;
        this.E = aVar;
        this.C = z2;
        this.F = str;
        this.G = str2;
        this.D = aVar2;
    }

    public g0(boolean z, u00.a aVar, boolean z2, u00.k kVar, String str, u00.a aVar2) {
        this.B = z;
        this.E = aVar;
        this.C = z2;
        this.D = kVar;
        this.F = str;
        this.G = aVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        switch (this.A) {
            case 0:
                gm.a aVar = (gm.a) this.E;
                i0 i0Var = (i0) this.F;
                bx.c cVar = (bx.c) this.G;
                u00.k kVar = (u00.k) this.D;
                j0.b item = (j0.b) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    int iOrdinal = aVar.ordinal();
                    boolean z2 = this.B;
                    boolean z3 = this.C;
                    Object obj4 = l1.i.a;
                    if (iOrdinal == 0) {
                        g0Var2.c0(1285177269);
                        boolean z4 = i0Var.h;
                        z = z2 && z3;
                        boolean zG = g0Var2.g(kVar);
                        Object objN = g0Var2.N();
                        if (zG || objN == obj4) {
                            objN = new jz.t(23, kVar);
                            g0Var2.n0(objN);
                        }
                        u00.a aVar2 = (u00.a) objN;
                        boolean zG2 = g0Var2.g(kVar);
                        Object objN2 = g0Var2.N();
                        if (zG2 || objN2 == obj4) {
                            objN2 = new jz.t(24, kVar);
                            g0Var2.n0(objN2);
                        }
                        u00.a aVar3 = (u00.a) objN2;
                        boolean zG3 = g0Var2.g(kVar);
                        Object objN3 = g0Var2.N();
                        if (zG3 || objN3 == obj4) {
                            objN3 = new jz.t(25, kVar);
                            g0Var2.n0(objN3);
                        }
                        u00.a aVar4 = (u00.a) objN3;
                        boolean zG4 = g0Var2.g(kVar);
                        Object objN4 = g0Var2.N();
                        if (zG4 || objN4 == obj4) {
                            objN4 = new jz.t(26, kVar);
                            g0Var2.n0(objN4);
                        }
                        ox.a.h(cVar, z4, z, aVar2, aVar3, aVar4, (u00.a) objN4, null, g0Var, 8);
                        g0Var2.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw oi.k.r(g0Var2, 1285149976, false);
                        }
                        g0Var2.c0(1184989319);
                        b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, 12, 7);
                        boolean z5 = i0Var.h;
                        z = z2 && z3;
                        boolean zG5 = g0Var2.g(kVar);
                        Object objN5 = g0Var2.N();
                        if (zG5 || objN5 == obj4) {
                            objN5 = new jz.t(19, kVar);
                            g0Var2.n0(objN5);
                        }
                        u00.a aVar5 = (u00.a) objN5;
                        boolean zG6 = g0Var2.g(kVar);
                        Object objN6 = g0Var2.N();
                        if (zG6 || objN6 == obj4) {
                            objN6 = new jz.t(20, kVar);
                            g0Var2.n0(objN6);
                        }
                        u00.a aVar6 = (u00.a) objN6;
                        boolean zG7 = g0Var2.g(kVar);
                        Object objN7 = g0Var2.N();
                        if (zG7 || objN7 == obj4) {
                            objN7 = new jz.t(21, kVar);
                            g0Var2.n0(objN7);
                        }
                        u00.a aVar7 = (u00.a) objN7;
                        boolean zG8 = g0Var2.g(kVar);
                        Object objN8 = g0Var2.N();
                        if (zG8 || objN8 == obj4) {
                            objN8 = new jz.t(22, kVar);
                            g0Var2.n0(objN8);
                        }
                        ox.a.e(cVar, z5, z, aVar5, aVar6, aVar7, (u00.a) objN8, rVarG, g0Var, 12582920);
                        g0Var2.r(false);
                    }
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 1:
                u00.a aVar8 = (u00.a) this.E;
                u00.k kVar2 = (u00.k) this.D;
                String str = (String) this.F;
                u00.a aVar9 = (u00.a) this.G;
                h0.w SettingsCardWidget = (h0.w) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(SettingsCardWidget, "$this$SettingsCardWidget");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= g0Var3.g(SettingsCardWidget) ? 4 : 2;
                }
                int i = iIntValue2;
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(i & 1, (i & 19) != 18)) {
                    st.j.h(2131231190, z3.U(g0Var3, 2131887102), this.B, aVar8, false, g0Var3, 0, 16);
                    b2.r rVarG2 = h0.c.G(b2.o.A, 0.0f, st.j.a, 0.0f, 0.0f, 13);
                    v1 v1VarA = t1.a(h0.i.g(8), b2.b.J, g0Var3, 6);
                    int iHashCode = Long.hashCode(g0Var4.T);
                    m1 m1VarM = g0Var4.m();
                    b2.r rVarC = b2.a.c(rVarG2, g0Var3);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar);
                    } else {
                        g0Var4.q0();
                    }
                    l1.q.I(v1VarA, g0Var3, b3.h.f);
                    l1.q.I(m1VarM, g0Var3, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var3, b3.h.g);
                    l1.q.E(g0Var3, b3.h.h);
                    l1.q.I(rVarC, g0Var3, b3.h.d);
                    String strU = z3.U(g0Var3, 2131887099);
                    boolean z6 = this.C;
                    boolean z7 = !z6;
                    boolean zG9 = g0Var4.g(kVar2);
                    Object objN9 = g0Var4.N();
                    Object obj5 = l1.i.a;
                    if (zG9 || objN9 == obj5) {
                        objN9 = new qt.h(12, kVar2);
                        g0Var4.n0(objN9);
                    }
                    st.j.d(0, strU, g0Var3, (u00.a) objN9, z7);
                    String strU2 = z3.U(g0Var3, 2131887100);
                    boolean zG10 = g0Var4.g(kVar2);
                    Object objN10 = g0Var4.N();
                    if (zG10 || objN10 == obj5) {
                        objN10 = new qt.h(13, kVar2);
                        g0Var4.n0(objN10);
                    }
                    st.j.d(0, strU2, g0Var3, (u00.a) objN10, z6);
                    g0Var4.r(true);
                    w.c0.b(SettingsCardWidget, z6, (b2.r) null, (x0) null, (y0) null, (String) null, v1.d.d(341851787, new ix.n(str, aVar9, 2), g0Var3), g0Var3, (i & 14) | 1572864, 30);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            default:
                u00.a aVar10 = (u00.a) this.E;
                String str2 = (String) this.F;
                String str3 = (String) this.G;
                u00.a aVar11 = (u00.a) this.D;
                h0.w SettingsCardWidget2 = (h0.w) obj;
                l1.g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(SettingsCardWidget2, "$this$SettingsCardWidget");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= g0Var5.g(SettingsCardWidget2) ? 4 : 2;
                }
                int i2 = iIntValue3;
                l1.g0 g0Var6 = g0Var5;
                if (g0Var6.S(i2 & 1, (i2 & 19) != 18)) {
                    String strU3 = z3.U(g0Var5, 2131887101);
                    boolean z8 = this.B;
                    st.j.h(2131231402, strU3, z8, aVar10, this.C, g0Var5, 0, 0);
                    w.c0.b(SettingsCardWidget2, z8, (b2.r) null, (x0) null, (y0) null, (String) null, v1.d.d(-141941862, new az.j(str2, str3, aVar11, 22), g0Var5), g0Var5, (i2 & 14) | 1572864, 30);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
        }
    }
}
