package bt;

import c3.t2;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g1.z6;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import l1.p2;

public final class m0 implements u00.o {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public m0(hx.x xVar, gm.a aVar, h0.t0 t0Var, h0.n1 n1Var, j1.r rVar) {
        this.A = 3;
        this.E = xVar;
        this.C = aVar;
        this.B = t0Var;
        this.D = n1Var;
        this.F = rVar;
    }

    public m0(Object obj, Object obj2, Object obj3, g00.e eVar, Object obj4, int i) {
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.B = eVar;
        this.F = obj4;
    }

    public m0(Object obj, u00.k kVar, p2 p2Var, Object obj2, Object obj3, int i) {
        this.A = i;
        this.C = obj;
        this.B = kVar;
        this.D = p2Var;
        this.E = obj2;
        this.F = obj3;
    }

    public m0(ry.a aVar, ArrayList arrayList, u00.k kVar, u00.a aVar2, b2.r rVar) {
        this.A = 1;
        this.C = aVar;
        this.D = arrayList;
        this.B = kVar;
        this.E = aVar2;
        this.F = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        boolean zG;
        Object objN;
        float fC;
        String str;
        qo.a0 a0Var;
        switch (this.A) {
            case 0:
                gm.a aVar = (gm.a) this.C;
                h0.n1 n1Var = (h0.n1) this.D;
                a1 a1Var = (a1) this.E;
                u00.k kVar = (u00.k) this.B;
                ct.b bVar = (ct.b) this.F;
                j0.b item = (j0.b) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f = 16;
                    b2.r rVarC = f2.h.c(b2.o.A, p0.f.c(f, f, 0.0f, 0.0f, 12));
                    float fC2 = aVar == gm.a.A ? n1Var.c() : 24;
                    ys.b bVar2 = a1Var.k;
                    ys.c cVar = a1Var.a;
                    boolean z = a1Var.w;
                    boolean z2 = a1Var.x;
                    boolean zG2 = g0Var2.g(kVar);
                    Object objN2 = g0Var2.N();
                    if (zG2 || objN2 == l1.i.a) {
                        objN2 = new as.d0(5, kVar);
                        g0Var2.n0(objN2);
                    }
                    ab.a0.c(fC2, bVar2, (u00.k) objN2, rVarC, cVar, z, z2, bVar, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 1:
                ry.a aVar2 = (ry.a) this.C;
                ArrayList arrayList = (ArrayList) this.D;
                u00.k kVar2 = (u00.k) this.B;
                u00.a aVar3 = (u00.a) this.E;
                b2.r rVar = (b2.r) this.F;
                j0.b item2 = (j0.b) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z3 = !arrayList.isEmpty();
                    boolean zG3 = g0Var4.g(kVar2) | g0Var4.g(aVar2);
                    Object objN3 = g0Var4.N();
                    if (zG3 || objN3 == l1.i.a) {
                        objN3 = new cz.i(kVar2, aVar2, 1);
                        g0Var4.n0(objN3);
                    }
                    cz.a.a(aVar2, z3, (u00.a) objN3, aVar3, rVar, g0Var3, 0);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            case 2:
                bv.o1 o1Var = (bv.o1) this.C;
                u00.k kVar3 = (u00.k) this.B;
                p2 p2Var = (p2) this.D;
                p2 p2Var2 = (p2) this.E;
                p2 p2Var3 = (p2) this.F;
                h0.w1 ActionGroupContainer = (h0.w1) obj;
                l1.g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ActionGroupContainer, "$this$ActionGroupContainer");
                l1.g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    m2.b bVarR = y3.R(2131231381, g0Var5, 0);
                    boolean z4 = o1Var.R;
                    long j = dl.a.i;
                    long jB = i2.t.b(((Number) p2Var.getValue()).floatValue(), j);
                    float f2 = gv.s.b;
                    float f3 = gv.s.c;
                    boolean zG4 = g0Var6.g(kVar3);
                    Object objN4 = g0Var6.N();
                    Object obj5 = l1.i.a;
                    if (zG4 || objN4 == obj5) {
                        objN4 = new fy.r(5, kVar3);
                        g0Var6.n0(objN4);
                    }
                    gv.p.i(bVarR, jB, z4, (u00.a) objN4, null, false, f2, f3, 0L, g0Var5, 14155784, RCHTTPStatusCodes.NOT_MODIFIED);
                    m2.b bVarR2 = y3.R(2131231190, g0Var5, 0);
                    boolean z5 = o1Var.C;
                    long jB2 = i2.t.b(((Number) p2Var2.getValue()).floatValue(), j);
                    boolean z6 = o1Var.D;
                    boolean zG5 = g0Var6.g(o1Var) | g0Var6.g(kVar3);
                    Object objN5 = g0Var6.N();
                    if (zG5) {
                        obj4 = obj5;
                    } else {
                        obj4 = obj5;
                        if (objN5 == obj4) {
                        }
                        Object obj6 = obj4;
                        gv.p.i(bVarR2, jB2, z5, (u00.a) objN5, null, z6, f2, f3, 0L, g0Var5, 14155784, 272);
                        m2.b bVarR3 = y3.R(2131231206, g0Var5, 0);
                        boolean z7 = o1Var.v;
                        long jB3 = i2.t.b(((Number) p2Var3.getValue()).floatValue(), j);
                        zG = g0Var6.g(kVar3);
                        objN = g0Var6.N();
                        if (zG || objN == obj6) {
                            objN = new fy.r(6, kVar3);
                            g0Var6.n0(objN);
                        }
                        gv.p.i(bVarR3, jB3, z7, (u00.a) objN, null, false, f2, f3, 0L, g0Var5, 14155784, RCHTTPStatusCodes.NOT_MODIFIED);
                    }
                    objN5 = new gv.q(o1Var, kVar3, 0);
                    g0Var6.n0(objN5);
                    Object obj7 = obj4;
                    gv.p.i(bVarR2, jB2, z5, (u00.a) objN5, null, z6, f2, f3, 0L, g0Var5, 14155784, 272);
                    m2.b bVarR4 = y3.R(2131231206, g0Var5, 0);
                    boolean z8 = o1Var.v;
                    long jB4 = i2.t.b(((Number) p2Var3.getValue()).floatValue(), j);
                    zG = g0Var6.g(kVar3);
                    objN = g0Var6.N();
                    if (zG) {
                        objN = new fy.r(6, kVar3);
                        g0Var6.n0(objN);
                    } else {
                        objN = new fy.r(6, kVar3);
                        g0Var6.n0(objN);
                    }
                    gv.p.i(bVarR4, jB4, z8, (u00.a) objN, null, false, f2, f3, 0L, g0Var5, 14155784, RCHTTPStatusCodes.NOT_MODIFIED);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case 3:
                hx.x xVar = (hx.x) this.E;
                gm.a aVar4 = (gm.a) this.C;
                h0.t0 t0Var = (h0.t0) this.B;
                h0.n1 n1Var2 = (h0.n1) this.D;
                j1.r rVar2 = (j1.r) this.F;
                h0.r PullToRefreshBox = (h0.r) obj;
                l1.g0 g0Var7 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= g0Var7.g(PullToRefreshBox) ? 4 : 2;
                }
                l1.g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    j1.h hVar = j1.h.a;
                    b2.r rVarA = PullToRefreshBox.a(b2.o.A, b2.b.B);
                    boolean z9 = xVar.a;
                    int iOrdinal = aVar4.ordinal();
                    if (iOrdinal == 0) {
                        fC = j1.h.d + t0Var.c();
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fC = n1Var2.c() + t0Var.c() + j1.h.d;
                    }
                    hVar.a(rVar2, z9, rVarA, 0L, 0L, fC, g0Var7, 0, 24);
                } else {
                    g0Var8.V();
                }
                return g00.b0.a;
            case 4:
                jp.x xVar2 = (jp.x) this.C;
                u00.k kVar4 = (u00.k) this.B;
                p2 p2Var4 = (p2) this.D;
                t2 t2Var = (t2) this.E;
                g2.t tVar = (g2.t) this.F;
                h0.w AuthScreenScaffold = (h0.w) obj;
                l1.g0 g0Var9 = (l1.j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(AuthScreenScaffold, "$this$AuthScreenScaffold");
                l1.g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    z6.b(z3.U(g0Var9, 2131886172), (b2.r) null, dl.a.n, ((Boolean) g0Var10.k(tp.h.a)).booleanValue() ? kh.o.z(28) : kh.o.z(32), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var9, 1572864, 48, 260010);
                    b2.o oVar = b2.o.A;
                    h0.c.h(h0.z1.e(oVar, 8), g0Var9);
                    b2.r rVarD = h0.z1.d(oVar, 1.0f);
                    String str2 = xVar2.f;
                    String str3 = xVar2.g;
                    String strU = z3.U(g0Var9, 2131886205);
                    boolean z11 = str3 != null;
                    r3.q qVar = new r3.q();
                    q0.i1 i1Var = new q0.i1(0, 7, 7, 115);
                    boolean zG6 = g0Var10.g(kVar4);
                    Object objN6 = g0Var10.N();
                    Object obj8 = l1.i.a;
                    if (zG6 || objN6 == obj8) {
                        objN6 = new hv.j(28, kVar4);
                        g0Var10.n0(objN6);
                    }
                    u00.k kVar5 = (u00.k) objN6;
                    boolean zG7 = g0Var10.g(p2Var4) | g0Var10.g(t2Var) | g0Var10.g(kVar4);
                    Object objN7 = g0Var10.N();
                    if (zG7 || objN7 == obj8) {
                        objN7 = new ez.o(t2Var, kVar4, p2Var4, 2);
                        g0Var10.n0(objN7);
                    }
                    up.i.e(str2, kVar5, rVarD, strU, null, false, z11, false, false, qVar, i1Var, (u00.a) objN7, null, null, tVar, g0Var9, 384, 196656, 25520);
                    if (str3 == null) {
                        g0Var10.c0(1885366002);
                        g0Var10.r(false);
                    } else {
                        g0Var10.c0(1885366003);
                        z6.b(str3, (b2.r) null, dl.a.U, kh.o.z(12), q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var9, 1597440, 0, 262058);
                        g0Var10.r(false);
                    }
                    boolean z12 = !xVar2.a;
                    boolean zG8 = g0Var10.g(kVar4);
                    Object objN8 = g0Var10.N();
                    if (zG8 || objN8 == obj8) {
                        objN8 = new jz.t(14, kVar4);
                        g0Var10.n0(objN8);
                    }
                    z6.b(z3.U((l1.j) r40, 2131886173), w50.c.o(oVar, z12, null, (u00.a) objN8, 6), dl.a.H, kh.o.z(15), q3.u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var9, 1597440, 0, 262056);
                } else {
                    g0Var10.V();
                }
                return g00.b0.a;
            case 5:
                String str4 = (String) this.C;
                String str5 = (String) this.D;
                m3.r0 r0Var = (m3.r0) this.E;
                u00.a aVar5 = (u00.a) this.B;
                m3.p0 p0Var = (m3.p0) this.F;
                h0.t BoxWithConstraints = (h0.t) obj;
                l1.g0 g0Var11 = (l1.j) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                int i = 2;
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= g0Var11.g(BoxWithConstraints) ? 4 : 2;
                }
                l1.g0 g0Var12 = g0Var11;
                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    long jB5 = y3.b.b(0, y3.a.h(BoxWithConstraints.b), 0, 0, 13);
                    boolean zG9 = g0Var12.g(str4) | g0Var12.g(str5) | g0Var12.f(jB5) | g0Var12.g(r0Var);
                    Object objN9 = g0Var12.N();
                    String str6 = " ";
                    if (zG9 || objN9 == l1.i.a) {
                        if (m3.p0.a(p0Var, str4, r0Var, 2, jB5, 972).d()) {
                            int length = str4.length();
                            int i2 = 0;
                            while (i2 < length) {
                                int i3 = ((i2 + length) + 1) / i;
                                String candidate = qo.z.h(i3, str4) + str6 + str5;
                                kotlin.jvm.internal.m.e(candidate, "candidate");
                                String str7 = str6;
                                jB5 = jB5;
                                int i4 = i2;
                                m3.r0 r0Var2 = r0Var;
                                m3.p0 p0Var2 = p0Var;
                                m3.n0 n0VarA = m3.p0.a(p0Var2, candidate, r0Var2, 2, jB5, 972);
                                p0Var = p0Var2;
                                r0Var = r0Var2;
                                if (n0VarA.d()) {
                                    length = i3 - 1;
                                    i2 = i4;
                                } else {
                                    i2 = i3;
                                }
                                str6 = str7;
                                i = 2;
                            }
                            str = str6;
                            a0Var = new qo.a0(qo.z.h(i2, str4), true);
                        } else {
                            a0Var = new qo.a0(str4, false);
                            str = " ";
                        }
                        objN9 = a0Var;
                        g0Var12.n0(objN9);
                    } else {
                        str = " ";
                    }
                    qo.a0 a0Var2 = (qo.a0) objN9;
                    m3.e eVar = new m3.e();
                    eVar.b(a0Var2.a);
                    if (a0Var2.b) {
                        eVar.b(str);
                        m3.d dVar = new m3.d(new m3.m(str5, (m3.o0) null, new ox.e(1, aVar5)), eVar.A.length(), 0, 12);
                        ArrayList arrayList2 = eVar.B;
                        arrayList2.add(dVar);
                        eVar.C.add(dVar);
                        int size = arrayList2.size() - 1;
                        try {
                            int iE = eVar.e(new m3.i0(dl.a.m, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (i2.s0) null, 65534));
                            try {
                                eVar.b(str5);
                                eVar.d(iE);
                                eVar.d(size);
                            } catch (Throwable th) {
                                eVar.d(iE);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            eVar.d(size);
                            throw th2;
                        }
                    }
                    z6.c(eVar.f(), (b2.r) null, 0L, 0L, (q3.u) null, 0L, (x3.k) null, 0L, 2, false, 2, 0, (Map) null, (u00.k) null, r0Var, g0Var11, 0, 24960, 241662);
                } else {
                    g0Var12.V();
                }
                return g00.b0.a;
            default:
                ot.b bVar3 = (ot.b) this.C;
                rt.g gVar = (rt.g) this.D;
                u00.a aVar6 = (u00.a) this.E;
                u00.k kVar6 = (u00.k) this.B;
                u00.a aVar7 = (u00.a) this.F;
                j0.b item3 = (j0.b) obj;
                l1.g0 g0Var13 = (l1.j) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item3, "$this$item");
                l1.g0 g0Var14 = g0Var13;
                if (g0Var14.S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    st.j.f(z3.U(g0Var13, 2131887094), v1.d.d(-1796270406, new cz.g(bVar3, gVar, aVar6, kVar6, aVar7), g0Var13), g0Var13, 48);
                } else {
                    g0Var14.V();
                }
                return g00.b0.a;
        }
    }
}
